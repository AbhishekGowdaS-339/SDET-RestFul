package AllInOne;

public class FirstMinNoSort {

	public static void main(String[] args) {
		int[] a= {50,30,20,40,10};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}

