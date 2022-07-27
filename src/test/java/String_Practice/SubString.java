package String_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubString 
{
	
	//public static Set<String> substring(String sr, int s) {
	public static Set<String> substring(String sr) {
		Set<String> hs = new HashSet();
		for(int i=0; i<=sr.length(); i++) {
			for(int j=i+1; j<=sr.length(); j++) {
				//if(sr.substring(i, j).length()==substring)
				hs.add(sr.substring(i, j));
			}
		}
		return hs;
	}
	public static void main(String[] args) 
	{
		
		String s = "aaaaaa";
		//int substring=3;
		//Set<String> h=substring(s, substring);
		Set<String> h=substring(s);
		
		System.out.println("Distinct Substring are : ");
		for (String obj : h) {
			System.out.println(obj);
		}
	}
}

