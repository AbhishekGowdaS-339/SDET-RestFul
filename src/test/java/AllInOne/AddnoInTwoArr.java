package AllInOne;

public class AddnoInTwoArr {

	public static void main(String[] args) {
		int[] a= {7,3,5,9,8};
		int[] b= {3,5,4};
		int sum=0;
		int count=a.length;
		if(a.length<b.length) {
			count=b.length;
		}
		for(int i=0;i<count;i++) {
			try {
				sum=a[i]+b[i];
				//if(sum>9) {
					//int dig=sum%10;
					//sum=sum/10;
					//System.out.print(sum+" "+dig);
				//}
			//	else {
					System.out.print(" "+sum);
				//}
			}
			catch(Exception e) {
				if(a.length<b.length) {
					System.out.print(" "+b[i]+" ");
				}
				else {
					System.out.print(" "+a[i]+" ");
				}
			}
		}
	}
}