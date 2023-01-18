package eidiko1;

public class String3 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("javachamp");
		StringBuffer sb2 =new StringBuffer("javachamp");
		
		boolean stmt1 =sb1.equals(sb2) ;
		boolean stmt2 = sb1 == sb2;
		System.out.println(stmt1);
		System.out.println(stmt2);
		
		String s1 = new String("javachamp");
		String s2 = new String("javachamp");
		boolean stmt3 = s1.equals(s2);
		boolean stmt4 = s1 == s2;
		
		System.out.println(stmt3);
		System.out.println(stmt4);
	}

}
