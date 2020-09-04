package Accolite;

public class SumNaturalNumbers {
	
	public static void main(String[] args)
	{
		int n=10;
		System.out.println(getSum(n));
	}
	
	public static int getSum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+getSum(n-1);
	}

}
