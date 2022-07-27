package Array_Practice;

public class SortArrInDescOrder {

	public static void main(String[] args) {
		int[] a= {20,50,40,30,10};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
System.out.println();
			int[] b= {20,50,40,30,10};
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<b.length-1;j++) {
					if(b[j]<b[j+1]) {
						int temp=b[j];
						b[j]=b[j+1];
						b[j+1]=temp;
					}
				}
			}
			
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+"\t");
			}

	}

}


