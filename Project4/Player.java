
public abstract class Player implements Money{
	
	private int seatNum;
	private int initBalance;
	Transaction transaction = new Transaction();
	
	public Player(int initMoney)
	{
		seatNum = 1 ;
		initBalance =  initMoney;
	}
	
	
	public void setSeatNum(int seat)
	{
		seatNum = seat;
	}
	
	public int getSeatNum()
	{
		return seatNum;
	}
	
	
	public int getBalance()
	{	
		return initBalance;
	}

	
	public void trackChips()
	{
		System.out.print("\nTotal chips you have: ");
		transaction.trackChips();
	}
	
	
	public void money()
	{
		System.out.print("\nTotal cash: $" + transaction.getTotalCash());
		System.out.print("\nTotal amount in chips: $" + transaction.getAmountInChips());
		
	}
	
	
}
