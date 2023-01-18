package eidiko1;


import java.io.FileOutputStream;
import java.io.IOException;

public class Output1 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("/home/bandaru/Desktop/Input.txt");
		
		
		fos.write(65);
		fos.close();
		System.out.println("Success.....");
		
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
