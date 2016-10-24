/**
 * This is the definition of the node used for storing key-value pairs in the HashTable class.
 * The HashNode has a key and a value field. This is required when multiple keys have the same
 * hashcode and in return has the same index in the linked list array of HashTable class.
 * @author Manthan Thakar
 *
 * @param <K>
 * @param <V>
 */

public class HashNode<K, V> {
	protected K key;
	protected V value;
	
	
	/**	 
	 * @param key : key of the node of the hashtable
	 * @param value : corresponding value for the given key
	 */
	public HashNode(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "HashNode [key=" + key + ", value=" + value + "]";
	}
}
