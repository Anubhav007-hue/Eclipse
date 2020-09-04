package mixedUp;

public class MooreVoting {
	
	public static void main(String[] args) {
		int [] nums= {1,2,2,3,4};
		
		int me=0;
		int count=1;
		
		for(int i=1;i<nums.length;i++)
		{
			if(nums[me]!=nums[i])
			{
				count-=1;
			}
			else 
			{
				count+=1;
			}
			
			if(count==0)
			{
				me=i;
				count=1;
			}
		}
		
		System.out.println(nums[me]);
	}

}
