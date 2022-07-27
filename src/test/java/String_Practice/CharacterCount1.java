package String_Practice;

import java.util.LinkedHashSet;

public class CharacterCount1 {
	public static void main(String[] args) {
		String s="aaaabbbccddddddaaa";
		String[] ch=s.split("");
		
		char[] ch1=s.toCharArray();
		
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for(Character c:ch1) {
			hs.add(c);
		}
		
		for(Character s1:hs) {
			int count=0;
			for(int i=0;i<ch1.length; i++) {
				if(s1==ch1[i]) {
					count++;
				}
			}
			System.out.print(s1+""+count);
			
		}
		
		System.out.println();
		String str="wwwwxxxyyzzz";
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			lhs.add(str.charAt(i));
		}
		
		for(char m1:lhs) {
			int count1=0;
			for(int j=0; j<str.length();j++) {
				if(m1==str.charAt(j)) {
					count1++;
				}
			}
			System.out.print(m1+""+count1);
		}
			
		
		
	}

}
