package InheritanceDemo.com;

public class BMW extends Car {
	
	@Override
	public void start()
	{
		System.out.println("this is start in BMW");
		System.out.println("this new smart start");
	}
	
	public void autoParking()
	{
		System.out.println("this is autoParking in BMW");
	}
	

}
