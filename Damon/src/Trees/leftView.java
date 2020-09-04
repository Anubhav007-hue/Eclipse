package Trees;

import java.util.LinkedList;
import java.util.Queue;

import Trees.binaryTreeConstruction.TreeNode;

public class leftView {
	
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
		leftView lv=new leftView();
		
		System.out.print("The left view of the tree is : ");
		
		lv.printLeftView(root);
	}
	
	public void printLeftView(TreeNode root)
	{

		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
			for(int i=0;i<size;i++)
			{
				TreeNode current=queue.remove();
					
				if(i==0)
				{
					System.out.print(current.data+" ");
				}
				
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

}
