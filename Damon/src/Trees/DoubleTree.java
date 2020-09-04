package Trees;

import Trees.binaryTreeConstruction.TreeNode;
import Trees.inorderIterative;

public class DoubleTree {
	
	class TreeNode 
	{
		int data;
		TreeNode left;
		TreeNode right;
		
	}
	
	public TreeNode insert(int val)
	{
		TreeNode node =new TreeNode();
		node.data=val;
		return node;
	}
	
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		System.out.print(root.data+" ");
		
		inorder(root.left);
		
		inorder(root.right);
	}
	
	public static void main(String[] args)
	{
		binaryTreeConstruction btc=new binaryTreeConstruction();
		DoubleTree dt=new DoubleTree();
		TreeNode root=null;
		root=dt.insert(2);
		root.left=dt.insert(7);
		root.right=dt.insert(5);
		root.left.left=dt.insert(2);
		root.left.right=dt.insert(6);
		root.left.right.left=dt.insert(5);
		root.left.right.right=dt.insert(11);
		root.right.right=dt.insert(9);
		root.right.right.left=dt.insert(4);
		
		System.out.println("The double tree is : ");
		
		dt.createDouble(root);
		dt.inorder(root);
	}
	
	public void createDouble(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		createDouble(root.left);
		createDouble(root.right);
		
		TreeNode node=insert(root.data);
		node.left=root.left;
		root.left=node;
	}
	
	
}
