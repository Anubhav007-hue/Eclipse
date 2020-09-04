package com.delhivery;

public class MaxRectangleWithZeroSum {
	
	int [][] grid= {{9,  7, 16,  5},
	         {1, -6, -7,  3},          
	         {1,  8,  7,  9},          
	         {7, -2,  0, 10}};
	
	List<Integer> list=new ArrayList<>();
	getrectangle(grid,list);
	for(int i:list)
	{
		System.out.print(i+" ");
	}
}

public static void getList(int [][] grid,List<Integer> list)
{
	

}
}
