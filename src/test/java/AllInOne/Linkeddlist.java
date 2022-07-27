package AllInOne;

import java.util.LinkedList;

public class Linkeddlist {

	public static void main(String[] args) {
		LinkedList<Object> list=new LinkedList<Object>();
		list.add(10);
		list.add("mansa");
		list.add('s');
		list.add(20);
		System.out.println(list);
		list.addFirst("hi");
		System.out.println(list);
		list.addLast("bye");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

	}

}
