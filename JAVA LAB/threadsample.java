class Threadsample
{
	public static void main(String args[])
	{
	samplethread m=new samplethread();
	
		try
		{
		for(int i=1;i<10;i++)
		{
			for (int j=0;j<i;j++)
			{
			System.out.print(""+i);
			}
		System.out.println('\n');
		}
		}
		catch (InterruptedException e )
		{
		System.out.println(e);
		}
	}
}

													//NOT WORKING

class samplethread implements Runnable
{
	samplethread()
	{
	Thread u =new Thread(this,"Pattern");
	System.out.println("The Name of Thread is ="+u.getName());
	u.start();
	}
	
	public void run()
	{
		System.out.println("\nRun method is invoked by m.start---->");
		try
		{
			for(int count =1;count<10;count++)
			{
				for (int j=0;j<count;j++)
				{
				System.out.print("   *   ");
				try{
				Thread.sleep(2);
				}
				catch(InterruptedException e)
		{
		  e.printStackTrace();
		}
				}
			System.out.println("\n");
			}
			}                                       				
			catch (Exception e)
			{e.printStackTrace();}
			
		
		
	}
}
	
	
