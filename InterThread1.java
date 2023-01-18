package eidiko1;

import java.util.Scanner;

public class InterThread1 {
	//static Scanner sc =new Scanner(System.in);
	int savings=20000; 
	synchronized void with_draw(double amount) throws InterruptedException
	
	{
		if(this.savings< amount)
		{
			System.out.println("Insufficient Funds ,Your current balence is :"+this.savings);
			System.out.println("Pease deposit again , Thankyou !!!");
		     wait();
			System.out.println("Amount credited  :");
			this.savings-=amount;
			if(this.savings>0)
			{
				
			
			System.out.println("With_draw successful your current balence is  :"+this.savings);
			}
			else
			{
				System.out.println("Insufficient Funds");
				System.out.println("Pease deposit again , Thankyou !!!");
			}
		}
	}
	synchronized void deposit(double dep_amount)
	{
		savings+=dep_amount;
		System.out.println("Deposit successful ,Your current savings is  :"+this.savings);
		notifyAll();
	}

		public static void main(String[] args) 
		{
			InterThread1 t1=new InterThread1();
			new Thread()
			{
				public void run()
				{
					try 
					{
						
						//System.out.println("Please enter the amount to With_Draw  :");
						//double amount=sc.nextInt();
						
					t1.with_draw(60000.00);
					//Thread.currentThread().setPriority(MAX_PRIORITY);
					//sc.close();
				    }
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
			.start();
			new Thread()
			{
				public void run()
				{	
					
				//	double dep_amount=sc.nextInt();
					//System.out.println("Please enter the amount to Deposit  :");
						t1.deposit(25000.00);
						//Thread.currentThread().setPriority(MIN_PRIORITY);
						//sc.close();	
						
				}
				
				
			}
			.start();
			
		}
		

	}