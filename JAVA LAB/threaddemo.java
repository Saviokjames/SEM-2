class threaddemo
{	
	public static void main(String args[])
	{
		mythread m=new mythread();
		m.start();
			try 
			{
				Thread.sleep(12);
			}
			catch(InterruptedException ie)
			{
			System.out.print(ie);
			}
		m.run();
		m.setName("S2MCA");
		System.out.println("\n The Name of the Thread Displayed through main method ids = "+m.getName());
	}
}	




class mythread extends Thread
{
	mythread()
	{
		System.out.println("The Thread inside the conductor and the name is ="+Thread.currentThread().getName());
	}
	public void run()
	{
	System.out.println("\n thr name of the thread is ="+Thread.currentThread().getName());
	}
	void Ex_sleep()
	{
	 	System.out.println("Inside Ex_sleep");
	 	try
	 	{
	 		Thread.sleep(12);
	 	}
	 	catch(InterruptedException ie )
	 	{
	 	System.out.print(ie);
	 	}
	} 
}		
	
	
	
