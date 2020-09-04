package Josh;

public class MergeSort {
	
	public  static void main(String[] args)
	{
		int [] nums= {4,2,8,1,5,9};
		int left=0;
		int right=nums.length-1;
		sort(nums,left,right);
		
		for(int i:nums)
		{
			System.out.println(i+" ");
		}
	}
	
	public static void sort(int [] nums,int left ,int right)
	{
		if(left<right)
		{
			int mid=left+(right-left)/2;
			sort(nums,left,mid);
			sort(nums,mid+1,right);
			merge(nums,mid,left,right);
		}
	}
	
	public static void merge(int [] nums, int mid ,int left, int right)
	{
		int n =mid-left+1;
		int m =right-mid;
		
		int [] temp1=new int [n];
		int [] temp2=new int [m];
		
		
		for(int i =0;i<n;i++)
		{
			temp1[i]=nums[left+i];
		}
		
		for(int i=0;i<m;i++)
		{
			temp2[i]=nums[mid+i+1];
		}
		
		int i=0;
		int j=0;
		int k=left;
		
		while(i<temp1.length && j<temp2.length )
		{
			if(temp1[i]<=temp2[j])
			{
				nums[k++]=temp2[j++];
			}
			else 
			{
				nums[k++]=temp1[i++];
			}
		}
		
		while(i<temp1.length)
		{
			nums[k++]=temp1[i++];
		}
		
		while(j<temp2.length)
		{
			nums[k++]=temp2[j++];
		}
	}

}
