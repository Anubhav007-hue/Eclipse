package Trees;

import java.util.LinkedList;
import java.util.Queue;

import Trees.binaryTreeConstruction.TreeNode;

public class levelOrderTraversal {
	
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
				
	   levelOrderTraversal lol=new levelOrderTraversal();
				
	   System.out.print("The level order traversal of the tree is : ");
	   lol.printTree(root);
	}
	
	public void printTree(TreeNode root)
	{
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
			TreeNode current=queue.remove();
			System.out.print(current.data+" ");
			
			if(current.left!=null)
			{
				queue.add(current.left);
			}
			
			if(current.right!=null)
			{
				queue.add(current.right);
			}
			
		}
		
	}
}
