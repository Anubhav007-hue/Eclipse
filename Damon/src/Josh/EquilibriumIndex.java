package Josh;

public class EquilibriumIndex {
	
	public static void main(String [] args)
	{
		int [] nums= {1,7,3,6,5,6};
		System.out.println(getIndex(nums));
	}
	
	public static int getIndex(int [] nums)
	{
		  int sum = 0, leftsum = 0;
		  
	        for (int x: nums) sum += x;
	        
	        
	        for (int i = 0; i < nums.length; ++i) {
	            if (leftsum == sum - (leftsum +nums[i])) return i;
	            leftsum += nums[i];
	        }
	        return -1;
	}

}
