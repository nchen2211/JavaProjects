/*  Program Comparison.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: due on 4/23/14
    Description: Test Compare3 class.

    I certify that the code below is my own work.

	Exception(s): N/A

*/
import java.util.Scanner;

public class Comparison {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Compare3 compare = new Compare3();
		System.out.println("Enter 3 string");
		String string1 = "";
		String string2 = "";
		String string3 = "";
		
		string1 = scan.next();
		string2 = scan.next();
		string3 = scan.next();
		
		compare.largest(string1, string2, string3);
		
		System.out.println("Enter 3 integers");
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		compare.largest(a, b, c);
		
		System.out.println("Author: Noreen Chrysilla");
		
	}
}
