/*  Java Class: Compare3.java
      Author: Noreen Chrysilla
    Class: CSCI 145
    Date: due on 4/23/14
    Description: Using Comparable to compare String and int

    I certify that the code below is my own work.

	Exception(s): N/A

*/
public class Compare3 {
	
	public static void largest(Comparable a, Comparable b, Comparable c)
	{
		if(a.compareTo(b) > 0 && a.compareTo(c) > 0)
			System.out.println("First is the largest");
		else if(b.compareTo(a) > 0 && b.compareTo(c) > 0)
			System.out.println("Second is the largest");
		else if(c.compareTo(a) > 0 && c.compareTo(b) > 0)
			System.out.println("Third is the largest");
	}

}
