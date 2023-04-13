package mycom.mytest;

//E: Element(원소)
//K: Key(키)
//N: Number(숫자)
//T: Type(타입)
//V: Value(값)
public class Entry<K, V> {
	private K key;
	private V value;

	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
