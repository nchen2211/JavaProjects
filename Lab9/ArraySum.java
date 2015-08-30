/*  Program: TestDice.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: due on 4/30/2014
    Description: Implement Die class to 2 dices and sum their number after rolling,
    count the occurance of the sum in an array and print their percentages.

	Exception(s): N/A

*/
public class ArraySum
{
	public static void main(String args[])
	{
		Die die1 = new Die();
		Die die2 = new Die();
		int sum = 0;
		int SIZE = 13;
		int[] arr = new int[SIZE];
		double percentage = 0;


		for(int i=0; i<1000; i++)
		{
			sum = die1.roll() + die2.roll();
			arr[sum]++;
		}

		for(int i=0; i<arr.length; i++)
		{
			percentage =(((double) arr[i]) / SIZE);
			System.out.println(i + ": " + arr[i] + " percentage: " + percentage + "%");
		}
	}
}


