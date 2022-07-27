package java_practice;

public class FirstTwoMaximum 
{
	
	public static void main(String[] args) 
	{
		int[] a= {20, 2,4,1,6,8};
		int fmax=0;
		int smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
			
		}
		
		System.out.println(fmax+"and"+smax);
		
		
	}
	

}
