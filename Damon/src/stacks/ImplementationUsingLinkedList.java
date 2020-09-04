package stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ImplementationUsingLinkedList {
	
	ListNode head=null;
	int size=0;
	int top=0;
	ListNode current=null;
	PriorityQueue<Integer> minHeap=new PriorityQueue<>();
			
	
	class ListNode 
	{
		int data;
		ListNode next=null;
		ListNode prev=null;
	}
	
	public void push(int val)
	{
		ListNode newNode =new ListNode();
		newNode.data=val;
		
		if(head==null)
		{
			head=newNode;
			current=newNode;
			current.next=head;
			
		}
		
		else 
		{
			newNode.next=current;
			current=newNode;
			
		}
		minHeap.add(val);
		size++;
		
	}
	
	public int pop()
	{
		int returnVal=0; 
		
		if(size==1)
		{
			returnVal=current.data;
			head=null;
		}
		
		else 
		{
			returnVal=current.data;
			current=current.next;
			current.next=null;
		}
		size--;
		
		if(returnVal==minHeap.peek())
		{
			minHeap.remove();
		}
		
		return returnVal;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public int min()
	{
		return minHeap.peek();
	}
	
	public int top()
	{
		return current.data;
	}
	
	public static void main(String[] args)
	{
		ImplementationUsingLinkedList obj=new ImplementationUsingLinkedList();
		
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
//		System.out.println("The size of the stack is :"+obj.size());
//		System.out.println("The returned value is:"+obj.pop());
//		System.out.println("The size of the stack is :"+obj.size());
//		System.out.println("Is the stack empty:"+obj.isEmpty());
		
//		System.out.println("The returned value is:"+obj.pop());
//		System.out.println("The returned value is:"+obj.pop());
//		System.out.println("The returned value is:"+obj.pop());
//		System.out.println("The returned value is:"+obj.pop());
//     	System.out.println("The returned value is:"+obj.pop());
			
		obj.push(6);
		obj.push(-1);
		
////		System.out.println("The size of the stack is :"+obj.size());
//		System.out.println("The minimum element is :"+obj.min());
//		System.out.println("The returned value is :"+obj.pop());
//		System.out.println("The minimum element is :"+obj.min());
//		System.out.println("The top of the stack is :"+obj.top());
//		
		obj.push(-9);
     	System.out.println("The size of the stack is :"+obj.size());
    	System.out.println("The minimum element is :"+obj.min());
		System.out.println("The returned value is :"+obj.pop());
		System.out.println("The minimum element is :"+obj.min());
		System.out.println("The top of the stack is :"+obj.top());
				
	}

}
