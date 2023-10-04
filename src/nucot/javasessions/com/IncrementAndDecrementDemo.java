package nucot.javasessions.com;

public class IncrementAndDecrementDemo {

	public static void main(String[] args) {
		
		int a=2;
		int b=a++;
		
		System.out.println(a);
		
		System.out.println(b);
		
		
		int aa=4;
		int bb=aa++;
		
		System.out.println(aa);
		
		System.out.println(bb);
		
		int aaa=4;
		int bbb=++aaa;
		
		System.out.println(aaa);
		
		System.out.println(bbb);
		
		int aaaa=-4;
		int bbbb=++aaaa;
		
		System.out.println(aaaa);
		
		System.out.println(bbbb);
		
		int i=2;
		int j=i--;
		
		System.out.println(i);
				
				System.out.println(j);
				
				int ii=-3;
				int jj=ii--;
				
				System.out.println(ii);
				
				System.out.println(jj);
				
				int p=5;
				int q=--p;
				
				System.out.println(p);
				
				System.out.println(q);
				
				// Normal variables
				
				int x=10;
				x=20;
				x=30;
				x=40;
				
				System.out.println(x);
				
				
				//final variables//constant variables
				
				final int days=7;
				final int noofdaysinyear=365;
				final char gender='f';
				final String s="Nucot";
				
				System.out.println(gender);
				
		

	}

}
