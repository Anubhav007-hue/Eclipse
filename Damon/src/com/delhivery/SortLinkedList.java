package com.delhivery;

public class SortLinkedList {
	
	ListNode head=null;
	
	class ListNode 
	{
		int data ;
		ListNode next;
		
		ListNode (int data )
		{
			this.data=data;
		}
	}
	
	public void insert(int data)
	{
		ListNode node =new ListNode(data);
		if(head==null)
		{
			head=node;
		}
		
		else 
		{
			ListNode current=head;
			
			while(current.next!=null)
			{
				current=current.next;
			}
			
			current.next=node;
		}
	}
	
	public void print(ListNode head)
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		
	}
	
	public static void main(String[] args)
	{
		SortLinkedList sll=new SortLinkedList();
		sll.insert(5);
		sll.insert(3);
		sll.insert(1);
		sll.insert(7);
		sll.insert(2);
		
	
		sll.print(sll.sort(sll.head));
	}
	
	public ListNode sort(ListNode head)
	{
		
		  if(head==null || head.next==null)
	        {
	            return  head;
	        }
	        
		ListNode temp=head;
		ListNode slow=head;
		ListNode fast=head;
		
		
		while(fast!=null && fast.next!=null)
		{
			temp=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		
		temp.next=null;
		
		ListNode left=sort(head);
		ListNode right=sort(slow);
		
		return merge(left,right);
	}
	
	public ListNode merge(ListNode head1,ListNode head2)
	{
		ListNode dummy=new ListNode(-1);
		ListNode current=dummy;
		
		while(head1!=null && head2!=null)
		{
			if(head1.data>head2.data)
			{
				current.next=head2;
				head2=head2.next;
			
			}
			
			else 
			{
				current.next=head1;
				head1=head1.next;
				
			}
			
			current=current.next;
		}
		
		if(head1!=null)
		{
			current.next=head1;
			
			head1=head1.next;
		}
		
		if(head2!=null)
		{
			current.next=head2;
			
			head2=head2.next;
	     }

		return dummy.next;
}
	
}
