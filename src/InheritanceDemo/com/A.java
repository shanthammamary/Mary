package InheritanceDemo.com;

class A
{
	

	
	
	public void test1()
	{
		System.out.println("This is test1 in parent");
	}
	
	public void test2()
	{
		System.out.println("This is test2 in parent");
	}
	
	public void test3()
	{
		System.out.println("This is test3 in parent");
	}
}

class B extends A
{
	
	
	@Override
	
	public void test1()
	{
		System.out.println("This is test1 in child");
	}
	
	
	
	public void show()
	{
		System.out.println("This is show in the child");
	}
}
	

class InheritanceDemo {

	public static void main(String[] args) {
		
		B obj1=new B();
		
		 obj1.test1();
		 obj1.test2();
		 obj1.test3();
		 obj1.show();
		

	}

}
