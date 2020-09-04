package com.delhivery;

import java.util.Arrays;

public class BiggestAndSmallestPrime {
	
	public static void main(String[] args)
	{
		int [] nums= {4,15,12,6,19};
		int [] result=new int[2];
		check(nums,result);
		System.out.println(result[0]+" "+result[1]);
	}
	
	public static int[] check(int [] nums,int[] result)
	{
		int n=nums.length;
		
//		Finding the maximum number in the array
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			max=Math.max(max, nums[i]);
		}
		
		boolean [] visited=new boolean[max+1];
		Arrays.fill(visited, true);
		visited[0]=false;
		visited[1]=false;
		
		for(int i=2;i*i<max+1;i++)
		{
			if(visited[i])
			{
				for(int j=i;j*i<max+1;j++)
				{
					visited[j*i]=false;
				}
			}
		}
	    max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++)
		{
			if(visited[nums[i]]==true)
			{
				max=Math.max(max, nums[i]);
				min=Math.min(min, nums[i]);
			}
		}
		result[0]=max;
		result[1]=min;
		
		return result;
	}

}
