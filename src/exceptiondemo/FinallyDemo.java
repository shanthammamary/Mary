package exceptiondemo;

public class FinallyDemo {

	public static void main(String[] args) {

		try
		{
			int aa=10/0;
		}
		
		catch(Exception ae)
		{
			System.out.println("AE is coming");
			
		}
		
		finally
		{
			System.out.println("I will always execute if there no exception if there is no exception ");
			System.out.println("Close DB");
			
		}
	}

}
