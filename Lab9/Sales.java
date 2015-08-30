/*  Program: Sales.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: due on 4/30/2014
    Description: Analyze sales amount by a number of sales person.
    Determine who got the highest and lowest. And determine how sold
    higher amount than the amount that the user have entered 
    I certify that the code below is modified by me.

	Exception(s): N/A

*/
import java.util.Scanner;
public class Sales
{
	public static void main(String[] args)
	{
		int SALESPEOPLE = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter how many salesperson ");
		SALESPEOPLE = scan.nextInt();
		int[] sales = new int[SALESPEOPLE];
		int sum;
		int maxSale = Integer.MIN_VALUE;
		int minSale = Integer.MAX_VALUE;
		int maxId = 0;
		int minId = 0;
	
		
		for (int i=0; i<sales.length; i++)
		{
			System.out.print("Enter sales for salesperson " + (i+1) + ": ");
			sales[i] = scan.nextInt();
		}
		System.out.println("\nSalesperson Sales");
		System.out.println("--------------------");
		
		sum = 0;
		for (int i=0; i<sales.length; i++)
		{
			System.out.println(" " + (i+1) + " " + sales[i]);
			sum += sales[i];
			
			if(sales[i] > maxSale)
			{
				maxSale = sales[i];
				maxId = i+1;
			}
			
			if(sales[i] < minSale)
			{
				minSale = sales[i];
				minId = i+1;
			}

		}
		System.out.println("Total sales: " + sum);
		System.out.println("Average sales: " + (sum / sales.length));
		System.out.println("Salesperson " + maxId + " had the highest sale with $" + maxSale);
		System.out.println("Salesperson " + minId + " had the lowest sale with $" + minSale);
		
		int value = 0;
		int count = 0;
		System.out.println("Enter a value: ");
		value = scan.nextInt();
		
		for(int i=0; i<sales.length; i++)
		{
			if(sales[i] > value)
			{
				System.out.println("Salesperson " + i + "has sold: $" + sales[i]);
				count++;
			}
		}
		System.out.println("\nTotal salesperson who has sold more than the value is: " + count + " people");
		System.out.println("Author: Noreen Chrysilla");
		


		
	}
}