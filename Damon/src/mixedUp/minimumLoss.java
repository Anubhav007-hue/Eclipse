package mixedUp;

import java.util.Arrays;
import java.util.*;

public class minimumLoss {
	
	public static void main(String[] args)
	{
		int nums[]= {20,15,8,2,12};
		int mn=getMinimum(nums);
		System.out.println(mn);
	}
	
	public static int getMinimum(int [] nums)
	{
		if(nums.length==0 || nums==null)
		{
			return 0;
		}
		
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			map.put(nums[i],i);
		}
		Arrays.sort(nums);
		int min=Integer.MAX_VALUE;
		for(int i =0;i<nums.length-1;i++)
		{
			int temp=Math.abs(nums[i]-nums[i+1]);
			if(map.get(nums[i])>map.get(nums[i+1]))
			{
				min=Math.min(temp, min);
			}
		}
//		for(int key:map.keySet())
//		{
//			System.out.println(key+" has value "+map.get(key));
//		}
		
		return min;
	}

}
