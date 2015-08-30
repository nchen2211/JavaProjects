/*  Java Class: SortedIntList.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/21/14
    Description: inherit base class IntList
    
    I certify that the code below is my own work.

	Exception(s): N/A

*/

import java.util.Scanner;

public class SortedIntList extends IntList
{
	public SortedIntList()
	{
		super(10);
	}
	
	public void add(int value)
    {
		if (numElements == list.length)
		    System.out.println("Can't add, list is full");
		else
	    {
			int position = numElements;
			
			while(position > 0 && value < list[position-1])
			{
				list[position] = list[position-1];
				position--;
			}
			list[position] = value;
			numElements++;
	    }
		
    }
}
