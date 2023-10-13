package thisdemo;


class A
{
	A()
	

	{
		
		System.out.println("this is default parent constructor ");
	}
	
	
	
	
	
	
	
}


class B extends A
{

	B()
	{
		//super key is use in child class
		//which is super class of all the class?
		// object class
		
		super();
		System.out.println("this is default child class");
	}
	
	
		
	
}

public class Thisdemo {
	

	public static void main(String[] args) {
		
	 B obj1=new B();

	}

}
