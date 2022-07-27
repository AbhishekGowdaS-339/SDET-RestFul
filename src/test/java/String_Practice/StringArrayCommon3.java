package String_Practice;

import java.util.LinkedHashSet;

public class StringArrayCommon3 {
	public static void main(String[] args) {
		String s1= "xyxyxyxyxyxyxy";
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s1.length();j++) {
				String s=s1.charAt(i)+""+s1.charAt(j);
				if(s.length()==2) {
					lhs.add(s);
				}
			}
		}	
		System.out.println("==================");
		for(String str:lhs)
		System.out.println(str);
	
	}
}
