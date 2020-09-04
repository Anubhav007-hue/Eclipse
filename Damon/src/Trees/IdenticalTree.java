package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class IdenticalTree {
	
	public static void main(String [] args)
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
		
		TreeNode root1=null;
		
		root1=btc.insert(2);
		root1.left=btc.insert(7);
		root1.right=btc.insert(5);
		root1.left.left=btc.insert(2);
		root1.left.right=btc.insert(6);
		root1.left.right.left=btc.insert(5);
		root1.left.right.right=btc.insert(11);
		root1.right.right=btc.insert(9);
		root1.right.right.left=btc.insert(5);
		
		IdenticalTree it=new IdenticalTree();
		
		System.out.print(it.checkIdentical(root,root1));
	}
	
	public boolean checkIdentical(TreeNode root,TreeNode root1)
	{
		if(root==null && root1==null)
		{
			return true;
		}
		
		if(root==null || root1==null)
		{
			return false;
		}
		
		if(root.data != root1.data)
		{
			return false ;
		}
		
		return checkIdentical(root.left,root1.left) && checkIdentical(root.right,root1.right);
	}

}
