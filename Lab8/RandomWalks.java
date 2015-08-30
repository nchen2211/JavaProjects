/*  Java Class:RandomWalks.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/23/14
    Description: create a class RandomWalk to generate a random number of step and determine
    the direction of each step. The steps taken are bounded with max steps and boundaries

    I certify that the code below is my own work.

	Exception(s): N/A

*/
import java.util.Random;
public class RandomWalks {

	private int x;
	private int y;
	private int maxStep;
	private int countStep;
	private int bound;
	private int countFall;
	
	public RandomWalks(int max, int edge)
	{
		maxStep = max;
		bound = edge;
		x = 0;
		y = 0;
		countStep = 0;
	}
	
	public RandomWalks(int max, int edge, int startX, int startY)
	{
		maxStep = max;
		bound = edge;
		x = startX;
		y = startY;
	}
	
	public String toString()
	{
		return "Steps: " + countStep + "; Position: (" + x + "," + y + ")";  
	}
	
	public void takeStep()
	{
		Random rand = new Random();
		int step = 0;
		step = rand.nextInt(4);
		System.out.println("Steps is: " + step);
		
		switch(step)
		{
		case 0:
			System.out.println("One step to the left.");
			x--;
			countStep++;
			break;
		case 1:
			System.out.println("One step to the right.");
			x++;
			countStep++;
			break;
		case 2:
			System.out.println("One step up.");
			y++;
			countStep++;
			break;
		case 3:
			System.out.println("One step down.");
			y--;
			countStep++;
			break;
		}
	}
	
	public boolean moreSteps()
	{
		if(countStep < maxStep)
		{
			return true;
		}
		return false;
	}
		
	public boolean inBounds()
	{
		if(x <= bound && y <= bound && x >= -1 * bound  && y >= -1 * bound)
		{
			return true;
		}
		else
		{
			countFall++;
			return false;
		}
	}
	
	public int fall()
	{
		return countFall;
	}
		
	public void walk()
	{
		while(countStep < maxStep)
		{
			takeStep();
			moreSteps();
			inBounds();
		}
	}
}
