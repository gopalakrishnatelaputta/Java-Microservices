package eidiko1;
import java.lang.Thread;
//import java.io.*;

public class MulMainSleep1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		try 
		{
			for(int i=1;i<=5;i++)
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
