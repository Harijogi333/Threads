package threads;

public class Consumer extends Thread
{

	Company c;
	public Consumer(Company c)
	{
		this.c=c;
	}
	public void run()
	{
		while(true)
		{
			c.consumedItem();
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}

}
