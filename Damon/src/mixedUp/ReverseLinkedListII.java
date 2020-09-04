package mixedUp;

import mixedUp.DeleteLinkedListNode.ListNode;

public class ReverseLinkedListII {
	

	ListNode head=null;
	
	class ListNode
	{
		int data;
		ListNode next;
	}
	
	public void insert(int data)
	{
		ListNode node=new ListNode();
		node.data=data;
		if(head==null)
		{
			head=node;
		}
		else
		{
			ListNode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	public void print(ListNode head)
	{
		ListNode temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	

	public static void main(String[] args) {
	
		ReverseLinkedListII reverse=new ReverseLinkedListII();
		reverse.insert(1);
		reverse.insert(2);
		reverse.insert(3);
		reverse.insert(4);
		reverse.insert(5);
		reverse.insert(6);
		
		
		
		reverseBetween(reverse.head, 1, 6);
		reverse.print(reverse.head);

	}
	
	  public static ListNode reverseBetween(ListNode head, int m, int n) 
	  
	  {
		  
		  ListNode left=head;
		  ListNode leftMinusOne=head;
		  ListNode rightPlusOne=head;
		  ListNode right=null;
		  int i=1;
		  
		  while(i!=m)
		  {
			 
			  if(i==m-1)
			  {
				  leftMinusOne=left;
			  }
			  left=left.next;
			  i++;
		  }
		  
		 
		  ListNode current=left.next;
		  ListNode prev=left;
		  ListNode next=null;
		  i++;
		  
		  while(i<n+1)
		  {
			  next=current.next;
			  current.next=prev;
			  prev=current;
			  current=next;
			  
			  i++;
			  
		  }
		  
		  leftMinusOne.next=prev;
		  left.next=current;
		  
		  if(m==1)
		  {
			  head=prev;
		  }
		  return head;
	        
	  }

}
