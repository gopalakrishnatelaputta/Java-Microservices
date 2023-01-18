package eidiko1;

public class PredefinedStreams 
{
      public static void main(String []args)
      {
    	  try
    	  {
    		  byte[]b=new byte[10];
    		  System.out.println("enter any number");
    		  System.in.read(b);
    		  String s1=new String(b);
    		  String s2=s1.trim();
    		  int x=Integer.parseInt(s2);//converting String to Integer
    		  System.out.println(x);
    	System.out.println(b.length);
    	  }
    	  catch(Exception e)
    	  {
    		  System.err.println(e);
    	  }
      }

}
