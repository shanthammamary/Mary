package program;


final class A {
	
	public final void add()
	{
		System.out.println("this parent class method");
	}
}


class B extends A
{
	@Override
	
	public  void add()
	{
		System.out.println("this is child class method");
	}
}



public class FinalDemo {

	public static void main(String[] args) {

		final int a=10;
		
		System.out.println(a);
	}

}
