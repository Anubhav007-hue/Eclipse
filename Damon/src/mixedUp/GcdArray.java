package mixedUp;

public class GcdArray {
	
	public static void main(String[] args)
	{
		int [] nums= {2,4,6,8,16};
		System.out.print(getGCD(nums));
	}
	
	public static int getGCD(int[] nums)
	{
		if(nums.length==0 || nums==null)
		{
			return 0;
		}
		
		if(nums.length==1)
		{
			return nums[0];
		}
		int gcd=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			gcd=calculateGCD(gcd,nums[i]);
		}
		
		return gcd;
	}
	
	public static int calculateGCD(int a,int b)
	{
		if(a==0)
		{
			return b;
		}
		
		if(b==0)
		{
			return a;
		}
		
		 return calculateGCD(a,b%a);
	}

}
