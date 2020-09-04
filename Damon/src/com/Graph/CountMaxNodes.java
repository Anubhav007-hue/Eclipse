package com.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.*;



public class CountMaxNodes {
	
	int max=-1;
	
	List<Integer> dfsList=new ArrayList<>();
	
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
	int count=0;
	 
	
	 public CountMaxNodes(int n) {
		
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
	 
	  public void dfs(int start,int [] visited)
      {
          visited[start]=1;
          count++;
          dfsList.add(start);
         for(int child:graph[start])
         {
        	 if(visited[child]==0)
        	 {
        		 dfs(child,visited);
        	 }
         }

      }
	
	 
	 public static void main(String[] args)
	 {
		 CountMaxNodes gi=new CountMaxNodes(10);
	        gi.addEdge(0,1);
	        gi.addEdge(1,2);
	        gi.addEdge(1,5);
	        gi.addEdge(2,3);
	        gi.addEdge(3,4);
	        gi.addEdge(4,9);
	        gi.addEdge(3,8);
	        gi.addEdge(2,6);
	        gi.addEdge(2,7);
	        
	        for(int i=0;i<gi.graph.length;i++)
	        {
	        	for(int j=0;j<gi.graph[i].size();j++)
	        	{
	        		System.out.print(gi.graph[i].get(j)+" ");
	        	}
	        	System.out.println();
	        }
	        
	        
	        gi.find();
	        
	 }
	 
	 public void find()
	 {
		 int [] visited=new int[n];
		 Arrays.fill(visited,0);
		 int [] maxNodes=new int[n];
		 
		 
		 for(int i=0;i<graph.length;i++)
		 {
			 dfsList.clear();
			 
			 if(visited[i]==0)
			 {
				 count=0;
				 dfs(i,visited);
			 }
			 
			 for(int j:dfsList)
			 {
				 maxNodes[j]=count;
			 }
		 }
		 
		 for (int i = 0; i < n; i++) 
	            System.out.print(maxNodes[i] + " "); 
	        System.out.println(); 
	 }

}
