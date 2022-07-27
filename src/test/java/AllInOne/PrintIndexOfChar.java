package AllInOne;

import java.util.LinkedHashSet;

public class PrintIndexOfChar {

	public static void main(String[] args) {
		String s="mahadevappa";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+"="+(i+1));
					break;//no duplicates will b printed only first occurence
				}
			}
			
		}

	}

}
