package exceptiondemo;

public class SingleTrywithMultipleExpDemo {
	
	int aa;

	public static void main(String[] args) {
		
		SingleTrywithMultipleExpDemo obj=new SingleTrywithMultipleExpDemo();
		
		obj=null;
		
		try
		{
			
			int a=10/0;
			obj.aa=10;
			
		}
		
		catch(Exception e)
		{
			
			System.out.println("Multiple exception is caoming");
			e.printStackTrace();
		
		}
		
		
		}

	}


