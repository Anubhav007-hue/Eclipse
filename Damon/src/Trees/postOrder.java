package Trees;
import Trees.Creation.TreeNode;

public class postOrder {
	
	public void postOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}

}
