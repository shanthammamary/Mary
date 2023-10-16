package stringdemo.com;


import java.util.Arrays;

public class StringDemo3 {
	

	public static void main(String[] args) {
		
		String s="Today we are discussing the java interview questions";
		//find the length of the given string
		int len=s.length();
		System.out.println(len);
		
		//printing the character at the specified location by passing index
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(50));
		
		System.out.println(s.indexOf('w'));
		//first occurrence of a 
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('a',s.indexOf('a')+1));
		
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("interview"));
		String ss="welcome to nucot";
		System.out.println(s.toUpperCase());
		
		String sss="  Welcome to nucot   ";
		System.out.println(sss);
		System.out.println(sss.trim());
		
		String ssss="WELCOME TO NUCOT";
		System.out.println(ssss.toLowerCase());
		
		String s1="nucot";
		String s2="nucot";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s11=new String("nucot");
		String s12=new String("nucot");
		System.out.println(s1==s11);
		System.out.println(s1.equals(s11));
		System.out.println(s11.equals(s12));
		System.out.println(s11==s12);
		
		String ss1="nucot";
		if(ss1.equals("Nucot"))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		
		String sss1="nucot";
		if(sss1.equalsIgnoreCase("Nucot"))
		{
			System.out.println("both are equal");
			
		}
		
		else
			
		{
			System.out.println("both are not equal");
		}
		
		//equalsIgnoreCase
		String ssss1="nucot";
		
		if(ssss1.equalsIgnoreCase("Nucot"))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		
		
		//contains
		String ssssss="welcome to nucot javasession";
		System.out.println(ssssss.contains("nucot"));
		System.out.println(ssssss.contains("dog"));
		
		
		//spilt
		
		String s3="Api-testing-automation-testing";
		String[] sp=s3.split("-");
		
		System.out.println(sp[0]);
		System.out.println(sp[2]);
		System.out.println(sp[1]);
		System.out.println(sp[3]);
		
		System.out.println(Arrays.toString(sp));
		
		String s4="Api/testing/automation/testing";
		
		String[] spp=s4.split("/");
		System.out.println(spp[0]);
		System.out.println(spp[2]);
		System.out.println(spp[1]);
		System.out.println(spp[3]);
		
		System.out.println(Arrays.toString(spp));
		
		String ss4="Api0testing0automation0testing";
		
		String[] ssrr=ss4.split("0");
		
		System.out.println(Arrays.toString(ssrr));
		
		String j="apple;mango;cherry;banana;pineapple";
		
		String[] jj=j.split("j");
		System.out.println(Arrays.toString(jj));
		
		for(String jjj:jj)
		{
			System.out.println(jjj);
			
		}
		
		String a="2";
		System.out.println(a+20);
		
		
		//string to int
		
		int aa=Integer.parseInt(a);
		System.out.println(aa+20);
		String z="11:00";
		
		//string to double
		
		double d= Double.parseDouble(z);
		System.out.println(d+5.00);
		
		int i=5;
		System.out.println(i+5);
		
		
		//String to int
		
		String i1=String.valueOf(i);
		System.out.println(i1+9);
		
		
		


			
			

	}

}
