package String_Practice;

import java.util.Arrays;

public class ComparetwoInteger 
{
	public static int count(int a) {
		int count=0;
		while(a>0) {
			a=a/10;
			a--;
		}
		return count;
	}
	public static void main(String[] args) {
		int a= 142857;
		int b=a*2;
		int cA=count(a);
		int cB=count(b);
		if(cA==cB) {
		int[] arrA=new int[cA];
		int[] arrB=new int[cB];
		
		for(int i=0; i<cA;i++) {
			arrA[i]=a%10;
			arrB[i]=b%10;
			a=a/10;
			b=b/10;
			}
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		System.out.println(Arrays.equals(arrA, arrB)+" Condition is true "+b);
		}
		else
			System.out.println("Is not equal");
	}
}
