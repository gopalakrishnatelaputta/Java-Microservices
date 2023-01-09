package inheritance;

public class ClassA 
{
	void meth1()
	{
		System.out.println("class A method");
	
	}

}
class ClassB extends ClassA
{
	void meth2()
	{
		System.out.println("ClassB method called");
	}
	public static void main(String[] args) 
	{
		ClassA obj=new ClassA();
	     obj.meth1();
	     //obj.meth2();// WE CANNOT ACCESS CHILD CLASS MEMBERS WITH PARENT CLASS OBJECT.	
	
     ClassA obj1=new ClassB();
	obj1.meth1();
	//obj1.meth2();//// WE CANNOT ACCESS CHILD CLASS MEMBERS WITH PARENT CLASS OBJECT REFERANCE.
	
	ClassB obj2=new ClassB();//we can access both parent and child class (PURE INHERITANCE)
	obj2.meth1();
	obj2.meth2();
	
	//ClassB obj3=new ClassA();  COMPILATION ERROR.
}
}

















