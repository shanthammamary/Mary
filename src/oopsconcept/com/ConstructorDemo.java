package oopsconcept.com;

public class ConstructorDemo {
	
	String name;
	int ssn;
	int age;
	
	ConstructorDemo(String n,int s,int a)
	{
		name=n;
		age=a;
		ssn=s;
		
		//--> this.age-->it will refer to class variable 
		//normal--> local variable
	}
	
	

	public static void main(String[] args) {
		
		
		ConstructorDemo obj=new ConstructorDemo("nucot",10,20);
		//obj.age;
		
		System.out.println(obj.name+":-->"+obj.ssn+":-->"+":-->"+obj.age);
		
		

	}

}
