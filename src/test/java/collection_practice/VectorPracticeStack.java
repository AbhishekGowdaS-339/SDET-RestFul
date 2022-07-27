package collection_practice;

import java.util.*;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class VectorPracticeStack {
	public static void main(String[] args) {
		
		
		Stack<Integer> al1= new Stack<Integer>();
		al1.add(20);
		al1.add(2);
		al1.add(10);
		al1.add(4);
		al1.add(5);
		al1.push(6);
		
	for(int i=0; i<al1.size();i++){
		System.out.print(al1.get(i)+" ");
	}
	System.out.println(al1.pop());
	System.out.println(al1.pop());
	System.out.println(al1.pop());
	System.out.println(al1.pop());
	System.out.println(al1.pop());
	System.out.println(al1.pop());
	
	}
}
