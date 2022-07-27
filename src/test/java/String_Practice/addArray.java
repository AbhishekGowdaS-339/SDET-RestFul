package String_Practice;

import java.util.Arrays;

public class addArray 
{
	public static int[] addArray(int[] ref1, int[] ref2) {
		int[] res = null;
		if(ref1.length==ref2.length) {
			res=new int[ref1.length];
			for(int i=0; i<res.length; i++) {
				res[i]=ref1[i]+ref2[i];
			}	
		}
		else if(ref1.length>ref2.length) {
			res=new int[ref1.length];
			for(int i=0; i<res.length; i++) {
				if(ref1.length>i)
					res[i]+=ref1[i];
				
				if(ref2.length>i)
					res[i]+=ref2[i];
			}	
		}
		
		else if(ref1.length<ref2.length) {
			res=new int[ref2.length];
			for(int i=0; i<res.length; i++) {
				if(ref1.length>i)
					res[i]+=ref1[i];
				
				if(ref2.length>i)
					res[i]+=ref2[i];
			}	
		}
		
		return res;
		
	}
	
	
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {9,9,3,4,5,6,6};
		//Arrays.toString(addArray(a,b));
		System.out.println("Sum of an integer array : "+Arrays.toString(addArray(a,b)));

	}
}
