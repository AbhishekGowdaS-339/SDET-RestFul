package Array_Practice;

public class PrimeNumInArr {

	public static void main(String[] args) {
		int[] arr= {23,57,9,53,6,7};
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			int j=2;
			while(n>=j) {
				if(n%j==0) {
					break;
				}
				{
					j++;
				}

			}
			if(n==j) {
				System.out.println(arr[i]);
			}

		}
		System.out.println("===================");
		
		int[] d= {1,4,5,7,98,54};
		for(int i=0;i<d.length;i++) {
			int a=d[i], b=2;
			boolean flag=true;
			while(a>b) {
				if(a%b==0) {
					flag=false;
					break;
				}
				b++;
			
			}
			if(flag)
				System.out.println("This is prime number: "+a);
			else
				System.out.println("This is not prime number: "+a);
		}
	}
}
