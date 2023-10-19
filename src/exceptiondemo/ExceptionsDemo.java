package exceptiondemo;

public class ExceptionsDemo {

	public static void main(String[] args) {

		
		// try catch and finally block
		
		
		//Syntax
		/*
		 * try
		 * {
		 * 
		 * }
		 * catch
		 * {
		 * 
		 * }
		 * finally block
		 * {
		 * 
		 * }
		 */
		
		System.out.println("welcome to exception handling in java");
		
		try
		{
			int a=10/0;
			System.out.println("in the try block");
			System.out.println("in the try block");
			System.out.println("in the try block");
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
			ae.printStackTrace();
			
			
		}
		
		System.out.println("Thanks");
		

			
		}
		
	}


