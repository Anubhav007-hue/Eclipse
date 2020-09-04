package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class HeightBalancedTree {
	
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
		
		HeightBalancedTree hbt=new HeightBalancedTree();
		
		System.out.println(hbt.check(root)==-1);
	}
	
	public int check(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		
		if(root.left==null && root.right==null)
		{
			return 1;
		}
		
		int lh=check(root.left);
		int rh=check(root.right);
		
		if(lh==-1 || rh==-1 || Math.abs(lh-rh)>1)
		{
			return -1;
		}
		
		return Math.max(lh, rh)+1;
	}

}
