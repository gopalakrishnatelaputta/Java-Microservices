package polymorphism;


public class Overloading 
{
	private static void meth1()
	{
		System.out.println(10);
	}
	final int meth1(int a)
	{
		System.out.println(20);
		return a;
	}
	static final protected void meth1(int a,String s)
	{
		System.out.println(30);
	}
	String meth1(String s,int a)
	{
		System.out.println(40);
		return s;
	}
	public void meth1(byte a)
	{
		System.out.println(50);
	}
	void meth1(String s)
	{
		System.out.println(60);
	}
	private StringBuffer meth1(StringBuffer sb)
	{ 
		
		System.out.println(70);
		return sb;
	}
	public static void main (String []args)
	{
		 Overloading aobj1=new Overloading(0);
		aobj1.meth1();
		   aobj1.meth1(300);
		   aobj1.meth1(200,"JAVA");
		   aobj1.meth1("king",828);
		   aobj1.meth1((byte)25);
		   aobj1.meth1("Rolex");
		   aobj1.meth1(new StringBuffer("Hello world"));
	       
		   
		   Overloading.main();
		   main(new int[] {1,3,4,5});
		   
	}
	public static void main() 
	{
		System.out.println("1 st main");
		
	}
	public static int main(int[] args) 
	{
		
	
		//System.out.println("2 nd main "+Arrays.toString());
		return 1;
	}
	/*Overloading()
	{
		this.();
		System.out.println("Default constructor");
		
	}*/
	Overloading(int a)
	{
		System.out.println("Parent constructor");
		
	}
	static
	{
		System.out.println("Anything");
	}

}
