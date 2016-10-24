import java.util.Arrays;
import java.util.LinkedList;

public class HashTable<T, E> {
	protected LinkedList<HashNode<T, E>>[] arr;
	
	/**
	 * By default creates an underlying array of size 10
	 */
	public HashTable() {
		arr = new LinkedList[10];
	}
	
	/**
	 * Specify the size of the underlying array storing key-value pairs
	 * @param size : size of the array storing chained key-value pairs
	 */
	public HashTable(int size) {
		arr = new LinkedList[size];
	}
	
	/**
	 * Add a Key-Value pair to the hash table
	 * @param key : key of type T
	 * @param value: value of type E
	 */
	public void add(T key, E value) {	
		HashNode<T, E> node = new HashNode<T, E>(key, value);
		int index = this.calculateHash(key);		
		if(arr[index] == null) {
			arr[index] = new LinkedList<HashNode<T, E>>();			
			arr[index].add(node);
		} else {
			arr[index].add(node);
		}
	}
	
	
	/**
	 * Looks for the corresponding value for the given key
	 * @param key : key for which the value is to be retrieved
	 * @return the value at the key specified, or throws an exception if key is absent
	 * @throws Exception
	 */
	public E get(T key) throws Exception {
		LinkedList<HashNode<T, E>> list = arr[this.calculateHash(key)];
		if (list == null) {
			throw new Exception("The key does not exist!");
		} else {
			System.out.println(Arrays.toString(list.toArray()));
			for(HashNode<T, E> node : list) {
				if(node.getKey().equals(key)) {
					return node.getValue();
				}
			}
			return null;
		}		
	}
	
	
	/**
	 * Given a key, calculates is index in the array
	 * @param key : key for which index value is to be calculated
	 * @return
	 */
	protected int calculateHash(T key) {
		return Math.abs(key.hashCode() % arr.length);
	}
}
