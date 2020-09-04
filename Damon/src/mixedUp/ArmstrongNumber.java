package mixedUp;

public class ArmstrongNumber {
	
	public static void main(String[] args)
	{
		
		int n=153;
		if(check(n))
		{
			System.out.println("true");
		}
		
		else 
		{
			System.out.println("false");
		}
	}
	
	public static boolean check (int n)
	{
		
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int data=n%10;
			sum=sum+(int)Math.pow(data,3);
			n=n/10;
		}
		
		if(sum==temp)
		{
			return true;
		}
		
		return false ;
	}

}
