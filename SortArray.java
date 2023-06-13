package week2.day1;

import java.util.Arrays;
import java.util.Iterator;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {10,20,455,786,5,4,3};
		for (int i=0;i<num1.length-1;i++)
		{
			System.out.println(num1[i]);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@");
		Arrays.sort(num1);
		for (int j =0;j<num1.length-1;j++)
		{
			System.out.println(num1[j]);
		}
	}
}
