package eidiko1;

import java.io.FileInputStream;
import java.io.IOException;

public class File2 
{
	public static void main(String[] args) throws IOException 
	{
		try
		{
			
		
		FileInputStream fin1=new FileInputStream("/home/bandaru/Desktop/Input.txt");
		//int x=fin1.read();
		
		int i=0;
		while((i=fin1.read())!=-1)
		{
			System.out.print((char)i);
		}
		fin1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
