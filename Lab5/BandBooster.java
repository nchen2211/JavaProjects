/*Java class: BandBooster.java
 * Author: Noreen Chrysilla
 * Class: CSCI 145
 * Date: Due on 3/28/2014 (close lab)
 * Description: 
 * 
 * Exception: I certified code below is my own.
 */

public class BandBooster {
	
	private String name;
	private int boxesSold;
	
	public BandBooster(String n)
	{
		name = n;
		boxesSold = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int updateSale(int box)
	{
		boxesSold += box;
		return boxesSold;
	}
	
	public String toString()
	{
		return name + ": " + boxesSold + " boxes";
	}
	
}
	

