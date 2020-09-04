package Josh;


class Res  
{ 
    boolean res = false; 
} 

public class DivideBinaryTree {
	
	TreeNode root=null;
	
	class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
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
		DivideBinaryTree divide=new DivideBinaryTree();
		divide.root=divide.insert(5);
		divide.root.left=divide.insert(1);
		divide.root.right=divide.insert(6);
		divide.root.left.left=divide.insert(3);
		divide.root.right.left=divide.insert(7);
		divide.root.right.right=divide.insert(4);
	
		System.out.println(divide.check(divide.root));
		
	}
	
	 boolean check(TreeNode root)  
	    { 
	        // Count total nodes in given tree 
	        int n = count(root); 
	  
	        // Initialize result and recursively check all nodes 
	        boolean  res = false; 
	        checkRec(root, n, res); 
	  
	        return res; 
	    } 
	
	public int count(TreeNode root)
	{
		if(root==null) return 0;
		
		return count(root.left)+count(root.right)+1;
	}
	
	 int checkRec(TreeNode root, int n, boolean  res)  
	    { 
	        // Base case 
	        if (root == null) 
	            return 0; 
	         
	        // Compute sizes of left and right children 
	        int c = checkRec(root.left, n, res) + 1
	                + checkRec(root.right, n, res); 
	  
	        // If required property is true for current node 
	        // set "res" as true 
	        if (c == n - c)  
	            res = true; 
	  
	        // Return size 
	        return c; 
	    } 
}
