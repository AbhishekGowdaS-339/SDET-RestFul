package AllInOne;

import java.util.LinkedHashSet;

public class NumOfOccurenceOfCharInArr {

	public static void main(String[] args) {
		String s="mahadevappa";
		//Step1:create any set collection and add all char of string
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		//Step2:Compare each char of set with all char of given string
		for(char ch:set)//read from set
		{
			int count=0;
			for(int i=0;i<s.length();i++) //read from string
			{
				if(ch==s.charAt(i)) 
				{//Step3: Increment the count if matching
					count++;
				}
			}
			//Step4: print both char and count
			System.out.println(ch+"="+count);
		}

	}

}
