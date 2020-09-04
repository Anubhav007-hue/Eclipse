package Trees;

import java.util.ArrayList;
import java.util.List;

public class GoodNodes {
	
	int count=0;
	
	class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data)
		{
			this.data=data;
		}
	}
	
	public TreeNode insert(int data)
	{
		TreeNode root=new TreeNode(data);
		return root;
	}
	
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		inorder(root.left);
		System.out.println(root.data+" ");
		inorder(root.right);
	}

	public static void main(String[] args)
	{
		GoodNodes gn=new GoodNodes();
		TreeNode root=null;
		
		root=gn.insert(3);
		root.left=gn.insert(3);
		
		root.left.left=gn.insert(4);
		root.left.right=gn.insert(2);
		
		gn.check(root,new ArrayList<Integer>());
		System.out.println(gn.count);
	}
	
	public void check(TreeNode root,List<Integer> current)
	{
		if(root==null)
		{
			return ;
		}
		boolean bool=true;
		for(int i=0;i<current.size();i++)
		{
			if(current.get(i)>root.data)
			{
				bool=false ;
				break;
			}
		}
		
		if(bool==true)
		{
			count++;
		}
		current.add(root.data);
		check(root.left,current);
		check(root.right,current);
		current.remove(current.size()-1);
	}

}
