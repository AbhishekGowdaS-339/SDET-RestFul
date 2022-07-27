package java_practice;

public class PatternProgram10 
{
	public static void main(String[] args) {
		
	
	int row=5;
	int count=5;
	//System.out.println(row/2);
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=count;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		if(i<3)
		{
			count=count-2;
		}
		else
		{
			count=count+2;
		}
	}
	
}
}

