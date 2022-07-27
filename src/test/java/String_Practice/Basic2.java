package String_Practice;

public class Basic2 {
	
	
		public static void main(String[] args) {
			String str="This is my Interview";
			String[] str1 = str.split(" ");
			for(int i=str1.length-1; i>=0;i--) {
				String rev="";
			
				if(i==str1.length-1) {
					for(int j=0; j<str1[i].length()-1;j++) {
						rev=rev+str1[i].charAt(i);
					}
				}
		
				
			System.out.println(rev);
	
			}
}
}