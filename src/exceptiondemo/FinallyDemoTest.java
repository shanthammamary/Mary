package exceptiondemo;

public class FinallyDemoTest {
	
	//CheckedException-Compile time
		//UnCheckedException-RunTime


	public static void main(String[] args) {
		
		try
		{
			int a=3/0;
		}
	//	catch(Exception e)
	//	{
			
	//		System.out.println("Ae exception");
			
	//	}
		
		finally
		{
			
			System.out.println("I always excute");
			
		}

	}

}
