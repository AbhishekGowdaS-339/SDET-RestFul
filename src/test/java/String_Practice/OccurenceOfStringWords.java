package String_Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccurenceOfStringWords 
{
	public static void main(String[] args) 
	{
		String s = "khatam ta ta ta ta bye bye bye";
		String[] str=s.split(" ");
		//System.out.println(s.replace(" ", "&"));
		LinkedHashSet<String> hs= new LinkedHashSet<String>();
		for(String s1:str) {
			hs.add(s1);
		}
		
		for(String s2:hs) {
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if(s2.equals(str[i]))
					count++;
				
			}
			System.out.println(s2+" "+count+" times");
			
		}
			
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]+" is at: "+(i+1)+" Index");
		}
		
	}
}
