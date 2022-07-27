package AllInOne;

public class FirstnSecondMaxNoSort {

	public static void main(String[] args) {
		int[] a= {10,30,50,60,40,20};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
			if(fmax<a[i]) {
				smax=fmax;
				fmax=a[i];
			}
			else if(smax<a[i]){
				smax=a[i];
			}

		}
		System.out.println(fmax);
		System.out.println(smax);
	}
}

