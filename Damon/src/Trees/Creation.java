
/* Construction of a Binary Search Tree using 
 * recursion................................
 */

package Trees;

public class Creation {
	
	TreeNode root=null;
	
	public class TreeNode
	{
		int data;
		TreeNode left=null;
		TreeNode right=null;
		
	}
	
	public TreeNode createNewNode(int val)
	{
		TreeNode root=new TreeNode();
		root.data=val;
		return root;
	}
	
	public TreeNode insert(TreeNode root,int val)
	{
		if(root==null)
		{
			return createNewNode(val);
		}
		
		else if(root.data>val)
		{
			root.left=insert(root.left,val);
		}
		
		else if(root.data<val)
		{
			root.right=insert(root.right,val);
		}
		
		return root;
	}
	
	public static void main(String[] args)
	{
		
		Creation c=new Creation();
		c.root=c.insert(c.root, 1);
		c.root=c.insert(c.root, 2);
		c.root=c.insert(c.root, 3);
		c.root=c.insert(c.root, 7);
		c.root=c.insert(c.root, 19);
		c.root=c.insert(c.root, 43);
		c.root=c.insert(c.root, 23);
		
		inorder_Traversal it=new inorder_Traversal();
		it.inorder(c.root);
	}
}
