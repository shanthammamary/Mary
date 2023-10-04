package oopsconcept.com;

public class MethodOverloadingDemo {
	
	void search()
	{
			System.out.println("searching item with out any condition");
			
	}
	
	void search(String name,int price)
	{
		System.out.println("searching item with name and price");
		
	}
	
	
	void search(String name,int price,int rating)
	{
		System.out.println("searching item with name price and rating");
		
	}
	
	void search(String name,int price,int rating,int specification)
	{
		System.out.println("searching item with name price rating and specification");
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		MethodOverloadingDemo obj=new MethodOverloadingDemo();
		obj.search();
		obj.search("apple",50000);
		obj.search("apple",50000,5);
		obj.search("apple",50000,5,256);
		
		
		

	}

}
