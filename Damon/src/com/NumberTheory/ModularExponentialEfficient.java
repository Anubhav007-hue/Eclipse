package com.NumberTheory;

/* EFFICIENT SOLUTION WITH T.C(LOG_N)
 *                         S.C(1);
 */
public class ModularExponentialEfficient {

	public static void main(String[] args) {
		
		int n=5;
		int x=2;
		int mod=1000000007;
		
		int result=1;
		
		while(n>0)
		{
			if(n%2==1)
			{
				result=result*x%mod;
			}
			x=x*x%mod;
			n=n/2;
		}
		
		System.out.println(result);
//		System.out.println("Function "+(int)Math.pow(2, 5));

	}

}
