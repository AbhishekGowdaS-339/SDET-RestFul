package java_practice;

public class SplitStringSeq 
{
	//program to split the string and find the number of words in the string
	public static void main(String[] args) 
	{
		String s="java is a easy programming language";
		String[] str=s.split(" ");
		int count=0;
		for(String s1:str)
		{
			System.out.print(s1+" ");
	        count++;
		}
		System.out.println();
		System.out.println("total number of words present in a string is:" +count);
		
		System.out.println(s.replaceAll(" ", ""));
	}

}
