package Array_Practice;

import java.util.Arrays;

public class swapArray {
	public static void main(String[] args) {
		int[] arr= {2,3,5,6,7};
		System.out.println(Arrays.toString(arr));
		leftToRight(arr, 2);
		System.out.println(Arrays.toString(arr));
		rightToLeft(arr, 2);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] leftToRight(int[] a, int times) {
		while(times>0) {
			int count=a.length;
			int temp=a[0];
			for(int i=1;i<count;i++) {
				a[i-1]=a[i];
			}
			a[count-1]=temp;
			times--;
		}
		return a;
	}
	
	public static int[] rightToLeft(int[] a, int times) {
		while(times>0) {
			int count=a.length;
			int temp=a[count-1];
			for(int i=count-1; i>0;i--) {
				a[i]=a[i-1];
			}
			a[0]=temp;
			
			times--;
		}
	return a;
	}
}
