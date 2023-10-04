package oopsconcept.com;

public class Employee {
	
	String name;
	int ssn;
	int age;
	double salary;
	String address;
	
	//constructor 
	//name as same as the class name
	//cannot have any return value\ void
	//constructor will be called when you create the object 
	//default constructor//zero
	//constructors can be overloaded
	
	
	public Employee() //zero parameter constructor
	{
		System.out.println("this is constructor");
	}
	
	public Employee(String name)
	{
		System.out.println("this is one parameterzised constructor");
	}
	
	
	public Employee(String name,int ssn)
	{
		System.out.println("this is constructor");
	}

	public Employee(String name,int ssn,int age)
	{
		System.out.println("this is constructor");
	}
	
	public Employee(String name,int ssn,int age,double salary)
	{
		System.out.println("this is constructor");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("constructor concept");
		
		Employee obj1=new Employee();
		obj1.ssn=111;
		obj1.age=22;
		obj1.address="Bangalore";
		
		//Employee obj2=new Employee();
		//Employee obj3=new Employee();
		//Employee obj4=new Employee();
		//Employee obj5=new Employee();
		
		
		
		
		
		

	}

}
