
public class VIPPlayer extends Player {
	
	final private double cashBackRate = 0.05;
	private String vipID, name;
	Transaction transaction = new Transaction();
	
	public VIPPlayer(int initMoney, String ID, String n)
	{
		super(initMoney);
		vipID = ID;
		name = n;
	}

	
	public String getVipID()
	{
		return vipID;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	
	public int getBalance()
	{
		return super.getBalance();
	}
	
	
	public void money()
	{
		super.money();
		System.out.print("\nTotal cash back: $" + (cashBackRate * transaction.getBet()));
	}

}
