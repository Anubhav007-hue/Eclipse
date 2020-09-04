package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import Trees.binaryTreeConstruction.TreeNode;

public class VerticalOrderTraversalRecursive {
	
	public static void main(String[] args)
	{
		binaryTreeConstruction btc=new binaryTreeConstruction();

		TreeNode root=null;
		root=btc.insert(2);
		root.left=btc.insert(7);
		root.right=btc.insert(5);
		root.left.left=btc.insert(2);
		root.left.right=btc.insert(6);
		root.left.right.left=btc.insert(5);
		root.left.right.right=btc.insert(11);
		root.right.right=btc.insert(9);
		root.right.right.left=btc.insert(4);
		
		VerticalOrderTraversalRecursive vot=new VerticalOrderTraversalRecursive();
		System.out.println("The vertical order of the tree is : ");
		Map<Integer,List<Integer>> treeMap=new TreeMap<>();
		
		vot.getVerticalOrder(root,treeMap,0);
		
		for(int key:treeMap.keySet())
		{
			System.out.print(treeMap.get(key)+" ");
			System.out.println();
		}

	}
	
	public void getVerticalOrder(TreeNode root,Map<Integer,List<Integer>> treeMap,int height)
	{
		if(root==null)
		{
			return ;
		}
		
		List<Integer> temp=treeMap.get(height);
		
		if(temp==null)
		{
			temp=new ArrayList<>();
			temp.add(root.data);
		}
		
		else 
		{
			temp.add(root.data);
		}
		
		treeMap.put(height, temp);
		
		getVerticalOrder(root.left, treeMap, height-1);
		getVerticalOrder(root.right, treeMap, height+1);
	}

}
