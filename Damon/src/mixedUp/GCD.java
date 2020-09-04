package mixedUp;
import java.util.*;

public class GCD {
	
	public static void main(String[] args)
	{
		int a=98;
		int b=56;
		
//		Printing the gcd of the 2 numbers..............
		
		System.out.println(getGCD(a,b));
	}
	
	public static int getGCD(int a,int b)
	{
		if(a==0)
		{
			return b;
		}
		
		if(b==0)
		{
			return a;
		}
		
		return getGCD(b%a, a);
	}
	
}