package week2.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks = {99,98,97,90,100};
		int lengthMarks = marks.length;
		System.out.println(marks[4]);
		System.out.println(lengthMarks);
		System.out.println(marks[lengthMarks-1]);
		//sort
		Arrays.sort(marks);
		System.out.println("ASCENDING ORDER");
		//System.out.println(marks);
		for(int i=0; i<=lengthMarks-1;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("+++++++DESCENDING ORDER++++++++++++++");
		for (int j =lengthMarks-1; j>=0;j--)
		{
			System.out.println(marks[j]);
		}

	}

}
