package AllInOne;

public class SeparateAlphaNumSpecialChar {

	public static void main(String[] args) {
		String s="1a&8uo%*2$3";
		String alpha="";
		String num="";
		String splch="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z'||ch>='A' && ch<='Z') {
				alpha=alpha+ch;
			}
			else if(ch>='0'&& ch<='9') {
				num=num+ch;
			}
			else 
			{
				splch=splch+ch;
			}
			
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(splch);

	}

}
