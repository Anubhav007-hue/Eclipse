package com.delhivery;

import java.util.HashMap;
import java.util.Map;

public class SplitArray {
	
	public static void main(String[] args)
	{
		int [] nums= {1,2,3,1,2,3,4};
		System.out.println(splitArray(nums));
	}
	
	public static boolean splitArray(int [] nums)
	{
		
		if(nums.length==0 || nums==null)
		{
			return true ;
		}
		
		if(!(nums.length%2==0))
		{
			return false ;
		}
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i:nums)
		{
			map.put(i, map.getOrDefault(i,0)+1);
		}
		
		
		for(int key:map.keySet())
		{
			if(!(map.get(key)%2==0))
			{
				return false;
			}
		}
		
		
		return true ;
	}

}
