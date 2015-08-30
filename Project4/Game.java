
public class Game{
	
	private String gameModel;
	private int minBet, maxBet, nPlayer;
	private int houseChipOne, houseChipFive, houseChipTfive, houseChipHundred;
	private int houseBalance;
	Chips chip = new Chips();

	
	public void setGameModel(String model)
	{
		gameModel = model;
	}
	
	
    public void setNumPlayer(int n)
    {
		nPlayer = n;
    }

    
    public int getNumPlayer()
    {
	   return nPlayer;
    }

	
	public void setInitialChips(int one, int five, int tfive, int hundred)
	{
		houseChipOne = one;
		houseChipFive = five;
		houseChipTfive = tfive;
		houseChipHundred = hundred;
	}
	
	
	public void setMinBet(int min)
	{
		minBet = min;
	}
	
	
	public void setMaxBet(int max)
	{
		maxBet = max;
	}
	
	
	public int getMinBet()
	{
		return minBet;
	}
	
	
	public int getMaxBet()
	{
		return maxBet;
	}
	
	
	public String getGameModel()
	{
		return gameModel;
	}
	
	
	public int getHouseChipOne()
	{
		return houseChipOne;
	}
	
	
	public int getHouseChipFive()
	{
		return houseChipFive;
	}
	
	
	public int getHouseChipTfive()
	{
		return houseChipTfive;
	}
	
	
	public int getHouseChipHundred()
	{
		return houseChipHundred;
	}
	
	
	public void deductHouseChips(int one, int five, int tfive, int hundred)
	{
	
		houseChipOne -= one;
		houseChipFive -= five;
		houseChipTfive -= tfive;
		houseChipHundred -= hundred;
		
	}
	
	
	public void addHouseChips(int one, int five, int tfive, int hundred)
	{
		houseChipOne += one;
		houseChipFive += five;
		houseChipTfive += tfive;
		houseChipHundred += hundred;
	}
	
	
	public void houseTrackChips()
	{
		System.out.println(getHouseChipOne() +" $1.00 chip(s)");
		System.out.println(getHouseChipFive() +" $5.00 chip(s)");
		System.out.println(getHouseChipTfive()+" $25.00 chip(s)");
		System.out.println(getHouseChipHundred() +" $100.00 chip(s)");
	}
	
	
	public int houseChipsAmount()
	{
		return houseBalance = chip.amountInChips(houseChipOne, houseChipFive, houseChipTfive, houseChipHundred);
	}
	
	
}
