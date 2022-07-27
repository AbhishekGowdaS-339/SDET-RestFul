package Array_Practice;

public class UniqueValue {
	
	public static void main(String[] args) {
		
	int[] a= {1,2,3,4,5,6,7,8};
	int[] b= {11,22,3,4,5,6,7,8};
	//System.out.println(a[0]);
	
	for(int i=0;i<a.length;i++) {
		int count =0;
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j]) {
			count++;
			}
			if(count==0) {
				System.out.println("Unique Number: "+a[i]);
			}
		}
		
	}
	}

}
