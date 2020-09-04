package Java;


/*
 * Objects can be counted by declaring an static keyword
 *  of the class because it will be shared among all the objects
 */

public class CountObject {

	public static void main(String[] args) {
		
		Alien a1=new Alien();
		Alien a2=new Alien();
		System.out.println(a1.count);

	}

}

class Alien
{
	static int count=0;
	
	Alien()
	{
		count++;
	}
	
}
