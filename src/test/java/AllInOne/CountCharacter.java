package AllInOne;

import java.util.LinkedHashSet;

public class CountCharacter {
	public static void main(String[] args) {
		String str="wwwwkkkkssrrrww";
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			int count=1;
			for(int j=i+1; j<str.length(); j++) {
				if(ch==str.charAt(j)) {
					count++;
					i++;
				}
				else
					break;
			}
			System.out.print(ch+""+count);
		}
		
		System.out.println();
		System.out.println("Another Approach");
		char[] ch1=str.toCharArray();
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(Character ch:ch1) {
			lhs.add(ch);
		}
		
		for(Character c:lhs) {
			int count1=0;
			for(int i=0; i<str.length();i++)
				if(c==str.charAt(i)) {
					count1++;
				}
			System.out.print(c+""+count1);
		}
		
	}
}
