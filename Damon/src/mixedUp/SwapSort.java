package mixedUp;

public class SwapSort {
	
	public static void main(String[] args)
	{
		int [] nums= {4,1,3,5,4};
		int [] result=new int[2];
		swapSort(nums,result);
		System.out.println("Missing number is "+result[0]+" and duplicate number is  "+result[1]);
	}

	public static void swapSort(int [] nums,int result[])
	{
		if(nums.length==0 || nums==null)
		{
			return ;
		}
		
		int i=0;
		
		swap:
		while(i<nums.length)
		{
		 if(nums[i]==nums[nums[i]-1])
			{
				i++;
			}
			
			else 
			{
				makeValid(nums,i);
				
			}
		}
		
		for(i=0;i<nums.length;i++)
		{
			if(nums[i]!=i-1)
			{
				result[0]=i+1;
				result[1]=nums[i];
			}
		}
		
	}
	
	public static boolean isValid(int[] nums,int i)
	{
		if(nums[i]==i+1)
		{
			return true;
		}
		
		return false ;
	}
	
	public static void makeValid(int [] nums,int i)
	{
		int temp=nums[i];
		nums[i]=nums[nums[i]-1];
		nums[temp-1]=temp;
	}
}
