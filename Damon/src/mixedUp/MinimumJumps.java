package mixedUp;

public class MinimumJumps {
	
	public static void main(String[] args)
	{
		int [] nums= {2,3,1};
		System.out.println(getJumps(nums));
	}
	
	public static int getJumps(int [] nums)
	{
		int steps=0;
		
		for(int i=0;i<nums.length-1;)
		{
			int max=nums[i];
			int index=-1;
			for(int j=i+1;j<=i+nums[i] && j<nums.length;j++)
			{
				if(nums[j]>max)
				{
					max=nums[j];
					index=j;
				}
			}
			
			if(index==-1)
			{
				i=i+nums[i];
			}
			else 
			{
				i=index;
			}
			
			steps++;
		}
		return steps;
	}

}
