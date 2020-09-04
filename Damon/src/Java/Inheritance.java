package Java;

public class Inheritance {
	
	public static void main(String[] args)
	{
		B obj=new B();
		obj.show();
	}

}

class A
{
	public void show()
	{
		System.out.println("In class a");
	}
}

class B extends A
{
//	public void show ()
//	{
//		System.out.println("In class b");
//	}
}


