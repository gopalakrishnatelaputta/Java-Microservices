package eidiko;

import java.util.Collections;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_enu 
{
	public static void main(String[] args) 
	{
		Vector<Object> v =new Vector<Object>();
		
		v.addElement("GOPAL");
		v.addElement("VIRAT KOHLI");
		v.addElement("ROHITH SHARMA");
		v.addElement("HARDIK");
		v.addElement("DEEPAK");
		v.addElement("SAMSON");
		v.addElement("AXAR");
		v.addElement("UMRAN");
		v.addElement("KISHAN");
		
	System.out.println(v);
	System.out.println("==================================================================================");
	Enumeration<Object>e=Collections.enumeration(v);
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	

}
}
