package java_practice;

public class PatternProgram12 
{
	public static void main(String[] args) {
		
	
	int row=5;
	int count=1;
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=count;j++)
		{
				System.out.print("* ");
		}
		System.out.println();
		if(i<3)
		{
			count++;
		}
		else
		{
			count--;
		}
	}
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
				System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=row-1;i>=1;i--)
	{
		for(int j=i;j>=1;j--)
		{
				System.out.print("* ");
				count--;
		}
	System.out.println();	
	}
	
	System.out.println("====================");
	
	int n=5;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i>=j)
				System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=1;i<=n;i++)
	{
		for(int j=0;j<=n;j++)
		{
			if(i+j<=n-1)
				System.out.print("* ");
		}
		System.out.println();	
	}
	
	
	
}
}

