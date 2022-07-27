package String_Practice;

public class incremental {
	public static void main(String[] args) {
		String s="abcdefghijklmn";
		
		int k=1;
		for(int i=0; i<s.length(); i++) {
			if(k>3) {
				k=0;
			}
			int a=i;
			if(a!=0) {
				int b=i+k;
			
			System.out.println(s.substring(a,b));
			System.out.println(a+" "+b);
			k++;
		}

		}
	}

}
