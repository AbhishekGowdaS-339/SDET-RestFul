package java_practice;

public class FminAndSmin 
{
	
	public static void main(String[] args) 
	{
		int[] a= {1, 20, 2,4,6,8};
		int max=0;
		for(int j=0; j<a.length; j++) {
			if(a[j]>max)
				max=a[j];
		}
		System.out.println(max);
				
		int fmin=max;
		int smin=max;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				fmin=a[i];
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}
			
		}
		
		System.out.println(fmin+"and"+smin);
		
		
	}
	

}
