package Trees;

public class binaryTreeConstruction {
	
	public class TreeNode
	{
		 public int data;
		 public TreeNode left=null;
		public  TreeNode right=null;
	}
	
	public TreeNode insert(int val)
	{
		TreeNode root=new TreeNode();
		root.data=val;
		
		return root;
	}

}
