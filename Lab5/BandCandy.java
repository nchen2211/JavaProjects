/*Program: BandCandy.java
 * Author: Noreen Chrysilla
 * Class: CSCI 145
 * Date: Due on 3/28/2014 (close lab)
 * Description: 
 * 
 * Exception: I certified code below is my own.
 */

import java.util.Scanner; 

public class BandCandy {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		BandBooster bandbooster1 = new BandBooster("Noreen");
		BandBooster bandbooster2 = new BandBooster("Marline");
		
		int boxSold = 0;
		for(int i=1; i<=3; i++)
		{
			System.out.println("Week" + i);
			System.out.println("Enter the number of boxes sold by " + bandbooster1.getName());
			boxSold = scan.nextInt();
			System.out.println("Updated sales for " + bandbooster1.getName()+ " " + bandbooster1.updateSale(boxSold));
			bandbooster1.toString();
			
			System.out.println("Enter the number of boxes sold by " + bandbooster2.getName());
			boxSold = scan.nextInt();
			System.out.println("Updated sales for " + bandbooster2.getName()+ " " + bandbooster2.updateSale(boxSold));
			bandbooster2.toString();
		}
		System.out.println("Author: Noreen Chrysilla");
	}
	

}
