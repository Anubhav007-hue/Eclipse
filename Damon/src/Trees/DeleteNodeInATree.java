package Trees;
/*
 * Delete a node from the binary search tree in o(N).....
 */

public class DeleteNodeInATree {
	static TreeNode root=null;
	static int min=Integer.MAX_VALUE;
	
	public static void main(String[] args)
	{
		
		DeleteNodeInATree delete=new DeleteNodeInATree();
		int [] nums= {4,2,6,5,9,7};
		for(int i:nums)
		{
			root=delete.insert(root,i);
		}
		
		delete.inorder(root);
		root=delete.delete(root, 4);
		System.out.println();
		delete.inorder(root);
	}

	private void inorder(TreeNode root) {
		
		if(root==null)
		{
			return ;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	
	public TreeNode createNode(int data)
	{
		TreeNode node=new TreeNode(data);
		return node;
	}
	
	public TreeNode insert(TreeNode root,int data)
	{
		if(root==null)
		{
			return createNode(data);
		}
		
		else if(data<root.data)
		{
			root.left=insert(root.left,data);
			
		}
		
		else if(data>root.data)
		{
			root.right=insert(root.right,data);
		}
		
		return root;
	}
	
	public TreeNode delete(TreeNode root,int key)
	{
		if(root==null)
		{
			return root;
		}
		
		if(key<root.data)
		{
			root.left=delete(root.left,key);
		}
		else if(key>root.data)
		{
			root.right=delete(root.right,key);
		}
		else 
		{
			 if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
				
				root.data=Findmin(root.right);
			
				root.right=delete(root.right,root.data);
		  }
		
		return root;
	}
	
	public static int Findmin(TreeNode root)
	{
		        int minv = root.data; 
		        while (root.left != null) 
		        { 
		            minv = root.left.data; 
		            root = root.left; 
		        } 
		        return minv; 
	}

}

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
