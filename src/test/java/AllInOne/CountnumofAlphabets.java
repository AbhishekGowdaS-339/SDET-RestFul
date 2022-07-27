package AllInOne;

import java.util.LinkedHashSet;

public class CountnumofAlphabets {
	
	public static void main(String[] args) {
		String s="wwwwprreetrtw";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
		set.add(s.charAt(i));
		}
		for(char c:set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(c==s.charAt(i)) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(c+""+count);
			}
			else {
				System.out.print(c+""+1);
			}
			
			
		
		
		}
		
	}

}
