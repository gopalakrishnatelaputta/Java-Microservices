package eidiko1;

public class String6 
{
	public static void main(String[] args) {
		String s1 = null;
		String s2 = null;
		if (s1 == s2)
		System.out.print("A");
		if (s1.equals(s2))//it checks content in the string but there is no content it shows null pointer exception
		System.out.print("B");
		}

}
