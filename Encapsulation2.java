package eidiko;

public class Encapsulation2 
{
	
		private String name;
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}

	}
	class  test1
	{
		public static void main(String[] args) {
			Encapsulation2 obj=new Encapsulation2();
			obj.setName("ravi");
			System.out.println(obj.getName());
		     
		}
	}


