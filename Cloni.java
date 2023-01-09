package eidiko;

public class Cloni implements Cloneable  
	{
		protected Object clone() throws CloneNotSupportedException
		{
			return null;
			
		}
		String nam="GK";
		public static void main(String[] args) 
		{
			//String name="gopal";
			Cloni obj=new Cloni();
			try {
		    Cloni obj1=(Cloni)obj.clone();
		    System.out.println(obj1.nam);
			}
			catch(CloneNotSupportedException e)
			{
				e.printStackTrace();
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			
		}

	}


