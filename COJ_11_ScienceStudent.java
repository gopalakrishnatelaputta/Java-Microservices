package abstraction;

abstract class COJ_11_Student 
{
	protected String sname;
	protected String Class;
	protected static int TotalnoStu;

	public abstract int getper();
	
	public static int gettotalst()
	{
		int a=0;
		return ++a ;
	}
	COJ_11_Student()
	{                       //  INITIALIZATION
	}
	COJ_11_Student(String sname,String Class)
	{
		this.sname=sname;
		this.Class=Class;
		gettotalst();//  INITIALIZATION
		//Increase the students 
	}

}
public class COJ_11_ScienceStudent extends COJ_11_Student
{
	private int phymarks=64;
	private int chemarks=78;
	private int mathmarks=89;
	
	COJ_11_ScienceStudent(String sname,String Class)
	{
		super(sname,Class);
	}
	
      public int getper()
       {
    	  int total=phymarks+chemarks+mathmarks;
    	  int percentage = total/3;
	       return percentage;
       }
      
}