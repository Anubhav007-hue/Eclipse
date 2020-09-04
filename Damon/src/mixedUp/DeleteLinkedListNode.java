package mixedUp;

public class DeleteLinkedListNode {
	
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
		DeleteLinkedListNode delete=new DeleteLinkedListNode();
		delete.insert(1);
		delete.insert(1);
		delete.insert(3);
		delete.insert(3);
		
		delete.insert(4);
		delete.insert(5);
		
		
		
		
//		delete.print(delete.head);
		delete.head=deleteDuplicates(delete.head);
		delete.print(delete.head);
	}
	
	 public static  ListNode deleteDuplicates(ListNode head) {
	        
	        
	        ListNode current=head;
	        ListNode prev=head;
	        
	        while(current!=null)
	        {
	            if(current.next!=null && current.data==current.next.data )
	            {
	                
	                ListNode temp=current;
	                while(temp!=null && temp.data==current.data)
	                {
	                    temp=temp.next;
	                }
	                
	               if(prev==head)
	               {
	            	   head=temp;
	            	   current=temp;
	               }
	               else 
	               {
	            	   prev.next=temp;
		                
		                current=temp;
	               }
	            }
	            else 
	            {
	                prev=current;
	                current=current.next;
	            }
	         }
	        prev.next=current;
	        
	        return head;
	            
	        
	    }

}
