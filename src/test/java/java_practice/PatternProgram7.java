package java_practice;

public class PatternProgram7 
{
	public static void main(String[] args) {
		int row=4;
		int count=1;
		int space=3;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=count;k++)
			{
				System.out.print("*"+" ");
			}
			count++;
			space--;
			System.out.println();
		}
		
		int n=4;
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <n; j++) 
			{
				if(i+j>=n-1) {
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
