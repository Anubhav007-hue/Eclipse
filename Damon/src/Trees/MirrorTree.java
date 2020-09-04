package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class MirrorTree {
	
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
		
		MirrorTree mt=new MirrorTree();
		
		inorderIterative it=new inorderIterative();
		System.out.println("The mirror tree of the original tree is : ");
		TreeNode rootMirror=mt.convertToMirrorTree(root);
		
		it.inorder(root);
	}
	
	public TreeNode convertToMirrorTree(TreeNode root)
	{
		if(root==null)
		{
			return null ;
		}
		
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		convertToMirrorTree(root.left);
		convertToMirrorTree(root.right);
		
		return root;
	}
	
	

}
