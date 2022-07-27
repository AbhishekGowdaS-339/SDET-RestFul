package AllInOne;

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

	}
}
