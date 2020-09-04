package Trees;

import Trees.binaryTreeConstruction.TreeNode;

class countLeaf {
	int countLeaves=0;
	
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
		
		countLeaf cf=new countLeaf();
		cf.noOfLeafNodes(root);
		System.out.println("The number of leaf nodes in the binary tree are:"+cf.countLeaves);
	}

	public void noOfLeafNodes(TreeNode root) {
		
		if(root==null)
		{
			return ;
		}
		
		if(root.left==null && root.right==null)
		{
			countLeaves+=1;
		}
		
		noOfLeafNodes(root.left);
		noOfLeafNodes(root.right);
		
	}

}
