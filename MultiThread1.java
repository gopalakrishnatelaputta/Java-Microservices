package eidiko1;

public class MultiThread1 extends Thread 
{

	
	public void run() {
		for(int i=1;i<=5;i++)
		{
		System.out.println("Thread is running :"+i);
		}
	}
	public static void main(String[] args) 
	{
		MultiThread1 t1=new MultiThread1();
		
		t1.start();
		
		
	}
}
