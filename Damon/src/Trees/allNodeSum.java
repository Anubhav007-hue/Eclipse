package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class allNodeSum {
	
	int sum=0;
	
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
		
		allNodeSum ans=new allNodeSum();
		ans.getSum(root);
		System.out.println("The sum of all the nodes of the tree is :" + ans.sum);
	}
	
	public void getSum(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		getSum(root.left);
		sum+=root.data;
		getSum(root.right);
	}

}
