package eidiko1;

public class GarbageColle 
{
	static int count=1;
	public static void main(String[] args) 
	{
		GarbageColle s1=new GarbageColle();    // first way to make un-referenced object by assigning another object 
		GarbageColle s2=new GarbageColle();
		//s1=s2;
		//s1.freeMemory();
		//System.out.println(Runtime.freeMemory());
		//System.out.println(Runtime.getRuntime());
		GarbageColle e1=new GarbageColle();   //second way of making un-referenced by null 
		//e1=null;
		e1.meth1();
		e1.meth2();
		new GarbageColle().meth1();     //3rd way to make un-referenced object by anonymous object*/
		
		
		System.gc();
	}
	
	public void finalize()
	{
		System.out.println("Object is collected by garbage collector   "+GarbageColle.count);
		GarbageColle.count++;
	}
	void meth1()
	{
		System.out.println("two");
	}
	void meth2()
	{
		System.out.println("three");
	}
	static 
	{
		System.out.println("this is static block");
	}
	{
		System.out.println("one");
	}

}
