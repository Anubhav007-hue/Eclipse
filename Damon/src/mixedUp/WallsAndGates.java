package mixedUp;

public class WallsAndGates {
	
	public static void main(String[] args)
	{
		int max=Integer.MAX_VALUE;
		int [][] rooms= {{max,-1,0,max},{max,max,max,-1},
				{max,-1,max,-1},{0,-1,max,max}};
		
		for(int i=0;i<rooms.length;i++)
		{
			for(int j=0;j<rooms[i].length;j++)
			{
				if(rooms[i][j]==0)
				{
					fillRooms(rooms,0,i,j);
				}
			}
		}
		
		for(int [] room:rooms)
		{
			for(int i=0;i<room.length;i++)
			{
				System.out.print(room[i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void fillRooms(int [][] rooms,int count,int i,int j )
	{
		if(i<0 || j<0 || i>=rooms.length || j>=rooms[i].length || rooms[i][j]<count  || rooms[i][j]==-1)return ;
		
		rooms[i][j]=count;
		
		fillRooms(rooms,count+1,i+1,j);
		fillRooms(rooms,count+1,i-1,j);
		fillRooms(rooms,count+1,i,j+1);
		fillRooms(rooms,count+1,i,j-1);
		
	}

}
