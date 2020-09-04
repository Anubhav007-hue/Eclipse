package com.delhivery;
import java.util.*;
public class SortAnArrayUsingStack { 
	
	public static void main(String[] args)
	{
		int [] nums= {5,1,1,2,0,0,-2,-1};
		sortArray(nums);
		for(int i:nums)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void sortArray(int [] nums)
	{
		Stack<Integer> stack=new Stack<>();
		int lastIndex=0;
		for(int i:nums)
		{
			stack.push(i);
		}
		
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=Integer.MIN_VALUE;
		}
		
		while(stack.size()>0)
		{
			int current=stack.pop();
			boolean bool=false ;
			
			
				int i=0;
				
				while(i<nums.length && nums[i]!=Integer.MIN_VALUE)
				{
					if(current>nums[i])
					{
						i++;
					}
					else if(current<=nums[i])
					{
						for(int j=lastIndex-1;j>=i;j--)
						{
							nums[j+1]=nums[j];
						}
						nums[i]=current;
						bool=true;
						lastIndex+=1;
						break;
					}
				}
				
				if(!bool)
				{
					nums[lastIndex]=current;
					lastIndex+=1;
				}
				
		}
	}

}
