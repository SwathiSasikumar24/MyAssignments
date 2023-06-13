package week2.day1;

import java.util.Arrays;

public class DuplicateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,5,7,7,5,9,2,3};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++)
		{
			//for(int j=i+1;j<num.length;j++)
			for (int j=1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
				System.out.println(num[i]);
				}
			}
		}

	}

}


// pseudo code

// create an array with name num and data type int
// sort the array
//Array.sort 
//