package collection_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayListtPractice {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("abh");
		al.add("uyr");
		al.add(123);
		al.add('a');
		al.add(null);
		
		ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(20);
		al1.add(2);
		al1.add(10);
		al1.add(4);
		al1.add(5);
		

	
	for(Object obj:al){
		System.out.print(obj+" ");
	}
	System.out.println();
	System.out.println("===================================");
	for(int i=0; i<al.size();i++){
		System.out.print(al.get(i)+" ");
	}
	
	System.out.println();
	System.out.println("===================================");
	Iterator li=al1.iterator();
	while(li.hasNext()) {
		System.out.print(li.next()+" ");
	}

	System.out.println();
	System.out.println("===================================");
	ListIterator li1 = al1.listIterator();
	while(li1.hasNext()) { 
		System.out.print(li1.next()+" ");
	}
	}
}
