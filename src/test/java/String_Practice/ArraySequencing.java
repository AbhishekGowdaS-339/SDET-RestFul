package String_Practice;

public class ArraySequencing {
	public static void main(String[] args) {
		int s=3;
		for(int i=0;i<=s;i++) {
			for(int j=1;j<=s;j++) {
				for(int k=1; k<=i;k++) {
					System.out.print(j);
				}
			}
		}
	}

}
