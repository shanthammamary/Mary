package oopsconcept.com;

public class StaticDemo3 {
	//block==> will gets executed only once
	
	/*
	 * static 
	 * {
	 *    code
	 * }
	 * 
	 * 
	 * 
	 */
	
	int aa=50;
	static int a=20;
	static int b=10;
	
	public void read()
	{
	System.out.println("This is read method"+a);
	
	System.out.println(aa);
	//int g=10/0;
	}
	
	static
	{
		System.out.println("*************This is static block*******************");
		
		System.out.println("This is Nucot Software company");
		
		System.out.println("********************************");
		
		int a=30;
		//System.out.println(aa);
		//int bb=aa+10;
		
		
	}
	
	static void add()
	{
		int sum=a+b;
		System.out.println(sum);
		//System.out.println(aa+a);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		StaticDemo3 obj=new StaticDemo3();
		obj.read();
		add();
		
		
		

	}

}
