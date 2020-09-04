package Josh;
import java.util.*;
public class SortListOnAbsoluteValue {
	
	ListNode head=null;
	
	class ListNode 
	{
		int data;
		ListNode next=null;
	}
	
	public void insertAtEnd(int data)
	{
		ListNode newNode=new ListNode();
		newNode.data=data;
		
		if(head==null)
		{
			head=newNode;
		}
		
		else
		{
			ListNode current=head;
			while(current.next!=null) {
				
				current=current.next;
			}
			
			current.next=newNode;
		}
	}
	
	public void insertAtStart(int data)
	{
		ListNode newNode =new ListNode();
		newNode.data=data;
		
		newNode.next=head;
		head=newNode;
	}
	
	public void print(ListNode  head)
	{
		ListNode current=head;
		
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	public void sort(ListNode head)
	{
		ListNode current=head.next;
		ListNode prev=head;
		
		while(current!=null)
		{
			if(current.data<prev.data)
			{
				int val=current.data;
				prev.next=current.next;
				current=prev.next;
				insertAtStart(val);
			}
			
			else 
			{
				prev=current;
				current=current.next;
			}
		}
	}
	
	public static void main(String[] args)
	{
		SortListOnAbsoluteValue linkedList=new SortListOnAbsoluteValue();
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int [] value=new int[N];
		
		for(int i=0;i<N;i++)
		{
			value[i]=scan.nextInt();
		}
		for(int i =0;i<N;i++)
		{
			linkedList.insertAtEnd(value[i]);
		}
		
		linkedList.sort(linkedList.head);
		linkedList.print(linkedList.head);
		
	}

}
