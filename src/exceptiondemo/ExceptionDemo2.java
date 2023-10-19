package exceptiondemo;

public class ExceptionDemo2 {

	public static int div(int a, int b) {
		int c=-1;
		try
		{
			 c=a/b;//-->if b=0-->AE
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
			ae.printStackTrace();


		}
		return c;

	}

	public void show()
	{
		System.out.println("This show method");
	}


	public static void main(String[] args) {

		ExceptionDemo2 obj=new ExceptionDemo2();
		obj.show();
		//first way of calling the static method
		int d=ExceptionDemo2.div(10,2);
		System.out.println(d);

		//second way of calling the static method
		int dd=div(15,3);
		System.out.println(dd);

		int ddd=div(15,0);
		System.out.println(dd);



	}

}
