package Josh;

public class MoveZeroesLeft {
	
	public static void main(String[] args)
	{
		int [] nums= {1,0,1,0,1};
		moveZeroes(nums);
		for(int i:nums)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void moveZeroes(int [] nums)
	{
		if(nums.length==0 || nums==null)
		{
			return ;
		}
		int lastIndex=-1;
		int i=nums.length-1;
		
		while(i>=0)
		{
			if(nums[i]==0)
			{
				lastIndex=i;
				break;
			}
			i--;
		}
		
		for( i=lastIndex-1;i>=0;i--)
		{
			if(nums[i]==0)
			{
				continue;
			}
			else if(nums[i]!=0)
			{
				swap(nums,lastIndex,i);
				lastIndex--;
			}
		}
	}
	
	public static void swap(int [] nums,int lastIndex,int i)
	{
		int temp=nums[lastIndex];
		nums[lastIndex]=nums[i];
		nums[i]=temp;
	}

}
