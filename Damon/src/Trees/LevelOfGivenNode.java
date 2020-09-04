package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class LevelOfGivenNode {
	
	int level=-1;
	
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
		
		int key=7;
		
	    LevelOfGivenNode lgn=new LevelOfGivenNode();
	    lgn.getLevel(root,0,key);
	    System.out.println("The level of the given node is : "+lgn.level);
	    
	}
	
	public void getLevel(TreeNode root,int currentLevel,int val)
	{
		if(root==null)
		{
			return;
		}
		
		if(root.data==val)
		{
			level=currentLevel;
			return ;
		}
		
		getLevel(root.left, currentLevel+1, val);
		
		if(level!=-1)
		{
			return ;
		}
		
		getLevel(root.right, currentLevel+1, val);
	}

}
