package String_Practice;

import java.util.Arrays;

public class SplitReverseString 
{
	public static void main(String[] args) 
	{
		
		String s = "khatham ta ta bye bye";
		String[] str=s.split(" ");
		System.out.println(Arrays.toString(str));
		
		for(String s1:str) {
			for(int i=s1.length()-1; i>=0; i--) {
				System.out.print(s1.charAt(i));
			}
			System.out.print(" ");
		}
		System.out.println(Arrays.toString(str));

	
	}
}

