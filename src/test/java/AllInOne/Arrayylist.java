package AllInOne;

import java.util.ArrayList;

public class Arrayylist {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(10);
		list.add('a');
		list.add("hi");
		list.add(20);
		if(list.contains('a')) {
			System.out.println("element present");
		}
		ArrayList<Object> list1=new ArrayList<Object>();
		list1.add(40);
		list1.add('b');
		list1.add("hello");
		list1.add(20);
		list1.addAll(2, list);
		System.out.println(list1);
		list1.remove(3);
		System.out.println(list1);
		list.removeAll(list1);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);

	}

}
