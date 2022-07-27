package AllInOne;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashhset {

	public static void main(String[] args) {
		LinkedHashSet<Object> lh=new LinkedHashSet<Object>();
		lh.add(null);
		lh.add("new");
		lh.add(null);
		lh.add("cold");
		lh.add('l');
		Iterator<Object> it=lh.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//System.out.println(lh);

	}

}
