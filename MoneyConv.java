/*  Program: MoneyConv.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: due on 3/21/2014
    Description: Create a money converter that provides the money break down
     			 of the decimal amount entered by the user. 

    I certify that the code below is my own work.

	Exception(s): N/A

*/
import java.util.Scanner;

public class MoneyConv
{

	public static void main(String[] args)
	{
		final int ten = 10;
		final int five = 5;
		final int one = 1;
		final double quarters = 0.25;
		final double dimes = 0.1;
		final double nickels = 0.05;
		final double pennies = 0.01;

		double amount = 0.0;
		double calculation;
		int countTen = 0;
		int countFive = 0;
		int countOne = 0;
		int countQ = 0;
		int countD = 0;
		int countN = 0;
		int countP = 0;


		Scanner scan = new Scanner(System.in);

			do{
				System.out.println("Enter the amount from 0 - 100 (in decimal). \n");
				amount = scan.nextDouble();
				
				if(amount >= 0.0 && amount <= 100.0)
				{
					while (amount != 0.0)
					{
						if(amount >= ten)
						{
							countTen = (int) (amount / ten);
							amount = amount % ten;
							System.out.println(countTen + " ten dollar bills");
						}
						else if(amount < ten && amount >= five)
						{
							countFive = (int) (amount / five);
							amount = amount % five;
							System.out.println( countFive + " five dollar bills");
						}
						else if( amount < five && amount >= one)
						{
							countOne = (int) (amount / one);
							amount = amount % one;
							System.out.println( countOne + " one dollar bills");
						}
						else if(amount < one && amount >= quarters)
						{
							countQ = (int) (amount / quarters);
							amount = amount % quarters;
							System.out.println( countQ + " quarters");
						}
						else if(amount < quarters && amount >= dimes)
						{
							countD = (int) (amount / dimes);
							amount = amount % dimes;
							System.out.println( countD + " dimes");
						}
						else if(amount < dimes && amount >= nickels)
						{
							countN = (int) (amount / nickels);
							amount = amount % nickels;
							System.out.println( countN + " nickels");
						}
						else if(amount < nickels && amount >= pennies)
						{
							countP = (int) (amount / pennies);
							amount = amount % pennies;
							System.out.println( countP + " pennies");
						}
						else 
							break;
					}
					
				}
				else if(amount < 0.0 || amount > 100.0)
				{
					System.out.println("Amount invalid. Enter the valid amount.");
				}
		}while (amount < 0.0 || amount > 100.0);
			
			calculation = (countTen * ten) + (countFive * five) + (countOne * one) + 
			(countQ * quarters) + (countD * dimes) + (countN * nickels) + (countP * pennies);
			System.out.println("Calculated amount is: $" + calculation);
			System.out.println("Author: Noreen Chrysilla");
	}
}

