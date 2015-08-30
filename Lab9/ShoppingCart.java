/*  Program: ShoppingCart.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: due on 4/30/2014
    Description: ShoppingCart class provides functions to add items to cart and
    return the summary in term of string and its total cost.

	Exception(s): N/A

*/
import java.text.NumberFormat;
public class ShoppingCart
{
	private int itemCount;
	private double totalPrice;
	private int capacity;
	private Item [] cart;

	public ShoppingCart()
	{
		capacity = 5;
		itemCount = 0;
		totalPrice = 0.0;
		cart = new Item[capacity];
	}

	public void addToCart(String itemName, double price, int quantity)
	{
		if(itemCount == cart.length)
			increaseSize();

		cart[itemCount] = new Item(itemName,price,quantity);
		totalPrice += price;
		itemCount++;
	}

	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String contents = "\nShopping Cart\n";

		contents += "Number of items: " + itemCount;
		contents += "\nTotal Price: " + fmt.format(totalPrice) + "\n";

		for (int i = 0; i < itemCount; i++)
		{
			contents += "           " + cart[i].toString() + "\n";
		}

		return contents;
	}

	public double totalCost()
	{
		return totalPrice;
	}

	private void increaseSize()
	{
		Item[] temp = new Item[cart.length * 2];

		for(int itm=0; itm < cart.length; itm++)
			temp[itm] = cart[itm];

		cart = temp;
		System.out.println("Capacity increased");
	}
}