package DynamicProgramming;

public class CatalanNumber {
	
	public static void main(String[] args)
	{
		int n=3;
		
		int [] catalan=new int[n+1];
		
		catalan[0]=1;
		catalan[1]=1;
		
		for(int i=2;i<=n;i++)
		{
			catalan[i]=0;
			
			for(int j=0;j<i;j++)
			{
				catalan[i]+=catalan[j]*catalan[i-j-1];
			}
		}
		
		System.out.println(catalan[n]);
		
	}

}