package exceptiondemo;

public class ThrowsDemo {
	
	void test1()
	{
		System.out.println("this is test1");
		test2();
	}
	
	void test2()
	{
		System.out.println("this is test1");
		test3();
	}
	
	void test3()
	{
		System.out.println("this is test1");
		try
		{
			
		test4();
		
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Ae is coming");
			
		}
	}
	
	void test4()
	{
		System.out.println("this is test1");
		int a=10/0;
	}
	
	
	
	

	public static void main(String[] args) {
		
		ThrowsDemo obj=new ThrowsDemo ();
		obj.test1();
		
		

	}

}
