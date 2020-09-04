package Trees;

import java.util.LinkedList;
import java.util.Queue;

import Trees.binaryTreeConstruction.TreeNode;

public class LevelWiseSum {
	
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
		
		LevelWiseSum lws=new LevelWiseSum();
		System.out.println("The level order sum of the tree is : ");
		lws.getSum(root);
	}
	
	public void getSum(TreeNode root)
	{
		Queue<TreeNode> queue=new LinkedList();
		queue.add(root);
		int j=0;
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
			int sum=0;
			j++;
			
			for(int i=0;i<size;i++)
			{
				TreeNode current=queue.remove();
				sum+=current.data;
				
				
				if(current.left!=null)
				{
					queue.add(current.left);
				}
				
				if(current.right!=null)
				{
					queue.add(current.right);
				}
			}
			
			System.out.println("The sum of the level "+j+" "+sum);
		}
	}

}
