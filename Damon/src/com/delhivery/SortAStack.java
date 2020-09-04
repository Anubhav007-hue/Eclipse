package com.delhivery;
import java.util.*;

public class SortAStack {
	
	class TreeNode
	{
		int data;
		TreeNode left=null;
		TreeNode right=null;
		
		TreeNode (int data)
		{
			this.data=data;
		}
	}
	
	public TreeNode insert(TreeNode root,int data)
	{
		if(root==null)
		{
			return createNewNode(data);
		}
		
		else if(root.data>data)
		{
			root.left=insert(root.left,data);
		}
		
		else 
		{
			root.right=insert(root.right,data);
		}
		
		return root;
	}
	
	public TreeNode createNewNode(int data)
	{
		TreeNode root=new TreeNode(data);
		return root;
	}
	
	public void inorder(TreeNode root,Stack<Integer> stack)
	{
		if(root==null)
		{
			return ;
		}
		inorder(root.right,stack);
		stack.push(root.data);
		inorder(root.left,stack);
	}
	
	public TreeNode sort(Stack<Integer> stack)
	{
		TreeNode dummy=null;
		while(stack.size()>0)
		{
			dummy=insert(dummy,stack.pop());
		}
		
		return dummy;
	}
	
	public static void main(String[] args)
	{
		SortAStack sas=new SortAStack();
		TreeNode root=null;
		Stack<Integer> stack=new Stack<>();
		int [] nums= {2,1,4,5,7};
		
		for(int i:nums)
		{
			stack.push(i);
		}
		
		root=sas.sort(stack);
		
		sas.inorder(root, stack);
		System.out.println("The sorted stack is :");
		
		while(stack.size()>0)
		{
			System.out.print(stack.pop()+" ");
		}
		
	}
	
}
