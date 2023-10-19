package exceptiondemo;

public class OnlyTryDemo {
	
	int a;
	public static void main(String[] args) {
		try
		{
			//int a=10/0;
			 OnlyTryDemo obj=new  OnlyTryDemo();
			 obj=null;
			 obj.a=10;

		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
		}
		catch(Exception e)
		{
			System.out.println("If no one is handling i can handle it");
		}




	}

}
