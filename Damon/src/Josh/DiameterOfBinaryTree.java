package Josh;

import Trees.binaryTreeConstruction;
import Trees.binaryTreeConstruction.TreeNode;

public class DiameterOfBinaryTree {
	
	int result=Integer.MIN_VALUE;
	
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
		
		DiameterOfBinaryTree diameter=new DiameterOfBinaryTree();
		diameter.getDiameter(root);
		System.out.println("The diameter of the binary tree is :"+diameter.result);
	}
	
	public int getDiameter(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		
		int left=getDiameter(root.left);
		int right=getDiameter(root.right);
		
		int temp=Math.max(left, right)+1;
		int ans=Math.max(temp,left+right+1);
		result=Math.max(temp,result);
		
		return temp;
		
	}

}
