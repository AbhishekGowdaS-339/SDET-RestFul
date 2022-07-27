package collection_practice;

import java.util.*;

public class LinkedHashSetPractice {
	public static void main(String[] args) {
		LinkedHashSet set= new LinkedHashSet();
		set.add("Abhi");
		set.add("xyz");
		set.add(645);
		set.add(null);
		set.add(645);
		set.add(null);
		
	for(Object i:set) {
		System.out.println(i);
	}
	}
}
