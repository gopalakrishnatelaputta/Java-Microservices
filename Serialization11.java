package eidiko1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization11 
{
	public static void main(String[] args) throws IOException 
	{
		try
		{
		Student50 s1=new Student50(101,"Sairam");
		
		FileOutputStream fos=new FileOutputStream("Input.txt");
		ObjectOutputStream obs=new ObjectOutputStream(fos);
		obs.writeObject(s1);
		obs.flush();
		obs.close();
		System.out.println("Success....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
