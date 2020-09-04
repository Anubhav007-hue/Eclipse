package Trees;

import java.util.Stack;

import Trees.binaryTreeConstruction.TreeNode;

public class inorderIterative {
	
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
		inorderIterative iI=new inorderIterative();
		
		
		System.out.print("The inorder traversal of the tree is : ");
		iI.inorder(root);
	}
	
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		Stack<TreeNode> stack=new Stack<>();
		TreeNode current=root;
		while(current!=null)
		{
			stack.push(current);
			current=current.left;
		}
		
		while(stack.size()>0)
		{
		    TreeNode treeNode=stack.pop();
			System.out.print(treeNode.data+" ");
			
			if(treeNode.right!=null)
			{
				TreeNode temp=treeNode.right;
				
				while(temp!=null)
				{
					stack.push(temp);
					temp=temp.left;
				}
			}
			
		}
	}


}
