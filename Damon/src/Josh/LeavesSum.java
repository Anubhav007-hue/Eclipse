package Josh;

import Josh.PrintNodeWithOneChild.TreeNode;

public class LeavesSum {
	
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
	
	public TreeNode insert(int data)
	{
		TreeNode node=new TreeNode(data);
		return node;
	}
	
	
	public static void main(String[] args)
	{
		LeavesSum p=new LeavesSum();
		TreeNode root=null;
		root=p.insert(1);
		root.left=p.insert(2);
		root.right=p.insert(3);
		root.left.left=p.insert(4);
		root.left.right=p.insert(5);
		root.left.left.left=p.insert(8);
		
		root.left.right.right=p.insert(10);
		root.right.right=p.insert(7);
		root.right.left=p.insert(6);
		root.right.left.right=p.insert(11);
		 int sum[]=new int[1];
		getSum(root,sum);
		System.out.println(sum[0]);
	}
	
	public static void getSum(TreeNode root,int[] sum)
	{
		if(root==null)
		{
			return ;
		}
		
		if(root.left==null && root.right==null)sum[0]=sum[0]+root.data;
		
		
		getSum(root.left,sum);
				getSum(root.right,sum);
		
		
	}

}
