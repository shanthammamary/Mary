package exceptiondemo;

public class TryCatchNullPointerDemo {
	
	int a;
	
	void show()
	{
		
		System.out.println("this is a shoe method");
	}

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
			
		System.out.println("Thanks");
		
		TryCatchNullPointerDemo obj1=new TryCatchNullPointerDemo();
		obj.show();
		
		
		

	}
}


