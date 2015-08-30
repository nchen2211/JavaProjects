/*  Program: TestWalk.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/23/14
    Description: Test class RandomWalks by prompting user to enter the starting point,
    max step and boundaries.

    I certify that the code below is my own work.

	Exception(s): N/A

*/

import java.util.Scanner;

public class TestWalk {
	
	public static void main (String args[])
	{
		Scanner scan = new Scanner (System.in);
		int x = 0;
		int y = 0;
		int maxStep = 0;
		int bound = 0;
		
		System.out.println("First random walk");
		RandomWalks randWalk1 = new RandomWalks(10,5);
		
		System.out.println("Second random walk");
		System.out.println("Enter starting point of x: ");
		x = scan.nextInt();
		System.out.println("Enter starting point of y: ");
		y = scan.nextInt();
		System.out.println("Enter max step: ");
		maxStep = scan.nextInt();
		System.out.println("Enter boundary: ");
		bound = scan.nextInt();
		RandomWalks randWalk2 = new RandomWalks(maxStep, bound, x, y);
		
		randWalk2.walk();
		
		System.out.println("Author:  Noreen Chrysilla");
		
	}

}
