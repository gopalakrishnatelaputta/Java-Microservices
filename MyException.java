package eidiko1;

public class MyException extends Exception
{
   private static int acco[]= {1001,1002,1003,1004,1005};
   private static String name[]= {"Sairam","Gopala krishna","Imran","Pavan kumar","Mahesh"};
   private static double bal[]= {10000.00,20000.00,6000.00,70000.00,85000.00};
   MyException()
   {
	   
   }
   MyException(String str){super(str);}
   public static void main(String[] args) 
   {
	   try
	   {
		   System.out.println("Acco.no"+"\t"+ "Customer"+"\t"+"Balence");
		for(int i=0;i<5;i++)
		{
			System.out.println(acco[i]+"\t"+name[i]+"\t"+bal[i]);
			if(bal[i]<10000)
			{
				System.out.println("Insufficient FUNDS !!!  your current balence is :"+bal[i]);
			}
			else 
			{
				System.out.println("Please take your cash  :"+"Do you want to display u r balence?  ");
				
			}
			
		}
		
	   }
	   catch(Exception e)
	   {
		   
	   }
	
}
}
