package collection_practice;

import java.util.*;


public class HashSetPractice {
	public static void main(String[] args) {
		HashSet<Object> h= new HashSet<Object>();
		h.add("abh");
		h.add("uyr");
		h.add(123);
		h.add(null);
		h.add(null);
	
	Iterator i = h.iterator();
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.next());

	for(Object i1:h) {
		System.out.print(i1+" ");
	}
	}
}
