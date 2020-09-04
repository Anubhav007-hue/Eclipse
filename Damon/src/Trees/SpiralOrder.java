package Trees;
import java.util.*;

import Trees.binaryTreeConstruction.TreeNode;

public class SpiralOrder {
	
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
		
		SpiralOrder so=new SpiralOrder();
		System.out.print("The spiral order of the tree is : ");
		so.printTree(root);
		
	}
	
	public void printTree(TreeNode root)
	{
		Queue<TreeNode> queue=new LinkedList<>();
		
		queue.add(root);
		int level=0;
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
			
			
			if(level%2==0)
			{
				Stack<Integer> stack =new Stack<>();
				for(int i=0;i<size;i++)
				{
					TreeNode current=queue.remove();
					
					if(current.left!=null)
					{
						queue.add(current.left);
					}
					
					if(current.right!=null)
					{
						queue.add(current.right);
					}
					stack.push(current.data);
				}
				
				while(stack.size()>0)
				{
					System.out.print(stack.pop()+" ");
				}
			}
			
			else 
			{
				for(int i=0;i<size;i++)
				{
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
			level++;
		}
		
	}

}
