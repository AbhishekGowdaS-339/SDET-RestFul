package AllInOne;

public class PrintVowels {

	public static void main(String[] args) {
		String s="surendara";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
			}
		}

	}

}
