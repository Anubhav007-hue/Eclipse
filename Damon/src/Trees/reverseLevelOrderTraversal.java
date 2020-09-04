package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Trees.binaryTreeConstruction.TreeNode;

public class reverseLevelOrderTraversal {
	
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
		
		reverseLevelOrderTraversal rlol=new reverseLevelOrderTraversal();
		System.out.print("The reverse level order traversal of the tree is : ");
		rlol.printReverse(root);
	
	}
	
	public void printReverse(TreeNode root)
	{
		Queue<TreeNode> queue=new LinkedList<>();
		Stack<Integer> stack=new Stack<>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
			for(int i=0;i<size;i++)
			{
				TreeNode current=queue.remove();
				stack.push(current.data);
				
				if(current.right!=null)
				{
					queue.add(current.right);
				}
				
				if(current.left!=null)
				{
					queue.add(current.left);
				}
				
				
			}
			
		}
		
		while(stack.size()>0)
		{
			System.out.print(stack.pop()+" ");
		}
		
	}

}
