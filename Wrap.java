package eidiko;

public class Wrap 
{
	public static void main(String[] args) {
		Integer i=Integer.valueOf(10);
		Integer a=20;
		
		System.out.println(i);
		System.out.println(a);
		
		Integer b=new Integer(10);
		int c=b.intValue();
		int j=b;
		System.out.println("--------------------------------------------------------------------");
		System.out.println(b);
		System.out.println(c);
		System.out.println(j);
		
	}

	

}
