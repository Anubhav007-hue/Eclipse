package com.delhivery;

public class ClosestNumberInArray {
	
	public static void main(String[] args)
	{
		int [] nums= { 1, 2, 4, 5, 6, 6, 8, 9};
		int element=11;
		System.out.println(getNumber(nums,element));
	}
	
	public static int getNumber(int [] nums,int element)
	{
		int left=0;
		int right=nums.length-1;
		
		while(left<right)
		{
			int mid=left+(right-left)/2;
			
			if(nums[mid]>element)
			{
				right--;
			}
			
			else if(nums[mid]<element)
			{
				left++;
			}
			
			else if(nums[mid]==element)
			{
				return nums[mid];
			}
		}
		
		if(left==right)
		{
			return nums[left];
		}
		
		int diff1=Math.abs(nums[left]-element);
		int diff2=Math.abs(nums[right]-element);
		
		if(diff1>diff2)
		{
			return nums[right];
		}
		
		return nums[left];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * A SIMPLE APPROACH IS TO CALCULATE THE ABSOLUTE MIN DIFFERENCE 
	 * 
	 * TIME COMPLEXITY-O(N);............................................
	 * 
	 */
//	public static int getNumber(int [] nums,int element)
//	{
//		int result=Integer.MIN_VALUE;
//		int diff=Integer.MAX_VALUE;
//		for(int i=0;i<nums.length;i++)
//		{
//			if(Math.abs(nums[i]-element)<diff)
//			{
//				diff=Math.abs(nums[i]-element);
//				result=nums[i];
//			}
//		}
//		
//		return result;
//	}

}
