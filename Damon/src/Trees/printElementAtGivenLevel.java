package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class printElementAtGivenLevel {
	
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
			int level=2;
			
			printElementAtGivenLevel pe=new printElementAtGivenLevel();
			System.out.print("The element at level "+level+" : ");
			pe.printElement(root,level,0);
	}
	
	public void printElement(TreeNode root ,int level ,int currentLevel)
	{
		if(root==null)
		{
			return ;
		}
		
		if(level==currentLevel)
		{
			System.out.print(root.data+" " );
		}
		printElement(root.left,level,currentLevel+1);
		printElement(root.right, level, currentLevel+1);
	}
	
	
	

}
