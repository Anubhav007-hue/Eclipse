package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class diffrenceEvenOddLevel {
	int evenSum=0;
	int oddSum=0;
	
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
		diffrenceEvenOddLevel deol=new diffrenceEvenOddLevel();
		
		deol.getDiffrence(root,0);
		System.out.println("The diffrence is : " + (deol.evenSum-deol.oddSum));
		
	}

	public void getDiffrence(TreeNode root,int level) {
		
		if(root==null)
		{
			return ;
		}
		
		if(level%2==0)
		{
			evenSum+=root.data;
		}
		else 
		{
			oddSum+=root.data;
		}
		getDiffrence(root.left, level+1);
		getDiffrence(root.right, level+1);
	}

}
