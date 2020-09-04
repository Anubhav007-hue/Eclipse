package mixedUp;
import java.util.Arrays;

import mixedUp.MaxAreaIsland;
public class MakingAlargeIsland {
	static int max=0;
	
	public static void main(String[] args)
	{
		int [][] island= {{1, 1}, {1, 1}};
		MaxAreaIsland m=new MaxAreaIsland();
		
		for(int i=0;i<island.length;i++)
		{
			for(int j=0;j<island[i].length;j++)
			{
				
				int[][] temp=new int [island.length][];
				for(int k=0;k<island.length;k++)
				{
					temp[k]=island[k].clone();
				}
				max=Math.max(max, m.dfs(temp, i, j));
			}
		}
//		
		for(int i=0;i<island.length;i++)
		{
			for(int j=0;j<island[i].length;j++)
			{
				if(island[i][j]==0)
				{
					int[][] temp=new int [island.length][];
					for(int k=0;k<island.length;k++)
					{
						temp[k]=island[k].clone();
					}
					
					temp[i][j]=1;
					max=Math.max(max,m.dfs(temp, i, j));
				
				}
			}
		}
		
		
		int nums[][]=new int [][];
//		
		
		for(int i=0;i<island.length;i++)
		{
			for(int j=0;j<island[i].length;j++)
			{
				System.out.print(island[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The max area of the island is "+ max);
	}

}
