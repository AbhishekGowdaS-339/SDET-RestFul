package Array_Practice;

import java.util.LinkedHashSet;

public class zopssmart {
	public static void main(String[] args) {
			
		String s = "Testingss";
		String s1=s.toLowerCase();	
		
		LinkedHashSet<Character> lhs= new LinkedHashSet<Character>();
		for(int i=0; i<s1.length(); i++) {
			lhs.add(s1.charAt(i));
		}
			
		for(char com:lhs) {
			int count=0;
			for(int i=0; i<s1.length();i++) {
				if(com==s1.charAt(i)){
					count++;
				}
			}
			System.out.println(com+"="+count);
			}
		
	}
}
