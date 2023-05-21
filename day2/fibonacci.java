package week1.day2;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range =8;
		int f1 =0;
		int f2 =1;
		System.out.println(f1);
		System.out.println(f2);
		for (int i=2;i<=range;i++)
		{
		int sum = f1+f2;
		System.out.println(sum);
		f1 = f2;
		f2 = sum;
		
		}
		
			
		
		
}

}