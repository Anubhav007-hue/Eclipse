package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class binaryTreeHeight {
	
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
			
			binaryTreeHeight bth=new binaryTreeHeight();
			
			System.out.println("The height of the tree is : "+bth.getHeight(root));
			
	}
	
	public int getHeight(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		
		int leftHeight=getHeight(root.left);
		int rightHeight=getHeight(root.right);
		
		if(leftHeight>rightHeight)
		{
			return leftHeight+1;
		}
		
		else 
		{
			return rightHeight+1;
		}
		
		/*Another way of getting the height is below :
		 * 
		 * return Math.max(leftHeight,rightHeight)+1;
		 */
	}

}
