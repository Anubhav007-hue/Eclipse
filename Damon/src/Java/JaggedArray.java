package Java;

import java.util.Arrays;

public class JaggedArray {

	
	public static void main(String[] args)
	{
		int [][] grid=new int[3][];
		int [] a= {1,2,3,4};
		Arrays.asList(a);
		System.out.println();
		
		grid[0]=new int[4];
		grid[1]=new int[3];
		grid[2]=new int[1];
		
		for(int [] nums:grid)
		{
			for(int i:nums)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
	}

}
