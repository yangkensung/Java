package collection;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "test1");
		map.put(200, "test2");
		map.put(300, "test3");
		
		String str = map.get(100);
		System.out.println(str);
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer,String>();
		treemap.put(100, "test1");
		treemap.put(300, "test3");
		treemap.put(200, "test2");
		
		
		System.out.println(treemap);
		

	}

}
