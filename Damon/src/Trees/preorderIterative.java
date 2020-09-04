package Trees;

import java.util.Stack;

import Trees.binaryTreeConstruction.TreeNode;

public class preorderIterative {
	
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
		
		preorderIterative pi=new preorderIterative();
		
		System.out.print("The preorder traversal of the tree is : ");
		
		pi.printPreorder(root);
	}
	
	public void printPreorder(TreeNode root)
	{
		Stack<TreeNode> stack=new Stack<>();
		
		stack.push(root);
		
		while(stack.size()>0)
		{
			TreeNode current=stack.pop();
			System.out.print(current.data+" ");
			
			if(current.right!=null)
			{
			
				stack.push(current.right);
				
			}
			
			if(current.left!=null)
			{
				
				stack.push(current.left);
				
			}
		}
	}

}
