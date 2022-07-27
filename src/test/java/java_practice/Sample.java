package java_practice;

public class Sample 
{
	public static void main(String[] args)
	{
		String s="j@123a@!456a@va";
		String ch="";
		String spl="";
		String num="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+""+s.charAt(i);
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				ch=ch+s.charAt(i);
			}
			else
			{
				System.out.println(s.charAt(i));
				spl=spl+s.charAt(i);
			}
		}
		System.out.println("Character: "+ch);
		System.out.println("Special: "+spl);
		System.out.println("Number: "+num);
		}}
