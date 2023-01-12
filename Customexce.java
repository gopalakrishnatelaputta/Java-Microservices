package eidiko1;

@SuppressWarnings("serial")
public class Customexce extends MyCus_Exce
{
	public Customexce(String string) {
		super(string);
		
	}

	public static void main(String[] args) {
		
	
	try 
	{
		throw new MyCus_Exce("My Cust Exception is created  :");
	}
	catch(MyCus_Exce m)
	{
		System.out.println("Execption cought "+m);
	}
	finally
	{
		System.out.println("1) throw an own exception in the try block 2)Create Exception class same exception name 3)Create its regarding constructor");
	}

}
}
