package String_Practice;

import java.util.Arrays;

public class removeString1 
{
	public static void main(String[] args) 
	{
		
		String s = "jjjabrrrrabtttab";
		String[] str=s.split("ab");
		String s1=s.replaceAll("ab", "");
		System.out.println(s1);
		System.out.print(Arrays.toString(str));
	
	}
}

