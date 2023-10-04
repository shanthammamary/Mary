package oopsconcept.com;

public class MethodOverloadingDemo2 {
	
	
	void loginPage()
	{
		System.out.println("login in is successfull");
	}
	
	void loginPage(String name)
	{
		System.out.println("login with username successfull");
	}
	
	void loginPage(String name,String password)
	{
		System.out.println("login with usrename password is successfull");
	}
	
	void loginPage(String name,String password,int key)
	{
		System.out.println("login with usrename password and key is successfull");
	}

	public static void main(String[] args) {
		
		MethodOverloadingDemo2 obj=new MethodOverloadingDemo2();
		obj.loginPage();
		obj.loginPage("Nucot");
		obj.loginPage("Admin","admin123");
		obj.loginPage("Admin","admin123",123);
		
		

	}

}
