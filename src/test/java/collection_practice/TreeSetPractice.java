package collection_practice;

import java.util.*;


public class TreeSetPractice {
	public static void main(String[] args) {
		TreeSet<Object> h= new TreeSet<Object>();
		h.add("abh");
		h.add("uyr");
		h.add("abhi");
		//h.add(null);
		//h.add(123);
	
	Iterator i = h.iterator();
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.next());

	for(Object i1:h) {
		System.out.print(i1+" ");
	}
	}
}
