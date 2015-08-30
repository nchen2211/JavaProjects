
public class Chips {
	
	final private int one = 1;
	final private int five = 5;
	final private int tfive = 25;
	final private int hundred = 100;
	
	public int getOne()
	{
		return one;
	}
	
	public int getFive()
	{
		return five;
	}
	
	public int getTfive()
	{
		return tfive;
	}
	
	public int getHundred()
	{
		return hundred;
	}

	public int totalOne(int nOne)
	{
		int totOne;
		totOne = nOne * getOne();
		return totOne;
	}
	
	
	public int totalFive(int nFive)
	{
		int totFive;
		totFive = nFive * getFive();
		return totFive;
	}
	
	
	public int totalTfive(int nTfive)
	{
		int totTfive;
		totTfive = nTfive * getTfive();
		return totTfive;
	}
	
	
	public int totalHundred(int nHundred)
	{
		int totHundred;
		totHundred = nHundred * getHundred();
		return totHundred;
	}
	
	
	public int amountInChips (int nOne, int nFive, int nTfive, int nHundred)
	{
		return ((nOne * getOne()) + (nFive * getFive()) + (nTfive * getTfive()) + (nHundred * getHundred()));
	}
}

