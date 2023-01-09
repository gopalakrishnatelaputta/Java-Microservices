package eidiko;

public class Encapsulation1 
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
class  test
{
	public static void main(String[] args) {
		Encapsulation1 obj=new Encapsulation1();
		obj.setName("ravi");
		System.out.println(obj.getName());
	     
	}
}
