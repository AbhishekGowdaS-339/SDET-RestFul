package String_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubString3 
{
	
	//public static void substring(String sr, int s) {
	public static void substring(String sr, int s) {
		HashSet<String> hs = new HashSet<String>();
		for(int i=0; i<sr.length()-1; ++i) {
			String subS="";
			for(int j=i; j<=sr.length()-1; ++j) {
				subS=subS+sr.charAt(j);
				hs.add(subS);
			}
		}
		for(String s1:hs) {
			if(s1.length()==s)
				System.out.println(s1+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		
		String s = "xyxzyxyxyx";
		int subLength=2;	
		substring(s,subLength);
	}
}

