package OOPS_Concept;

public class hello {
	
	public static void main(String[] args)
	{
		
		System.out.println(out(4,5,new int []{1,3}));
	}
	
	public static int out(int N,int Q,int [] query)
	{
		
		int nums_length=query.length;
		int [] arr= {3,2,0,0,0};
		
		if(nums_length==2)
		{
			int val=query[1];
			int sum=0;
			int index=-1;
			
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
				if(sum>=val)
				{
					index=i;
					return index+1;
				}
			}
			
		}
		
		else 
		{
			int val=query[3];
			int left=query[1];
			int right=query[2];
			
			for(int i=0;i<arr.length;i++)
			{
				arr[i]+=val;
			}
		}
		
		return 0;
	}


}
