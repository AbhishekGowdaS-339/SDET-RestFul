package String_Practice;

public class RevOfStringWithoutLen 
{
	public static void main(String[] args) 
	{
		String s="Abhishek";
	    char[] ch = s.toCharArray();  
	    int count=0;
	    for(char c:ch)
	    {
	    	count++;
	    }
	    String rev="";
	    for(int i=count-1;i>=0;i--)
	    {
	    	rev=rev+s.charAt(i);
	    }
	    System.out.println(rev);

}}
