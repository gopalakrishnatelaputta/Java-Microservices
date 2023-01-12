package eidiko1;

public class MultiRunnable1 implements Runnable 
{
	public void run() 
	{
		System.out.println("is running  ");
	}
	public static void main(String[] args) 
	{
		MultiRunnable1 m1=new MultiRunnable1();
		Thread t1=new Thread(m1,"Gopala krishna");
		t1.start();
		String str=t1.getName();
		System.out.println(str);
	}
	

}
