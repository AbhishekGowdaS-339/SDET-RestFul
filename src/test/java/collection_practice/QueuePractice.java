package collection_practice;

import java.util.*;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class QueuePractice {
	public static void main(String[] args) {
		
		
		PriorityQueue al1= new PriorityQueue();
		al1.add(20);
		al1.add(2);
		al1.add(10);
		al1.add(4);
		al1.add(5);
		
		
		System.out.print(al1.poll()+" ");
		System.out.print(al1.poll()+" ");
		System.out.print(al1.peek()+" ");
		System.out.print(al1.peek()+" ");
		
	}
}
