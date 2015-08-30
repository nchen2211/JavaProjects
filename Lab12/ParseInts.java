/*  Program: ParseInts.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/28/2014
    Description: Add exception handler to count the int inside
    a string

    I certify that the code below is my own work.

	Exception(s): N/A

*/
import java.util.Scanner;

public class ParseInts
{
    public static void main(String[] args)
    {
	int val, sum=0;
	Scanner scan = new Scanner(System.in);
	String line;

	System.out.println("Enter a line of text");
	Scanner scanLine = new Scanner(scan.nextLine());

	while (scanLine.hasNext())
    {	
		try
		{
			val = Integer.parseInt(scanLine.next());
			sum += val;
			
	    }catch (NumberFormatException exception)
	    {
    	
	    }
    }
	
	System.out.println("The sum of the integers on this line is " + sum);
	System.out.println("\nAuthor: Noreen Chrysilla");
    }
}