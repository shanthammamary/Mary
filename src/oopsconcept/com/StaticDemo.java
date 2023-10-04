package oopsconcept.com;

public class StaticDemo {
	
	//static keyword is used for memory management
	//static can be used
	//variable---->local variable,class variable,static variable
	//method
	//classes
	//blocks
	
	//****************************\
	
	//class variable
int a=10;

//static variable--- will load once in to memory
	
	static String companyName="Raj";
	static int b=20;
	
	public static void main(String[] args) {
		
     StaticDemo obj=new StaticDemo();
     
     System.out.println(obj.a);
     
     //two ways to execute static 
     //1.Classname.variable_name
     //2.directly use variable_name
     
     
     
     //1.classname.variable_name
     
     System.out.println(StaticDemo.companyName);
     
     String value=StaticDemo.companyName="RajKumarabc";
     
     System.out.println(value);
     
     System.out.println(value+"Roa");
     
     //2.directly use variable_name
     
     System.out.println(companyName="aaa");
     
     
     
     System.out.println(StaticDemo.b);
     
     System.out.println(b);
    

}
}
