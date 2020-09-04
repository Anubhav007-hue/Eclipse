package mixedUp;

public class MaxAreaIsland {

	static int max=0;
	public static void main(String[] args)
	{
		int [][] island= {{0,0,1,0,0,0,0,1,0,0,0,0,0},
				 {0,0,0,0,0,0,0,1,1,1,0,0,0},
				 {0,1,1,0,1,0,0,0,0,0,0,0,0},
				 {0,1,0,0,1,1,0,0,1,0,1,0,0},
				 {0,1,0,0,1,1,0,0,1,1,1,0,0},
				 {0,0,0,0,0,0,0,0,0,0,1,0,0},
				 {0,0,0,0,0,0,0,1,1,1,0,0,0},
				 {0,0,0,0,0,0,0,1,1,0,0,0,0}
	};
		
		for(int i=0;i<island.length;i++)
		{
			for(int j=0;j<island[i].length;j++)
			{
				max=Math.max(dfs(island,i,j),max);
			}
		}
		
		System.out.println("the max area is "+max);
		
		for(int i=0;i<island.length;i++)
		{
			for(int j=0;j<island[i].length;j++)
			{
				System.out.print(island[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	  public static int  dfs(int[][] grid, int i, int j)
	  {
		    if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0 )
		    {
		        return 0 ;
		    }
		         
		        grid[i][j]=0;
		      
		        int left=dfs(grid,i,j-1);
		        int right=dfs(grid,i,j+1);
		        int up= dfs(grid,i-1,j);
		        int down=dfs(grid,i+1,j);
		        return left+right+up+down+1  ;
		     
		}
}
