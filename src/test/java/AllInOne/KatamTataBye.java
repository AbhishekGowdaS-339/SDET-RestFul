package AllInOne;

import java.util.LinkedHashSet;

public class KatamTataBye {

	public static void main(String[] args) {
		String s="Khatam ta Ta bye Bye";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		for(String word:set) {
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(word.equalsIgnoreCase(str[i])) {
					count++;
				}
			}
			System.out.println(word+"="+count);
		}

	}

}
