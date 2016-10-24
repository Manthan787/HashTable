
public class Executor {
	public static void main(String[] args) {
		HashTable<Integer, Integer> t = new HashTable<Integer, Integer>();		
		t.add(11, 33); // will be stored in location 1 in the hashtable
		t.add(21, 65); // will be stored in location 1 in the hashtable
		t.add(12, 344);
		t.add(13, 12);
		t.add(3, 555);
		try {
			System.out.println(t.get(11)); // Has two value chained, still fetches the correct value
			System.out.println(t.get(12)); // has 2 values chained
			System.out.println(t.get(3)); // has only one value chained
		} catch(Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}
	
}
