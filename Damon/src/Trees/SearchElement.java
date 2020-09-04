package Trees;

import Trees.binaryTreeConstruction.TreeNode;

public class SearchElement {
	
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
		
		SearchElement se=new SearchElement();
		
		System.out.println("The element is being searched................ : ");
		int key=71;
		boolean bool=se.search(root,key);
		
		if(bool)
		{
			System.out.println("The element is present");
		}
		
		else 
		{
			System.out.println("The element is not present");
		}

	}
	
	public boolean search (TreeNode root,int key)
	{
		if(root==null)
		{
			return false;
		}
		
		if(root.data==key)
		{
			return true;
		}
		
		return search(root.left,key) || search(root.right,key);
	}

}
