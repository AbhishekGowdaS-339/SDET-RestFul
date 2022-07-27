package java_practice;

public class PatternProgram4 
{
	public static void main(String[] args) 
	{
		int row=5;
		int count=1;
		int space=3;
		for (int i=1;i<=row; i++) 
		{
			for (int j = 1; j<=space; j++) 
			{
			System.out.print(" ");
			}
			for (int k = 1; k <=count; k++) 
			{
				System.out.print("*");
				
			}
			count++;
			if(i%2==0)
			space--;
			System.out.println();
			
		}
		
		
		System.out.println("=========approach-2=============");
		
		int n=5;
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <n; j++) 
			{
				if(i+j>=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}
		
		int na=5;
		for (int i = 0; i <na; i++) 
		{
			for (int j = 0; j <na; j++) 
			{
				if(i+j>=na-1) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
	}

}
