package Trees;

import Trees.Creation.TreeNode;

public class inorder_Traversal {
	
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	
}
