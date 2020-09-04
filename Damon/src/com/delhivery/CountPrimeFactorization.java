package com.delhivery;

public class CountPrimeFactorization {
	
	public static void main(String [] args)
	{
		int L=5;
		int R=25;
		int P=7;
		
		System.out.println(getCount(L,R,P));
	}
	
	public static int getCount(int L,int R,int P)
	{
		int count =0;
		
		for(int i=L;i<=R;i++)
		{
			if(i%P==0)
			{
				count+=findCount(i,P);
			}
			else 
			{
				continue;
			}
		}
		
		return count;
	}
	
	public static int findCount(int i,int P)
	{
		int count=0;
		
		while(i>0) 
		{
			if(i%P==0)
			{
				count++;
				i/=P;
			}
			else 
			{
				return count;
			}
			
		}
		
		return count;
	}

}
