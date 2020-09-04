package DynamicProgramming;

public class maxSumContiguoSubarray {
	
	public static void main(String[] args)
	{
		int [] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	   public static int maxSubArray(int[] nums) {
	        int n=nums.length;
	        
	        if(n==1)
	        {
	            return nums[0];
	        }
	        
	      
	        int max=nums[0];
	        int finalMax=nums[0];
	        
	        for(int i=1;i<n;i++)
	        {
	            max=Math.max(nums[i],max+nums[i]);
	            finalMax=Math.max(finalMax, max);
	        }
	        
	        
	        return finalMax;
	    }
	}
	
