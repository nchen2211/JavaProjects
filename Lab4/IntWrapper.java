/*Program: MoneyConv.java
 * Author: Noreen Chrysilla
 * Class: CSCI 145
 * Date: Due on 3/26/2014
 * Description: Print an integer in primitie formats. Parsing string to integer value and 
 * add the value together
 * 
 * Exception: Integer class is used in this program
 */
import java.util.Scanner;

public class IntWrapper {

	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);
		int int1 = 0;
		String str2= "";
		String str3 ="";
		int int2 ,int3;
		
		System.out.println("Enter an integer");
		int1 = input.nextInt();
		
		System.out.println("To Binary String: " + Integer.toBinaryString(int1));
		System.out.println("To Hex String: " + Integer.toHexString(int1));
		System.out.println("To Octal String: " + Integer.toOctalString(int1));
		
		System.out.println("Maximum Java value: " + Integer.MAX_VALUE);
		System.out.println("Minimum Java value: " + Integer.MIN_VALUE);
		
		System.out.println("Enter two decimal integers");
		str2 = input.next();
		str3 = input.next();
		
		//parsing string to int
		int2 = Integer.parseInt(str2);
		int3 = Integer.parseInt(str3);
		
		System.out.println("The sum of two decimal integers is: " + (int2 + int3));
		System.out.println("Author: Noreen Chrysilla");
		
		
	}
}
