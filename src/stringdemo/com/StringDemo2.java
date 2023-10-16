package stringdemo.com;

public class StringDemo2 {
	
	public String replace(String str1,char c,int index)
	{
		StringBuilder sb=new StringBuilder(str1);
		sb.setCharAt(0,c);
		
		return sb.toString();
	}

	public static void main(String[] args) {

		String str1="abcdef";
		
		//StringDemo2 ob11=new StringDemo2();
		//String ww=ob11.replace(str1,'c',2);
		//System.out.println(ww);
		
		char cc=str1.charAt(1);
		System.out.println(cc);
		
		
	/*
		
		// String is immutable class
		
		
		//concate
		
		String s="nucout";
		String ss="company";
		System.out.println(s);
		System.out.println(ss);
		System.out.println(s+ss);
		System.out.println(s+ss+"Pvt Ltd");
		
		
		int a=20;
		int b=30;
		System.out.println(a+b+s);
		System.out.println(s+a+b);
		System.out.println(s+(a+b));
		
		String str="bangalore";
		int lenstr=str.length();
		System.out.println(lenstr);
		
		
		//StringBuilder-->mutable--classes
		

		StringBuilder sb=new StringBuilder("Nucot");
		StringBuilder sss=sb.append("company");
		System.out.println(sss);
		StringBuilder rev=sb.reverse();
		System.out.println(rev);
		int len=sb.length();
		System.out.println(len);
		
		
		//String fff=sb.replace(0,4,sb);
		
		System.out.println(sb.setCharAt(0,'P'));
		
		
	*/	
		
	}

}
