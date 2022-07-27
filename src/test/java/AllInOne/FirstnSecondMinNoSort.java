package AllInOne;

public class FirstnSecondMinNoSort {

	public static void main(String[] args) {
		int[] a= {1,20,330,400,10,5};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
		int fmin=max;
		int smin=max;
		for(int i=0;i<a.length;i++) {
			if(fmin>a[i]) {
				//smin=fmin;
				fmin=a[i];
			}
			else if(smin>fmin) {
				smin=a[i];
			}
		}
		System.out.println(fmin);
		System.out.println(smin);

	}

}

