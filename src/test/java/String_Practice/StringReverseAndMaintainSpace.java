package String_Practice;

import java.util.Arrays;

public class StringReverseAndMaintainSpace 
{
	public static void main(String[] args) {
		String str="I am not the stirng";
		String s1=str.replace(" ", "");
		char[] ch=s1.toCharArray();
		String rev="";
		for(int i=0; i<ch.length; i++) {
			rev=ch[i]+rev;
		}
		System.out.println(rev);
		char[] c1=rev.toCharArray();
		String out="";
		
		for(int j=0;j<=str.length()-1;j++) {
			for(int k=0; k<=c1.length-1; k++) {
				if(ch[j]==' ') {
					out=out+" ";
					System.out.println(out);
				}else {
				out=out+c1[k];
				}
			}
		}
		System.out.println(out);
	}
}
