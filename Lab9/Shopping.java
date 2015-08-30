/*  Program: Shopping.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: due on 4/30/2014
    Description: Implement ShoppingCart class and provides loop for the customer
    to keep adding items to his cart

	Exception(s): N/A

*/
import java.util.Scanner;

public class Shopping {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String itmName = " ";
		double cost = 0.0;
		int qty = 0;
		int answer = 0;

		ShoppingCart cart = new ShoppingCart();

		do
		{
			System.out.println("Shopping? 1 for yes. 2 for no");
			answer = scan.nextInt();

			if(answer == 1)
			{
				System.out.println("Enter the item name");
				itmName = scan.next();
				System.out.println("Enter the cost");
				cost = scan.nextDouble();
				System.out.println("Enter the quantity");
				qty = scan.nextInt();
				cart.addToCart(itmName, cost, qty);

			}
			else
				System.out.println("Thank you for shopping!");

		}while(answer == 1);

		System.out.println(cart.toString());
		System.out.println("Please pay: " + cart.totalCost());
		System.out.println("Author: Noreen Chrysilla");
	}
}

