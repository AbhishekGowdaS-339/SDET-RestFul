package collection_practice;

import java.util.*;
import java.util.Map.Entry;

public class HashMapPractice {
	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "Abhi");
		map.put(2, null);
		map.put(6, null);
		map.put(null, null);
		map.put(4, "gd");
		map.put(5, "Abhgs");
		
		System.out.println(map);
		System.out.println(map.remove(5));
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(Entry<Integer, String> s:map.entrySet()) {
			System.out.println(s.getKey()+" : "+s.getValue());
		}
	}
}
