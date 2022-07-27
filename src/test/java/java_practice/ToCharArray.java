package java_practice;

public class ToCharArray
{
//program to find the length of the string by converting string to array
	public static void main(String[] args) 
	{
		String s="selenium";
		char[] ch=s.toCharArray();
		int count=0;
		for(char i:ch)
		{
			System.out.print(i+" ");
			count++;
		}
		System.out.println();
		System.out.println("length of the string is:" +count);
		
	}
}
