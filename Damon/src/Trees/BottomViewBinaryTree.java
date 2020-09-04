package Trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import Trees.TopViewBinaryTree.TreeNode;

public class BottomViewBinaryTree {
	
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
		
		BottomViewBinaryTree tvb=new BottomViewBinaryTree();
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
		
		System.out.println("The bottom view of the binary Tree is : ");
		
		tvb.printBottomView(root);
	}

	public void printBottomView(TreeNode root) {
		
		Queue<TreeNode> queue=new LinkedList<>();
		Map<Integer,Integer> treeMap=new TreeMap<>();
		
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
		
				TreeNode current=queue.remove();
				treeMap.put(current.height,current.data);
				
				
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
