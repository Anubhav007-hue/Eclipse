package com.delhivery;
import java.util.*;

public class CountingSubarraywithSum_Zero {
	
	class pair
	{
		int start;
		int end;
		
		pair(int start,int end)
		{
			this.start=start;
			this.end=end;
		}
	}
	
	
	public static void main(String[] args)
	{
		int [] nums= {6, 3, -1, -3, 4, -2, 2,
	             4, 6, -12, -7};
		
		List<pair> result=new ArrayList<>(); 
		CountingSubarraywithSum_Zero c=new CountingSubarraywithSum_Zero();
		c.count(nums,result);
		for(pair i:result)
		{
			System.out.print(i.start+" "+i.end);
			System.out.println();
		}
		
	}
	
	public  void count(int [] nums,List<pair> result)
	{
		Map<Integer,List<Integer>> map=new HashMap<>();
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];
			
			
			if(sum==0)
			{
				result.add(new pair(0,i));
			}
			
			List<Integer> temp=new ArrayList<>();
			
			if(map.containsKey(sum))
			{
				temp=map.get(sum);
				for(int j=0;j<temp.size();j++)
				{
					result.add(new pair(temp.get(j)+1,i));
				}
			}
			temp.add(i);
			map.put(sum,temp);
		}
	}

}
