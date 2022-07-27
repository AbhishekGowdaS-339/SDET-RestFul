package Array_Practice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class zopssmart2 {
	public static void main(String[] args) {
		int in=231;
		int in1=in;
		int count=0;
		while(in1>0) {
			count++;
			in1=in1/10;
			
		}
		int[] a= new int[count];
		for(int m=0; in<count;m++) {
			a[m]=in%10;
			in=in/10;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(in%10);
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length-1-i;j++)
			if(a[i]<a[j]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
		
	
	
	}
}
