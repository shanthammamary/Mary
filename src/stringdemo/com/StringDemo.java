package stringdemo.com;

public class StringDemo {

	public static void main(String[] args) {

		//String literals --SCP
		String s="nucot";
		String s1="nucot";
		String s2="Nucot";
		System.out.println(s==s1);
		System.out.println(s==s2);
		
		String obj=new String("nucot");
		String obj1=new String("nucot");
		String obj3=new String("nucot");
		
		System.out.println(s==obj);
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
	}

}
