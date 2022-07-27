package collection_practice;

import java.util.*;


public class SortedORTreeSetPractive {
	public static void main(String[] args) {
		SortedSet<Object> h= new TreeSet<Object>();
		h.add(10);
		h.add(0);
		h.add(6);
		
		TreeSet<Object> h1= new TreeSet<Object>();
		h1.add(10);
		h1.add(0);
		h1.add(6);
		
	
	Iterator i = h.iterator();
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.next());
	
	Iterator<Object> di = h1.descendingIterator();
	while(di.hasNext()) {
		System.out.println(di.next());
	}

		
	
	}
}
