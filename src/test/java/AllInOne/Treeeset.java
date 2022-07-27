package AllInOne;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeeset {

	public static void main(String[] args) {
		TreeSet<Object> lh=new TreeSet<Object>();
		lh.add("soni");
		lh.add("new");
		lh.add("hi");
		lh.add("cold");
		lh.add("tee");
		Iterator<Object> it=lh.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
 
	}

}
