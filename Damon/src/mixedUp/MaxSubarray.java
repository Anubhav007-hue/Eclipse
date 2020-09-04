package mixedUp;

public class MaxSubarray {
	
	public static void main(String[] args)
	{
		int [] nums= {4,2,4,1,0};
		int k=3;
		int res=getSum(nums,k);
		System.out.println(res);
	}
	
	public static int getSum(int [] nums,int k)
	{
		int min=Integer.MAX_VALUE;
		
		
	for(int i =0;i<nums.length;i++)
	{
		int max=findMax(i,nums);
		if(max>=k)
		{
			min=nums.length-i+1;
		}
	}
	
	return min;
	}
	
	public static int findMax(int i,int [] nums)
	{
		int max=Integer.MIN_VALUE;
		for(int j=i;j<nums.length;j++)
		{
			max=Math.max(max, nums[j]);
		}
		
		return max;
	}

}
