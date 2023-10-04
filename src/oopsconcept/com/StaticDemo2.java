package oopsconcept.com;

public class StaticDemo2 {
	
	//non static method
	
	public void show()
	{
		System.out.println("This is show method");
		
	}
	
	//static method
	public static void display()
	{
		System.out.println("This is display method");
	}

	public static void main(String[] args) {
		//StaticDemo2 obj=new StaticDemo2();
		//obj.show;
		//1.way
		//StaticDemo2.display();
		//2.way
		
		display();
		
		
		
		
	}

}
