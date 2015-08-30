/*  Program:Circle
    Author:Noreen Chrysilla
    Class:CSCI 145
    Date:3/7/2014
    Description:

    I certify that the code below is modified from the original Circle.java

	Exception(s): N/A
*/
import java.util.Scanner;

public class Circle
{
    public static void main(String[] args)
    {
     //declare const var
     final double PI = 3.14159;
     
     //declare variables
     int radius = 10;
     double area1 = PI * radius * radius;
     double area2 = PI * radius * radius;
     double circum1 = 2 * PI * radius;
     double circum2 = 2 * PI * radius;
     double isDoubled;
     
     //input from user
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the radius: ");
     radius = input.nextInt();
             
     //print both area and circumference
     System.out.println("The area of a circle with radius " + radius +
                       " is " + area1);
     System.out.println("The circumference of a circle with radius " + radius +
                        " is " + circum1);
     
     //doubled the radius
     radius = 2 * radius;
     System.out.println("Doubled of the radius is: " + radius);
     
     //calculating the area and circumference for the doubled radius
     area2 = PI * radius * radius;
     circum2 = 2 * PI * radius;

     System.out.println("The area of a circle with radius " + radius +
                        " is " + area2);
     System.out.println("The circumference of a circle with radius " + radius +
                        " is " + circum2);
     
     isDoubled = area2 / area1;
     System.out.println("Area change: " + isDoubled);
     isDoubled = circum2 / circum1;
     System.out.println("Circumference change: " + isDoubled);
     System.out.println();
     System.out.println("Answer for question#2: The areas are not doubled" + 
     " when the radius are doubled, but the circumferences are.");
     System.out.println("Answer for question#3: Yes, it does.");
     System.out.println();
     System.out.println("Author: Noreen Chrysilla");
    }
}