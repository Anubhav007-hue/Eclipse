package DynamicProgramming;

import java.util.*;

public class Creation {
	TreeNode root=null;
    int result=Integer.MIN_VALUE;
	class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode (int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}

	public void insert(String path,int data)
	{
		if(root==null)
		{
			root=new TreeNode(data);
		}
		
		else 
		{
			int length=path.length();
			TreeNode temp=root;
			for(int i=0;i<length;i++)
			{
				if(path.charAt(i)=='L')
				{
					if(i==length-1)
					{
						if(temp.left==null)
						{
							temp.left=new TreeNode(data);
						}
						
						 else 
	                        {
								temp = temp.left;
								temp.data=data;;
							}
					}
					
					else 
					{
						if (temp.left== null) 
                        {
							TreeNode newNode = new TreeNode(0);
							temp.left=newNode;
							temp = temp.left;
						} 
						
						{
							temp=temp.left;
						}
						
					}
				}
				
				else if(path.charAt(i)=='R')
				{
					if(i==length-1)
					{
						if(temp.right==null)
						{
							temp.right=new TreeNode(data);
						}
						 else 
	                        {
								temp = temp.right;
								temp.data=data;;
							}
					}
					else 
					{
					if (temp.right== null) 
                    {
						TreeNode newNode = new TreeNode(0);
						temp.right=newNode;
						temp = temp.right;
					} 
					 
					{
						temp=temp.right;
					}
					}
				}
			}
		}
	}
	
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int T=scan.nextInt();

		int X=scan.nextInt();
		Creation c=new Creation();
		String path=null;
		c.insert(path, X);
		
		int data=0;
		
		for(int i=0;i<T-1;i++)
		{
			
			path=scan.next();
			data=scan.nextInt();
			c.insert(path, data);
		}
		
		c.getDiameter(c.root);
        System.out.println(c.result);
	}

    public  int getDiameter(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		
		int left=getDiameter(root.left);
		int right=getDiameter(root.right);
		
		int temp=Math.max(left, right)+1;
		int ans=Math.max(temp,left+right+1);
		result=Math.max(temp,result);
		
		return temp;
		
	}
}
