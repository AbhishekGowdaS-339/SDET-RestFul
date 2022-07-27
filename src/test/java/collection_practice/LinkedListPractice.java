package collection_practice;

import java.util.*;


public class LinkedListPractice {
	public static void main(String[] args) {
		LinkedList al= new LinkedList();
		al.add("abh");
		al.add("uyr");
		al.add(123);
		al.add('a');
		al.add(null);
		
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.getClass());
		System.out.println("======================================");
	for(Object obj:al){
		System.out.print(obj+" ");
	}
	System.out.println();
	System.out.println("===================================");
	for(int i=0; i<al.size();i++){
		System.out.print(al.get(i)+" ");
	}
	

	}
}
