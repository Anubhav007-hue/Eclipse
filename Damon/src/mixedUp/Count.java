package mixedUp;

public class Count {

	
	public static void main(String[] args)
	{
		int n=2630;
		
		int counter=0;
		int numRemainder=n;
		
		while(numRemainder>0)
		{
			int digit=numRemainder%10;
			
			if(digit!=0 && n%digit==0)
			{
				counter++;
			}
			numRemainder/=10;
		}
		
		System.out.println(counter);
	}
}
