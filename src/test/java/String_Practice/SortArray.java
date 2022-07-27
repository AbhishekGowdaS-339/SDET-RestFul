package String_Practice;

import java.util.Arrays;

public class SortArray 
{
	public static void main(String[] args) {
		int b[]= {9,9,3,4,5,6,6};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));

		int a[]= {9,9,3,4,5,6,6};
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		int c[]= {9,9,3,4,5,6,6};
		for(int i=0; i<c.length-1; i++) {
			for(int j=i+1; j<c.length-1; j++) {
				if(c[i]>c[j]) {
					int temp=c[j];
					c[j]=c[i];
					c[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
