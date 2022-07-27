package java_practice;

public class PatternProgram11 
{
	public static void main(String[] args) {
		
	
	int row=5;
	int count=1;
	int space=row-row/2;
	for(int i=1;i<=row;i++)
	{
		for(int k=0; k<space; k++) {
			System.out.print("  ");
		}
		for(int j=1;j<=count;j++)
		{
				System.out.print("* ");
		}
		System.out.println();
		if(i<3)
		{
			count++;
			space--;
		}
		else
		{
			count--;
			space++;
		}
	}
	
	System.out.println("============================");
	
	int n=5;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i+j<=n-1)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();	
	}
	for(int i=1;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i>=j)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
	}
	
	
	
	
	
}
}

