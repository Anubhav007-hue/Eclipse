package Josh;

public class PrintNodeWithOneChild {
	
	class TreeNode 
	{
		int data;
		TreeNode left=null;
		TreeNode right=null;
		
		TreeNode (int data)
		{
			this.data=data;
		}
	}
	
	public TreeNode insert(int data)
	{
		TreeNode root=new TreeNode(data);
		return root;
	}
	public static void main(String[] args)
	{
		PrintNodeWithOneChild p=new PrintNodeWithOneChild();
		TreeNode root=null;
		root=p.insert(1);
		root.left=p.insert(2);
		root.right=p.insert(3);
		root.left.left=p.insert(4);
		root.left.right=p.insert(5);
		root.left.left.left=p.insert(8);
		
		root.left.right.right=p.insert(10);
		root.right.right=p.insert(7);
		root.right.left=p.insert(6);
		root.right.left.right=p.insert(11);
		p.inorder(root);
	}
	
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		if((root.left!=null && root.right==null) || (root.left==null && root.right!=null))
		{
			System.out.print(root.data+" ");
		}
		inorder(root.left);
		
		inorder(root.right);
	}

}
