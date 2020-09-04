package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import Trees.BottomViewBinaryTree.TreeNode;

public class VerticalOrderTraversal {
	
	
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
		VerticalOrderTraversal tvb=new VerticalOrderTraversal();
        TreeNode root=null;
		
		root=tvb.insert(3,0);
		root.left=tvb.insert(9,0);
		root.right=tvb.insert(20,0);
		root.right.left=tvb.insert(15,0);
		root.right.right=tvb.insert(7,0);
		
		
		System.out.println("The vertical order traversal of the tree is : ");
		List<List<Integer>> result=new ArrayList<>();
		
		tvb.printVertical(root,result);
//		System.out.println(result+" ");
		
	}

	public void printVertical(TreeNode root, List<List<Integer>> result) {
		
		
		Queue<TreeNode> queue=new LinkedList<>();
		Map<Integer,List<Integer>> treeMap=new TreeMap<>();
		
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
		
				TreeNode current=queue.remove();
				if(treeMap.containsKey(current.height))
				{
					treeMap.get(current.height).add(current.data);
				}
				else 
				{
					List<Integer> list=new ArrayList<>();
					list.add(current.data);
					treeMap.put(current.height,list);
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
			System.out.println();
		}
		
	}
	
	

}
