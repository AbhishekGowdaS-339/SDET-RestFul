package Array_Practice;

public class AddArray {
	
	public static void main(String[] args) {
		
	int[] a= {1,2,4,5};
	int[] b= {7,5,6,7,8,9,0};
	
	int sum=0;
	int count= a.length;
	if(a.length<b.length) {
		count= b.length;
	}
	for(int i=0; i<count; i++) {
		try {
			sum=a[i]+b[i];
			/*
			 * if(sum>9) { int digit=sum%10; sum=sum/2; System.out.println(sum+" "+digit); }
			 * else
			 */
				System.out.print(" "+sum);
		}
			
		catch(Exception e) {
			if(a.length<b.length)
				System.out.print(" "+b[i]);
			else
				System.out.print(" "+a[i]);
		}
		}
	}

}
