package AllInOne;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String s="manasa";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(char ch:set) {
			System.out.println(ch);
		}

	}

}
