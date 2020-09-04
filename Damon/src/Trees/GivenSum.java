package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class GivenSum {
	
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
		
		GivenSum gs=new GivenSum();
		int sum=11;
		if(gs.checkSum(root,sum))
		{
			System.out.println("Sum is present");
		}
		
		else 
		{
			System.out.println("Sum is not present");
		}
	}
	
	public boolean checkSum(TreeNode root ,int sum) {
		
		if(root==null)
		{
			return false;
		}
		
		
		if(root.left==null && root.right==null && sum-root.data==0)
		{
			return true;
		}
		
		return checkSum(root.left,sum-root.data) || checkSum(root.right,sum-root.data);
	}

}
