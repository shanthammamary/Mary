package exceptiondemo;

public class ThrowDemoo {

	public static void main(String[] args) {
		
		try
		{
			throw new Exception("Nucot user is not found in exception");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			e.printStackTrace();
		}
		
		String testdata=null;
		if(testdata==null)
		{
			
			try
			{
				throw new Exception("Data not found in exception");
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
