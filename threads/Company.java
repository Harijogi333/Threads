package threads;

public class Company {
	
	int n;
	public synchronized void produceItem(int n)
	{
		this.n=n;
		System.out.println("Produced item"+this.n);
	}
	public synchronized int consumedItem()
	{
		System.out.println("Consumed item"+this.n);
		return this.n;
	}

}
