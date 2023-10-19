package thisdemo;



class A
{
	
	int a;
	
	A(int a)
	

	{
		this.a=a;
		System.out.println(a);
	}
	
	A()
	{
		System.out.println("this is default parent constructor ");
	}
	
	A(int a)
	{
		System.out.println("this one argument ");
	}
	
	A(int a,int b)
	{
		System.out.println("this two argument");
	}
	
	
	
	
}


class B extends A
{

	B()
	{
		//super key is use in child class
		//which is super class of all the class?
		// object class
		
		super(10,20);
		System.out.println("this is default child class");
	}
	
	B(int a)
	{
		super(10,10);
		
		System.out.println("this is default child class");
		
	}
	
	
		
	
}



public class SuperDemo {

	public static void main(String[] args) {

	}

}
