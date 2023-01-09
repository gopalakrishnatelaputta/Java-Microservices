package encapsulation;

import java.util.Scanner;

public class ClassA 
{
	private String empName;
	private int empID;
	
	public String getempName() 
	{
		System.out.println("hi  :"+2);
		return empName;
	}
	public void setempName(String empName)
	{
		System.out.println("hi :"+1);
		this.empName=empName;
	}
	public int getempID() 
	{
		System.out.println("hi  :"+4);
		return empID;
	}
	public void setempID(int empID)
	{
		System.out.println("hi :3"+3);
		this.empID=empID;
	}
	

}
 class ClassB 
{
	void display()
	{
		Scanner sc=new Scanner (System.in);
		ClassA obj=new ClassA();
		System.out.println("please enter the name ");
		obj.setempName(sc.next());
		
		System.out.println("Please enter your ID");
		obj.setempID(sc.nextInt());
		
		
	
	System.out.println("empName  :"+obj.getempName());
	System.out.println("empName  :"+obj.getempName());}
	public static void main(String[] args)
	{
		new ClassB().display();	
	}
}
