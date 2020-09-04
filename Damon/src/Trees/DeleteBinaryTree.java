package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class DeleteBinaryTree {
	
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
		
		DeleteBinaryTree dbt=new DeleteBinaryTree();
		root=dbt.delete(root);
		if(root==null)
		{
			System.out.println("The tree is empty");
		}
		
		else 
		{
			System.out.println("The tree is not null");
		}
	}
	
	public TreeNode delete(TreeNode root)

	{
		if(root==null)
		{
			return null;
		}
		
		delete(root.left);
		delete(root.right);
		System.out.println("Delete Node" +root.data);
		root=null;
		return root;
		
		
	}
}
