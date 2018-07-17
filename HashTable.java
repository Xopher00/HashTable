
import java.util.Arrays;

/*Kris Price
hashtable implementation*/

public class HashTable<K, V> {

	Entry<K, V> table[];

	int Capacity;

	double loadfactor;

	int size = 0;/* initializes number of objects in table */

	Entry<K, V> gONE = new Entry<K, V>(null, null);
	/* create toOmbstone Entry to replace Entries removed from HashTable */

	HashTable() /* default hashtable constructor */ {
		Capacity = 11;/* sets Capacity of HashTable to 11 */
		table = new Entry[Capacity];/*
									 * creates new Entry array of length
									 * Capacity
									 */
		loadfactor = 0.75;/* sets loadfactor of HashTable to 75% */
	}

	HashTable(int initCapacity, double ldfactor) {
		Capacity = initCapacity;/*
								 * sets Capacity of HashTable to integer
								 * specified in parameters
								 */
		table = new Entry[Capacity];/*
									 * creates new Entry array of length
									 * Capacity
									 */
		loadfactor = ldfactor;/*
								 * sets loadfactor of HashTable to double
								 * specified in parameters
								 */
	}

	public int capacity() {
		return table.length;/*
							 * returns length of HashTable, which is also equal
							 * to its Capacity
							 */
	}

	private int hashThis(K key) {
		return Math.abs(key.hashCode() % Capacity);
		/*
		 * * private method for getting a key's hash code- this changes
		 * depending on a HashTable's Capacity
		 */
	}

	public void clear() {
		/* creates new, empty HashTable, sets original HashTable equal to it */
		Entry<K, V> table2[] = new Entry[11];
		table = table2;
		size = 0;
	}

	public boolean containsKey(K key) {
		/* searches table using get(); if get returns null, key isnt in table */
		/*code to work on: this, get()*/
		if (get(key) == null)
			return false;
		else
			return true;
	}

	public int size() {
		return size;/* number of Entries in HashTable */
	}

	public Entry<K, V> get(K key) {
		int hash = hashThis(key);

		while (table[hash] == gONE || (table[hash] != null &&
				!(table[hash].key.equals(key)))){
			//if slot holds gONE object, key might be in next slot. so increment hash if it doesnt but it isnt null and doesnt have the key, also increment hash
			++hash;
			hash %= Capacity;
		}
		if(table[hash] != null && table[hash].key.equals(key))
			return table[hash];
		else
			return null;
	}

	public void remove(K key) {
		/* deletes object from slot in table, replaces with gONE object */
		if (containsKey(key) == false)
			System.out.println("There is no key to remove");
		else
		{
			int hash = hashThis(key);
			while (table[hash] == gONE || !(table[hash].key.equals(key))) {
				++hash;
				hash %= Capacity;
			}
			if (table[hash] != null)
				table[hash] = gONE;
			size--;}
	}

	public void put(K key, V value) {
		++size;/* increments size of HashTable */
		if (size > Capacity * loadfactor)
		/* checks size of hashtable; resizes if it's (loadfactor)% full */
		{
			size = 0;/*
						 * resets size- this will be re-incremented as Entries are
						 * put into new, bigger Hash Table
						 */
			resize();/* calls method that doubles HashTable capacity */
			size++;
		}
		
		int hashCode = hashThis(key);

		while (table[hashCode] != null && table[hashCode] != gONE && !(table[hashCode].key.equals(key)) ) {/*First checks if slot isnt null; then checks if slot doesnt contain gONE; last checks if slot doesnt already contain key*/
			++hashCode;
			hashCode %= Capacity;
		}/*should also put entry in slot where the entry is gONE*/
		
		if(table[hashCode] == null || table[hashCode] == gONE)
			table[hashCode] = new Entry<K, V>(key, value);
		else if(table[hashCode].key == key)//if entry key is already in table, de-increment size, update entry
			{table[hashCode] = new Entry<K, V>(key, value); size--;}
	}

	
	
	public String toString() {//prints the entire hash table
		String x = Arrays.toString(table);
		return x;
	}

	private void resize() {
		Entry<K, V> oldTable[] = table;/*
										 * creates new HashTable to hold values
										 * of non-resized HashTable
										 */
		Capacity *= 2; /* doubles capacity */
		table = new Entry[Capacity];/*
									 * create HashTable twice as big as original
									 */
		for (int i = 0; i < oldTable.length; i++) {/*
													 * map values saved to
													 * oldTable to new table
													 */
			if (oldTable[i] != null && table[i] != gONE)
				put(oldTable[i].key, oldTable[i].value);
		}
		/*
		 * creates new table with different size, maps values from old table to
		 * new one
		 */
	}

}

