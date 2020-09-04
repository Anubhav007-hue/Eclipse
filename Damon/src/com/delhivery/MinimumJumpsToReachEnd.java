package com.delhivery;

import java.util.Arrays;

public class MinimumJumpsToReachEnd {
	
	public static void main(String[] args)
	{
		int [] nums= {2,3,1};
		
		System.out.println(getJumps(nums));
	}
	
	public static int getJumps(int[] nums)
	{
		int [] jumps=new int[nums.length];
		
		Arrays.fill(jumps,Integer.MAX_VALUE);
		jumps[0]=0;
		
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<=i+nums[i] && j<nums.length;j++)
			{
				jumps[j]=Math.min(1+jumps[i], jumps[j]);
			}
		}
		
		return jumps[nums.length-1];
		
	}

}
