package AllInOne;


public class MinLengthInStringArr {

	public static void main(String[] args) {
		String[] str= {"hi","welcome","tyss","h","hello"};
		String min=str[0];
		for(int i=0;i<str.length;i++) {
			if(min.length()>str[i].length()) {
				min=str[i];
			}
		}
		System.out.println(min);

	}

}


