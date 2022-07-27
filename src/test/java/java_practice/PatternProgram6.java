package java_practice;

public class PatternProgram6 
{
	public static void main(String[] args) 
	{
		int row=4;
		int count=7;
		int space=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=count;k++)
			{
				System.out.print("*");
			}
			count-=2;
			space++;
			System.out.println();
		}
		
		int n=5;
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <n; j++) 
			{
				if(j>=i) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
		
		int a=7;
		for (int i = 0; i <a; i++) 
		{
			for (int j = 0; j <a; j++) 
			{
				if(j>=i) {
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
