package AllInOne;

public class TwoMinLenghtInStringarr {

	public static void main(String[] args) {
		String[] str= {"hi","tyss","manasa","bee","am"};
		String min=str[0];
		for(int i=0;i<str.length;i++) {
			if(min.length()>str[i].length()) {
				min=str[i];
			}
		}
		System.out.println(min);
		for(int i=1;i<str.length;i++) {
			if(min.length()==str[i].length()) {
				System.out.println(str[i]);
			}
		}

	}

}
