package eidiko1;

import java.util.Scanner;

public class MulCatch1 
{
	public static void main(String[] args) {
		
		try 
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			//Scanner sc=new Scanner(System.in);
			//System.out.println("Enter the 1st value  :");
			//int x=sc.nextInt();
			//int y=sc.nextInt();
		
			
			int z=x/y;
			System.out.println(z);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.err.println("Please enter the Integer values  ");
		}
		catch(NumberFormatException ne)
		{
			System.err.println("Please enter two digits only  ");
		}
		catch(ArithmeticException aee)
		{
			System.err.println("Please enter second number except zero ");
		}
	}

}
