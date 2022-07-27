package AllInOne;

import java.util.HashSet;

public class Hashhset {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(30);
		hs.add("hi");
		hs.add(null);
		hs.add('a');
		hs.add(null);
		for(Object ob:hs) {
			System.out.println(ob);
		}
	

	}

}
