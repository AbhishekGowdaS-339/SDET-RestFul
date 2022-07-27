package String_Practice;

public class ReverseAndMaintainIndex {
	public static void main(String[] args) {
		String s="I am String";
		System.out.println(s);
		reverses("I am String");
		
		
	}
	public static void reverses(String str) {
		char[] in=str.toCharArray();
		char[] out=new char[str.length()];
		
		for(int i=0; i<in.length;i++) {
			if(in[i]==' ') {
				out[i]=' ';
			}
		}
		
		int j=out.length-1;
		
		for(int k=0; k<in.length;k++) {
			if(in[k]!=' ') {
				if(out[j]==' ') {
					j--;
				}
				out[j]=in[k];
				j--;
			}
		}
		System.out.println(String.valueOf(out));
	}
}
 
