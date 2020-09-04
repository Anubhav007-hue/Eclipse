package mixedUp;

import mixedUp.ReverseLinkedListII.ListNode;

public class OddEven {
	

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
	
	public static void main(String[] args)
	{
		OddEven o=new OddEven();
		o.insert(1);
		o.insert(2);
		o.insert(3);
		o.insert(4);
		o.insert(5);
		o.oddEvenList(o.head);
		
		
		  
	}
	
	  public  ListNode oddEvenList(ListNode head) {
	        
	        ListNode eh=head.next;
	        ListNode ec=eh;
	        int i=1;
	        ListNode current=head;
	        ListNode next=null;
	        ListNode prev=head;
	        
	        while(current!=null)
	        {
	            if(i%2==0)
	            {
	                next=current.next;
	                prev.next=current.next;
	                prev=prev.next;
	                ec.next=null;
	                ec=ec.next;
	                current=next;
	                
	            }
	            i++;
	        }
	        
	        return head;
	    }

}
