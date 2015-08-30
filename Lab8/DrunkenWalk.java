/*  Program: DrunkenWalk.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/23/14
    Description: Test class RandomWalks by prompting user to enter the starting point,
    max step and boundaries. Also keeps track how many times the drunk fall in one trial

    I certify that the code below is my own work.

	Exception(s): N/A

*/
import java.util.Scanner;


public class DrunkenWalk {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);
		int x = 0;
		int y = 0;
		int maxStep = 0;
		int countFall = 0;
		int bound = 0;
		int drunk = 0;
		int trial = 0;
		
		System.out.print("How many trials?");
		trial = scan.nextInt();
		
		while(drunk < trial)
		{
			System.out.println("Drunk# " + (drunk + 1));
			System.out.println("Enter starting point of x: ");
			x = scan.nextInt();
			System.out.println("Enter starting point of y: ");
			y = scan.nextInt();
			System.out.println("Enter max step: ");
			maxStep = scan.nextInt();
			System.out.println("Enter boundary: ");
			bound = scan.nextInt();
			RandomWalks randWalk = new RandomWalks(maxStep, bound, x, y);
			randWalk.walk();
			System.out.println("Drunken walker has fallen " + randWalk.fall());
			drunk++;
		}
		
		System.out.println("Author:  Noreen Chrysilla");
		
	}

}
