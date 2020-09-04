package Trees;

import java.util.Map;
import java.util.TreeMap;

import Trees.binaryTreeConstruction.TreeNode;

public class VerticalLevelSum {
	
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
		
		VerticalLevelSum vls=new VerticalLevelSum();
		System.out.println("The sum of each vertical level is : ");
		Map<Integer,Integer> treeMap=new TreeMap<>();
		vls.getSum(root,treeMap,0);
		int i=1;
		
		for(int key:treeMap.keySet())
		{
			System.out.print("The sum of the vertical level  "+i+" : "+treeMap.get(key)+" ");
			System.out.println();
			i++;
		}
	}
	
	public void getSum(TreeNode root ,Map<Integer,Integer> treeMap,int height)
	{
		if(root==null)
		{
			return;
		}
		
		
		
		if(treeMap.containsKey(height))
		{
			treeMap.replace(height,treeMap.get(height)+root.data);
		}
		
		else 
		{
			treeMap.put(height, root.data);
		}
		
		getSum(root.left,treeMap,height-1);
		getSum(root.right,treeMap,height+1);
	}

}
