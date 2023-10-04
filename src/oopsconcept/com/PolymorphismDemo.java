package oopsconcept.com;

public class PolymorphismDemo
    {
	
	
	//One of the OOps concepts in java
	//poly--many
	//morphism---ways
	
	//Two types of polymorphism
	//1.Compile time-Polymorphism(static)--> Method overloading
	//2.Run time Polymorphism is(dynamic)--->Method overiding
	
	//Compile time Polymorphism(staic)
	//Example-->Method overloading
	
	//1.with in the class, if you have mutiple methods
	//a.method name should be always same
	//b.with  the different parameters
	//c.with different name of parameters 
	//d.with different order of parameters 
	
	
	
	void show(int jj)
	{
		
	}
	
	void area(int r)
	{
		System.out.println("This is area of the circle");
	}

	void area(String s)
	{
		System.out.println("This is string");
		
	}
	
	void area(int l, int w)
	{
		System.out.println("This is area of the triangle");
		
	}
	
	void area(int l,String ss)
	{
		System.out.println("This is area of the triangle");
		
	}
	
	void area(String sss,int a)
	{
		System.out.println("This is area of the triangle");
		
	}
	
	void area(int a,int b,int c,int d)
	{
		System.out.println("This is area of the room");
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("area");
		PolymorphismDemo obj=new PolymorphismDemo();
		obj.area(40,20,50,70);
		
		

	}

}
