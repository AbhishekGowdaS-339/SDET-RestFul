package AllInOne;

public class SeparateZeroNOne {
	public static void main(String[] args) {
		int[] s= {0,1,0,1,1,0,1,0};
		int n=s.length;
		int left=0;
		int right=n-1;
		while(left<right) {
			while(s[left]==0 && left<right)
				left++;
			while(s[right]==1 && left<right)
				right--;
			if(left<right) {
				s[left]=0;
				s[right]=1;
				left++;
				right--;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(s[i]+" ");
		}


	}

}


