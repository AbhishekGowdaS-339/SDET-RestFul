package collection_practice;

import java.util.*;
import java.util.Map.Entry;

public class HashTable_Practice {
	public static void main(String[] args) {
		Hashtable<Integer, String> map= new Hashtable<Integer, String>();
		map.put(1, "Abhi");
		map.put(2, "ab");
		map.put(6, "cd");
		map.put(3, "Abhi");
		map.put(4, "gd");
		map.put(5, "mkjsn");
		
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
