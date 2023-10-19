package exceptiondemo;

public class MultipleTryDemo {
	
	int a;

	public static void main(String[] args) {

		TryCatchNullPointerDemo obj=new TryCatchNullPointerDemo();
		obj=null;
		
		try
		{
			obj.a=10;
		}
		
		catch(NullPointerException e)
		{
			System.out.println("NP is coming");
		}
		
		try
		{
			int aa=10/0;
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
			
		}
		
		System.out.println("Handling multiple exception");
		
	}

}
