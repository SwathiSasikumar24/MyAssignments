package week2.day1;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,7,6,8};
		Arrays.sort(num);
		for(int i=1;i<num.length;i++)
		{
			if(num[i]  != i)
			{
			System.out.println(i);
			}
			
		}

}
}