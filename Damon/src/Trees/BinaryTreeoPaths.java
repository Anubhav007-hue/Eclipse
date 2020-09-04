package Trees;

import Trees.binaryTreeConstruction.TreeNode;
import java.util.*;
public class BinaryTreeoPaths {
	
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
		BinaryTreeoPaths bt=new BinaryTreeoPaths();
		List<String> paths=new ArrayList<>();
		bt.getPaths(root,"",paths);
		
		System.out.println("The paths of the binary tree are : ");
		
		System.out.println(paths+" ");
	}

	private void getPaths(TreeNode root,String str, List<String> paths) {
		
		
		if(root==null)
		{
			return ;
		}
		
		str=str+root.data;
		
	
		if(root.left==null && root.right==null)
		{
			paths.add(str);
			return;
		}
		
		
		
		getPaths(root.left,str+" ",paths);
		getPaths(root.right,str+" ",paths);
		
	}

}
