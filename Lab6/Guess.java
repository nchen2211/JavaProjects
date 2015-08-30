/*  Program: Guess.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: due on 4/9/2014
    Description: Guess a number generated by random generator. Give the user a clue whether
    it is too low/too high. Then congratulate him when his guess is correct

    I certify that the code below is modified by me.

	Exception(s): N/A

*/
import java.util.Scanner; 
import java.util.Random; 
public class Guess 
{ 
public static void main(String[] args) 
{ 
	int numToGuess; //Number the user tries to guess 
	int guess; //The user's guess 
	 
	Scanner scan = new Scanner(System.in); 
	Random generator = new Random(); 
	
	System.out.println("Generating a random number (1-10)");
	numToGuess = generator.nextInt(10) + 1;
	
	System.out.println("Enter your guess.");
	guess = scan.nextInt();
	while(guess != numToGuess)
	{
		if(guess < numToGuess)
			System.out.println("Your guess is too low");
		else 
			System.out.println("Your guess is too high");
		
		System.out.println("Enter your guess.");
		guess = scan.nextInt();
	}
	
	 
	if(guess == numToGuess)
		System.out.println("Congratulation. Your guess is correct!");
	
	System.out.println("Author: Noreen Chrysilla");
	} 
} 