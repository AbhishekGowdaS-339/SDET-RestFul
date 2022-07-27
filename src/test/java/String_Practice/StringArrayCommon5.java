package String_Practice;

public class StringArrayCommon5 {
	public static void main(String[] args) {
		String[] str= {"ab", "abc", "babcd", "abm", "x","x"};
		int com=str[0].length();
		String com1=str[0];
		for(int i=1; i<str.length;i++) {
			if(com>str[i].length()) {
				com=str[i].length();
				com1=str[i];
	
			}
		}
		System.out.println("least String: "+com1+" with length "+com);
		boolean flag=false;
		int count=0;
		for(int j=0;j<str.length;j++) {
			//if(com1.contains(str[j])) {
			if(str[j].contains(com1)) {
				count++;
				flag = true;
			}
			else {
				flag=false;
			}
		}
		if(count==str.length)
			System.out.println(com1);
		else
			System.out.println("Common element is not present");
		
		
	}
}
