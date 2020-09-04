package OOPS_Concept;

public class dummy {
	
	private dummy()
	{
		
	}
	
	private static int count=0;
	
	public static dummy getInstance() {
		
		if(count<5)
		{
			count++;
			
			return new dummy();
		}
		
		
		else try 
		{
			throw new Exception("Object limit reached");
		}
		
		catch  (Exception e)
		{
			e.printStackTrace();
		}
			
		return null;
		
	}

}
