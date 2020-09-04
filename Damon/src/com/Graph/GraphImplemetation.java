package com.Graph;
import java.util.*;
public class GraphImplemetation {
	
	class coordinates
	{
		int edge;
		int vertex;
		
		coordinates(int vertex)
		{
			
			this.vertex=vertex;
		}
		
	}
	
	int n;
	List<Integer> graph[];
	 HashSet<Integer> visited=new HashSet<>();;
	
	 GraphImplemetation(int n) 
	 {
		 this.n=n;
		 graph=new LinkedList[n];
		 for(int i=0;i<n;i++)
		 {
			 graph[i]=new LinkedList<Integer>();
		 }
	 }
	 
	 public void addEdge(int edge,int vertex)
	 {
		 graph[edge].add(vertex);
	 }
	 
	  public void dfs(int start)
      {
          visited.add(start);
          System.out.print(start+" ");
          for(int i=0;i<graph[start].size();i++)
          {
              int current=graph[start].get(i);
                 if(!visited.contains(current))
                 {
                     dfs(current);
                 }
          }

      }
	
	 
	 public static void main(String[] args)
	 {
		 GraphImplemetation gi=new GraphImplemetation(4);
	        gi.addEdge(0,1);
	        gi.addEdge(0,2);
	        gi.addEdge(1,2);
	        gi.addEdge(2,0);
	        gi.addEdge(2,3);
	        gi.addEdge(3,3);
	        
	        
	        gi.dfs(1);

	 }
}


