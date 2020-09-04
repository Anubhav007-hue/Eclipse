package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class countNode {

	
	public static void main(String[] args)
	{
		binaryTreeConstruction btc=new binaryTreeConstruction();
		
		TreeNode root=null;
		root=btc.insert(2);
		root.left=btc.insert(7);
		root.right=btc.insert(5);
		root.left.left=btc.insert(2);
		root.left.right=btc.insert(6);
		root.left.right.left=btc.insert(11);
		root.left.right.right=btc.insert(5);
		root.right.right=btc.insert(9);
		root.right.right.left=btc.insert(4);
		
		countNode cn=new countNode();
	
//		System.out.println("The number of nodes in the tree are :"+cn.countNodes(root));
		inorderIterative i=new inorderIterative();
		i.inorder(root);
	}

	public int countNodes(TreeNode root) {
		
		if(root==null)
		{
			return 0;
		}
		
		return 1+countNodes(root.left)+countNodes(root.right);
		
	}
	
	

}
