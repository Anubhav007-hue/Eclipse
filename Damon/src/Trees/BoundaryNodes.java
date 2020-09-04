package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class BoundaryNodes {
	
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
		
		BoundaryNodes bn=new BoundaryNodes();
		System.out.println("The boundary nodes of the tress are : ");
		
		bn.getBoundaryNodes(root);
	}
	
	public void getBoundaryNodes(TreeNode root )
	{
		getLeftNodes(root);
		getLeafNodes(root);
		getRightNodes(root);
		
	}
	
	public void getLeftNodes(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		if(root.left!=null)
		{
			System.out.print(root.data+" ");
			getLeftNodes(root.left);
		}
		
		else if(root.right!=null)
		{
			System.out.print(root.data+" ");
			getLeftNodes(root.right);
		}
	}
	
	public void getLeafNodes(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		if(root.left==null && root.right==null)
		{
			System.out.print(root.data+" ");
			return ;
		}
		
		getLeafNodes(root.left);
		getLeafNodes(root.right);
		
		
	}
	
	public void getRightNodes(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		if(root.right!=null)
		{
			
			getRightNodes(root.right);
			System.out.print(root.data+" ");
		}
		
		else if(root.left!=null)
		{
			System.out.print(root.data+" ");
			getRightNodes(root.left);
		}
	}

}
