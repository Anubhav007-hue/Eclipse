package Josh;

import java.util.Scanner;

import Trees.binaryTreeConstruction;
import Trees.binaryTreeConstruction.TreeNode;

public class leavesOfBinaryTree {
	
	public static void main(String[] args)
	{
		binaryTreeConstruction btc=new binaryTreeConstruction();
		Scanner scan=new Scanner(System.in);
	String s=scan.next();
		
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
		
		System.out.println("The leaves of the binary tree are :");
		printLeaves(root);
		
	}
	
	public static void printLeaves(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		if(root.left==null && root.right==null)
		{
			System.out.print(root.data+" ");
			return ;
			
		}
		printLeaves(root.left);
		printLeaves(root.right);
	}

}
