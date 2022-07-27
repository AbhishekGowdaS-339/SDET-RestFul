package String_Practice;

public class StringArrayCommon {
	public static void main(String[] args) {
		String[] str= {"ab", "abc", "a", "abm"," a","a"};
		int com=str[0].length();
		String com1=str[0];
		for(int i=1; i<str.length;i++) {
			if(com>str[i].length()) {
				com=str[i].length();
				com1=str[i];
	
			}
		}
		System.out.println(com1);
	int count=0;
	for (int i = 0; i < str.length; i++) {
		
		String sub=str[i].substring(0, com1.length());
		if(sub.equals(com1))
		{
			count++;
		}
	}
	
	if(count==str.length)
	{
		System.out.println(com1);
	}
	else
	{
		System.out.println("nothing is commn");
	}
		
		
		
	}
}
