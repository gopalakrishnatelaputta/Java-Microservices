package eidiko1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization11 
{
	public static void main(String[] args) 
	{
		try
		{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Input.txt") );
			Student50 s1=(Student50)ois.readObject();
			System.out.println(s1.id+"  "+s1.name);
			ois.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
