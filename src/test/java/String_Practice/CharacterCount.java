package String_Practice;

public class CharacterCount {
	public static void main(String[] args) {
		String s="aaaabbbccddddddaaa";
		for(int i=0; i<=s.length()-1; i++) {
			int count=1;
			char c1=s.charAt(i);
			for(int j=i+1; j<s.length();j++) {
				char c2=s.charAt(j);
				if(c1==c2) {
					count++;
					i++;
				}else {
					break;
				}		
			}
			if(count>0)
				System.out.println(c1+"-->"+count);
		}
		
		System.out.println();
		
		String str="xxxyyyxxxmmm";
		for(int i=0;i<str.length();i++) {
			int count1=1;
			char ch=str.charAt(i);
			for(int j=i+1;j<str.length(); j++) {
				if(ch==str.charAt(j)) {
					count1++;
					i++;
				}else {
					break;
				}
			}
			System.out.print(ch+""+count1);
		}
		
	}

}
