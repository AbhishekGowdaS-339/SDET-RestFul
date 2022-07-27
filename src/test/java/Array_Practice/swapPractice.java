package Array_Practice;

import java.util.Arrays;

public class swapPractice {
	
	public static int[] swapFttoLt(int[] arg) {
		int key=arg.length;
		int temp=arg[0];
		for(int j=1;j<key;j++)
		{
			arg[j-1]=arg[j];
		}
		arg[arg.length-1]=temp;
		return arg;
	}
	
	public static int[] swapFttoLt(int[] arg, int times) {
		
		while(times>0) {
		int key=arg.length;
		int temp=arg[0];
		for(int j=1;j<key;j++)
		{
			arg[j-1]=arg[j];
		}
		arg[arg.length-1]=temp;
		
		times--;
		}
		
		return arg;
	}
	
	public static int[] swapLttoFt(int[] arg) {
		int key=arg.length;
		int temp=arg[key-1];
		for(int j=key-1;j>0;j--)
		{
			arg[j]=arg[j-1];
		}
		arg[0]=temp; 
		return arg;
	}
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		swapFttoLt(a,1);
		
		System.out.println(Arrays.toString(a));
		
	}}
