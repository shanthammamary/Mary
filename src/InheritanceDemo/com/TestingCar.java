package InheritanceDemo.com;

public class TestingCar {	
	
	public static void main(String[] args) {
		
		Car obj1=new Car();
		obj1.start();
		
		BMW obj=new BMW();
		obj.start();//Overridden
		obj.autoParking();//individual
		obj.stop();
		obj.color();
		obj.refule();
		
		//top/up casting---Yes it is supported 
		//child class object can be referred by the parent class ref variable
		//Top/up casting can access only overriden and methods of parent(inherited methods)
		
		
		System.out.println("***********this is top casting**********");
		Car c=new BMW();
		c.start();
		c.stop();
		c.color();
		c.refule();
		
		System.out.println("***********this is down casting**********");
		
		
		//down casting 
		//parent class object can be referred by child class ref variable
		
		BMW b=(BMW)new Car();
		//ClassCastException
	}

}
