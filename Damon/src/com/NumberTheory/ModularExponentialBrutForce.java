package com.NumberTheory;


/*
 *  NOT AN EFFICIENT APPROACH TO CALCULATE THE POWER OF A NUMBER ..........
 */

public class ModularExponentialBrutForce {
	
	public static void main(String[] args)
	{
		int n=5;
		int x=2;
		int res=getPower(x,n);
		System.out.println(res);
	}
	
	public static int getPower(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		return x*getPower(x, n-1);
	}

}
