package Trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewBinaryTree {
	
	class TreeNode 
	{
		int data;
		TreeNode left=null;
		TreeNode right=null;
		int height=0;
	}
	
	public TreeNode insert(int data,int height)
	{
		TreeNode root=new TreeNode();
		root.data=data;
		root.height=height;
		return root;
	}
	
	public static void main(String[] args)
	{
		TopViewBinaryTree tvb=new TopViewBinaryTree();
		
		TreeNode root=null;
		
		root=tvb.insert(2,0);
		root.left=tvb.insert(7,0);
		root.right=tvb.insert(5,0);
		root.left.left=tvb.insert(2,0);
		root.left.right=tvb.insert(6,0);
		root.left.right.left=tvb.insert(5,0);
		root.left.right.right=tvb.insert(11,0);
		root.right.right=tvb.insert(9,0);
		root.right.right.left=tvb.insert(4,0);
		System.out.println("The top view of the binary tree is : ");
		tvb.printTopView(root);
	}

	public void printTopView(TreeNode root) {
		
		Queue<TreeNode> queue=new LinkedList<>();
		Map<Integer,Integer> treeMap=new TreeMap<>();
		
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
		
				TreeNode current=queue.remove();
				
				if(!treeMap.containsKey(current.height))
				{
					treeMap.put(current.height,current.data);
				}
				
				if(current.left!=null)
				{
					current.left.height=current.height-1;
					queue.add(current.left);
				}
				if(current.right!=null)
				{
					current.right.height=current.height+1;
					queue.add(current.right);
				}
			
		}
		
		for(int key:treeMap.keySet())
		{
			System.out.print(treeMap.get(key)+" ");
		}
		
		
	}

}
