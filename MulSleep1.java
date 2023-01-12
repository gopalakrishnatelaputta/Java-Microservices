package eidiko1;

public class MulSleep1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		MulSleep1 t1=new MulSleep1();
		MulSleep1 t2=new MulSleep1();
		t1.start();
		t2.start();
	}
	

}
