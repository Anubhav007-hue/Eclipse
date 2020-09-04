package DynamicProgramming;

public class CatalanNumberRecursive {

	
	public static void main(String[] args)
	{
		int n=4;
		
		System.out.println(nthCatalanNumber(n));
	}
	
	public static int nthCatalanNumber(int n)
	{
		int result=0;
		if(n==0 || n==1)
		{
			return 1;
		}
		
		for(int i=0;i<n;i++)
		{
			result+=nthCatalanNumber(i)*nthCatalanNumber(n-i-1);
		}
		
		return result;
	}

}
