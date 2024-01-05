package threads;

public class Producer extends Thread
{
	Company c;
	public Producer(Company c)
	{
		this.c=c;
	}
	public void run()
	{
		int i=1;
		while(true)
		{
			c.produceItem(i);
			i++;
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
}
