package mixedUp;
import java.util.*;

import java.util.Scanner;

public class MaxHeight {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int [] nums=new int [N];
		
		for(int i=0;i<N;i++)
		{
			nums[i]=scan.nextInt();
		}
		List<Integer> result=new ArrayList<>();
		getMaxDistance(nums,result);
		System.out.println(result.get(0));
		System.out.println(result.get(1)+" "+result.get(2));
		
	}
	
	public static List<Integer> getMaxDistance(int [] nums,List<Integer> result)
	{
		if(nums.length==0 || nums==null)
		{
			return result;
		}
		
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]<=nums[j])
				{
					result.add(j-i);
					result.add(i);
					result.add(j);
					break;
				}
			}
		}
		
		return result;
	}
}
