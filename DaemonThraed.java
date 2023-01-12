package eidiko1;

public class DaemonThraed extends Thread
{
	public void run()
	{
		try
		{
			if(Thread.currentThread().isDaemon())
			{
			     System.out.println("Deamon Thread work");	
			}
			else {
				System.out.println("Normal Thread work");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		DaemonThraed t1=new DaemonThraed();
		DaemonThraed t2=new DaemonThraed();
		DaemonThraed t3=new DaemonThraed();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
