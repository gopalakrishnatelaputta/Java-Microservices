package eidiko;

public class Cloning implements Cloneable 
{
   protected Object clone() throws CloneNotSupportedException
   {
	return super.clone();
	   
   }
   String name = "GeeksForgeeks";
   public static void main(String[] args) 
   {
	   Cloning obj=new Cloning();
	   try
	   {
		   Cloning obj2=(Cloning)obj.clone();
		   System.out.println(obj2.name);
		   
	   }
	   catch(CloneNotSupportedException e)
	   {
		   e.printStackTrace();
		   
	   }
	
}
}
