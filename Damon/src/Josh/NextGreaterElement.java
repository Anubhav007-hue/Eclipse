package Josh;

public class NextGreaterElement { 
	
	public static void main(String[] args)
	{
		int [] nums= {6, 7, 11, 4, 10, 8};
		replace(nums);
		for(int i:nums)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void replace(int [] nums)
	{
		if(nums.length==0 || nums==null)
		{
			return ;
		}
		int n=nums.length;
		int max=nums[n-1];
		
		for(int i=n-1;i>0;i--)
		{
			nums[i]=max;
			max=Math.max(max, nums[i-1]);
		}
		nums[0]=max;
	}

}
