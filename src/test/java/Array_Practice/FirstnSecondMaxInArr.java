package Array_Practice;

public class FirstnSecondMaxInArr {

	public static void main(String[] args) {
		int[] a= {10,50,40,20,30};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println(a[0]);
			System.out.println(a[1]);
			
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]>a[j])
					{
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
				System.out.println(a[0]);
				System.out.println(a[1]);
		
	}

}