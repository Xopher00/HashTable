//hash data class constructor

public class Entry<K, V> {
	K key;//Entry fields (generics)
	V value;

	public Entry(K k, V v) {//Entry constructor
		key = k;
		value = v;
	};

	public String toString() {//prints Entry
		String x = "(" + key + "," + value + ")";
		return x;
	}
}