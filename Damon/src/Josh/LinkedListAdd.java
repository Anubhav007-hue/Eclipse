package Josh;

class LinkedListAdd
{	

		ListNode head1=null;
		ListNode head2=null;
		ListNode head3=null;
		
	public class ListNode 
	{	
		int data;
		ListNode next;
	}
	
		public void insertNewList(int data)
	{
		ListNode node=new ListNode();
		node.data=data;
		
		if(head3==null)
		{
			head3=node;
		}
		
		else 
		{
			ListNode temp=head3;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	public void insertListOne(int data)
	{
		ListNode node=new ListNode();
		node.data=data;
		
		if(head1==null)
		{
			head1=node;
		}
		
		else 
		{
			ListNode temp=head1;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public void insertListSecond(int data)
	{
		ListNode node=new ListNode();
		node.data=data;
		
		if(head2==null)
		{
			head2=node;
		}
		
		else 
		{
			ListNode temp=head2;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public static void main(String[] args)
	{
		LinkedListAdd lla1=new LinkedListAdd();
		lla1.insertListOne(1);
		lla1.insertListOne(8);
		
		
		LinkedListAdd lla2=new LinkedListAdd();
		lla2.insertListSecond(0);
		
		
		LinkedListAdd lla3=new LinkedListAdd();

		System.out.println("The first linked list is ");
		lla3.print(lla1.head1);
		System.out.println("The second linked list is ");
		lla3.print(lla2.head2);
		lla3.getSum(lla1.head1,lla2.head2);
		System.out.println("THe final list is ");
		lla3.print(lla3.head3);
		
		
	}	
	
	
    
    public void getSum(ListNode head1,ListNode head2)
	{
        
        
		ListNode temp1=head1;
		ListNode temp2=head2;
		
		int carry =0;
		
		while(temp1!=null && temp2!=null)
		{
			int data=carry+temp1.data+temp2.data;
            
			insertNewList(data%10);
			carry=data/10;
			temp1=temp1.next;
			temp2=temp2.next;
            
		}
        
    
		
		
		while(temp1!=null)
		{
			int data=carry+temp1.data;
            insertNewList(data%10);
			carry=data/10;
			temp1=temp1.next;
          
		}
        

		
		while(temp2!=null)
		{
			int data=carry+temp2.data;
            
			insertNewList(data%10);
			carry=data/10;
			temp2=temp2.next;
            
		}
        
        if(carry>0)
        {
            insertNewList(carry);
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
}
