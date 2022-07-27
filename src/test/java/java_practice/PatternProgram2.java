package java_practice;

public class PatternProgram2 
{
	public static void main(String[] args) 
	{
		int row=5;
		int count=1;
		for (int i = 1; i <=row; i++) 
		{
			for (int j = 1; j <=count; j++) 
			{
				System.out.print("* ");
				
			}
			System.out.println();
			count++;
			
		}
		
		
		System.out.println("=========approach-2=============");
		
		int n=5;
		for (int i = 0; i <=n; i++) 
		{
			for (int j = 0; j <=n; j++) 
			{
				if(i>j)
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
	
		
	}

}