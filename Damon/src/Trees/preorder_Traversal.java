package Trees;
import Trees.Creation.TreeNode;

public class preorder_Traversal {
	
	public void preorder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
		
	}

}
