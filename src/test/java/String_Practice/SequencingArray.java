package String_Practice;

public class SequencingArray {
	public static void main(String[] args) {
		String s1= "abhsabcnhdvfabckjwdvnab";
		String s2="ab";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				String s3;
				
				if(j==s1.length()-1) {
					s3=s1.substring(i,j+1);
					if(s2.equals(s3)) {
						count++;
					}
				}
				s3=s1.substring(i,j);
				if(s2.equals(s3)) {
					count++;
				}
			}
		}	
		System.out.println(s2+" "+count);
	}
}
