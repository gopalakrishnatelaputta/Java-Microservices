package eidiko1;

import java.util.Scanner;

public class String10 
{
	
	public static void main(String[] args) {
	Scanner sc = new Scanner("javachamp 2009, true 239");
	while (sc.hasNext()) {
	if (sc.hasNextBoolean())
	System.out.print("Boolean");
	if (sc.hasNextInt())
	System.out.print("Int");
	sc.next();
	}
	}
	
}
