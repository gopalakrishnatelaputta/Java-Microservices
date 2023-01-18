package eidiko1;

import java.io.FileInputStream;

public class FileF {

	public static void main(String[] args) 
	{
		try
	     {
	     FileInputStream fin=new FileInputStream("/home/bandaru/Desktop/Fis1.class");
	     int i=fin.read();
	     System.out.print((char)i);
	     fin.close();
	     }
	catch(Exception e)
	    {
		  System.out.println(e);
	    }
		

	}

}
