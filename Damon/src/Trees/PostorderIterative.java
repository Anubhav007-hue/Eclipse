package Trees;

import java.util.Stack;

import Trees.binaryTreeConstruction.TreeNode;

public class PostorderIterative {

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
		
		PostorderIterative PI=new PostorderIterative();
		System.out.print("The postorder traversal of the tree is : ");
		PI.printPostorder(root);

	}
	
	public void printPostorder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		Stack<TreeNode> stack=new Stack<>();
		Stack<TreeNode> stack2=new Stack<>();
	
		stack.push(root);

		while(stack.size()>0)
		{
			TreeNode current=stack.pop();
			if(current.left!=null)
			{
				stack.push(current.left);
			}
			
			if(current.right!=null)
			{
				stack.push(current.right);
			}
			
			stack2.push(current);
		}
		
		while(stack2.size()>0)
		{
			System.out.print(stack2.pop().data+" ");
		}
		
		
	}

}
