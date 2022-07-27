package java_practice;

public class AvgOfArray 
{
	//int sum=0;
	public static void main(String[] args)
	{
//	AvgOfArray a=new AvgOfArray();
//	int[]x= {12,56,89,23,24,36,88};
//	x[0]=12;
//	for(int i=0;i<x.length;i++)
//	{
//		for(int j=0;j<x.length;j++)
//		{
//		int sum=0;
//		a.sum=0;
//	
//		sum=a.sum+x[j];
//		if(j==x.length-1)
//		{
//			break;
//		}	
//		}
//			System.out.println(a.sum);
//			break;
//	}
		int []x= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		int avg;
		for(int i=0;i<x.length;i++)
		{
			
			sum=sum+x[i];
		}
		System.out.println(sum);
		avg=sum/x.length;
		System.out.println(avg);
		
		
		
		}
}