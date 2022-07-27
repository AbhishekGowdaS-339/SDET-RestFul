package java_practice;

public class PatternProgram9 
{
	public static void main(String[] args) {
		
	
	int row=6;
	int count=6;
	//System.out.println(row/2);
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=count;j++)
		{
			if(j>=3)
				System.out.print("* ");
		}
		System.out.println();
		if(i<row/2+1)
		{
			count--;
		}
		else
		{
			count++;
		}
	}
	
}
}

