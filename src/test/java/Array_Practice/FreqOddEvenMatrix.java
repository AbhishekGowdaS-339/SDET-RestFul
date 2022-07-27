package Array_Practice;

public class FreqOddEvenMatrix {
	public static void main(String[] args) {
		int[][] arr= {{1,1,2,3},{1,4,5,6},{1,7,8,9}};
		int row=arr.length;
		int even=0, odd=0;
		int col=arr[0].length;
		System.out.println("row "+row);
		System.out.println("col "+col);
		
		for(int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j]%2==0) {
					even++;
				}else
					odd++;
			}		
		}
		System.out.println("No of Even numbers: "+even);
		System.out.println("No of Odd Numbers: "+odd);
	}

}
