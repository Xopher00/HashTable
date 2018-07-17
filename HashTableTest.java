
//hash table tests

public class HashTableTest {
	
	public static void main(String[] args) {

		
		HashTable<Integer, String> TestTable = null;//initialize hash table

		
		System.out.println();
		System.out.println("create a new HashTable using default constructor");
		TestTable = new HashTable<Integer, String>();
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//can table be created?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 1221, birthday in HashTable");//can an entry be put in table correctly?
		TestTable.put(1221, "birthday");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
				
		System.out.println("put 4816, date in HashTable");
		TestTable.put(4816, "date");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//can an entry be put in table correctly?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 57, height in HashTable");
		TestTable.put(57, "height");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//can an entry be put in table correctly?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 20, age in HashTable");
		TestTable.put(20, "age");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//can an entry be put in table correctly?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 7, siblings in HashTable");
		TestTable.put(7, "siblings");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//can an entry be put in table correctly?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 7, stars in HashTable");
		TestTable.put(7, "stars");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//if an entry's key is already in the table, will the respective entry be updated?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 7, stars in HashTable");
		TestTable.put(7, "stars");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//if an entry is already in the table, will nothing happen?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("check if the key:7 is in the HashTable");//If a key is in the table, can it be found?
		if (TestTable.containsKey(7) == true)
			System.out.println("The Entry for " + 7 + " is in the HashTable");
		else
			System.out.println("There is no Entry in the HashTable with a key: " + 7);
		System.out.println();
		
		System.out.println("remove 4816, date from HashTable");		
		TestTable.remove(4816);
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//can an entry be properly removed from the table?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
				
		System.out.println("check if the key:4816 is in the HashTable");
		if (TestTable.containsKey(4816) == true)
			System.out.println("The Entry for " + 4816 + " is in the HashTable");
		else 
			System.out.println("There is no Entry in the HashTable with a key: " + 4816);//if an entry has been removed from the table, will it return this?
		System.out.println();
		
		System.out.println("put 4816, levels in HashTable");
		TestTable.put(4816, "levels");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//can an entry be put back in the table?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("check if the key:4816 is in the HashTable");
		if (TestTable.containsKey(4816) == true)
			System.out.println("The Entry for " + 4816 + " is in the HashTable");//if an entry has been put back in, can it be found?
		else 
			System.out.println("There is no Entry in the HashTable with a key: " + 4816);
		System.out.println();
		
		System.out.println("remove 7, stars from HashTable");		
		TestTable.remove(7);
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("remove 7, stars from HashTable");		
		TestTable.remove(7);
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//can an entry be removed twice?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 7, siblings in HashTable");
		TestTable.put(7, "siblings");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 7, stars in HashTable");
		TestTable.put(7, "stars");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 18, whatever in HashTable");
		TestTable.put(18, "whatever");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//if an entry has the same hash as a previous entry, will it be put in the next empty slot?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("remove 7, stars from HashTable");		
		TestTable.remove(7);
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("check if the key:7 is in the HashTable");
		if (TestTable.containsKey(7) == true)
			System.out.println("The Entry for " + 7 + " is in the HashTable");
		else 
			System.out.println("There is no Entry in the HashTable with a key: " + 7);
		System.out.println();
		
		System.out.println("check if the key:18 is in the HashTable");
		if (TestTable.containsKey(18) == true)
			System.out.println("The Entry for " + 18 + " is in the HashTable");
		else 
			System.out.println("There is no Entry in the HashTable with a key: " + 18);
		System.out.println();
		
		System.out.println("put 21, molds in HashTable");
		TestTable.put(21, "molds");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();		
		
		
		System.out.println("clear HashTable");
		TestTable.clear();
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//can table be cleared
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("create a new HashTable with a capacity of 8 and a loadfactor of 50%");//can table be created with parameters
		TestTable = new HashTable<Integer, String>(8, 0.50);
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 1221, birthday in HashTable");
		TestTable.put(1221, "birthday");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 4816, date in HashTable");
		TestTable.put(4816, "date");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 57, height in HashTable");
		TestTable.put(57, "height");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 20, age in HashTable");
		TestTable.put(20, "age");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");//will table resize properly?
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 20, siblings in HashTable");
		TestTable.put(20, "siblings");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 20, age in HashTable");
		TestTable.put(20, "age");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("remove 20, age from HashTable");		
		TestTable.remove(20);
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("put 20, age in HashTable");
		TestTable.put(20, "age");
		System.out.println(TestTable.toString());
		System.out.println("There are " + TestTable.size() + " Entries in the HashTable");
		System.out.println("The capacity of the HashTable is: " + TestTable.capacity());
		System.out.println();
		
		System.out.println("check if the key:20 is in the HashTable");
		if (TestTable.containsKey(20) == true)
			System.out.println("The Entry for " + 20 + " is in the HashTable");
		else
			System.out.println("There is no Entry in the HashTable with a key: " + 20);
		System.out.println();
		
		System.out.println("check if the key:49 is in the HashTable");
		if (TestTable.containsKey(49) == true)
			System.out.println("The Entry for " + 49 + " is in the HashTable");
		else
			System.out.println("There is no Entry in the HashTable with a key: " + 49);//if a key was never in the table, will this be returned?
		System.out.println();
		
		}
	}
