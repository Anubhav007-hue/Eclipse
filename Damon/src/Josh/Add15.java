package Josh;

public class Add15 {
	
	ListNode head=null;
	
	class ListNode
	{
		int data;
		ListNode next;
		ListNode (int data )
		{
			this.data =data ;
		}
		
	}
	
	public void insert(int data )
	{
		ListNode node=new ListNode (data);
		
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
		{System.out.print(current.data+" ");
		current=current.next;
		
		}
	}
	public static void main(String[] args)
	{
		int [] nums= {9};
		Add15 a=new Add15();
		for(int i:nums)
		{
			a.insert(i);
		}
		
		a.head=a.reverse(a.head);
		a.head=a.add(a.head);
		a.head=a.reverse(a.head);
		a.print(a.head);
	}
	
	public ListNode reverse(ListNode head)
	{
		ListNode current=head;
		ListNode next=null;
		ListNode prev=null;
		
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		
		return head;
	}
	
	public ListNode add(ListNode head)
	{
		ListNode current=head;
		ListNode last=null;
		int val=15;
		
		int carry=0;
		
		while(current!=null && val>0)
		{
			int data=current.data+val%10+carry;
			current.data=data%10;
			carry=data/10;
			val=val/10;
			if(current.next==null)
			{
				last=current;
			}
			current=current.next;
		}
		
		while(current!=null)
		{
			int data=current.data+carry;
			current.data=data%10;
			carry=data/10;
			
			if(current.next==null)
			{
				last=current;
			}
			current=current.next;
		}
		
		while(val>0)
		{
			ListNode node =new ListNode (val%10+carry);
			carry=node.data/10;
			val=val/10;
			last.next=node;
		}
		
		if(carry>0)
		{
			ListNode node=new ListNode(carry);
			last.next=node;
		
		}
		
		return head;
	}

}
