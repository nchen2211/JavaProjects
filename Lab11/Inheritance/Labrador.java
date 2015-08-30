/*  Java Class: Labrador.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/21/14
    Description: modify a derived class Labrador that inherits from base class Dog
    and provides constructor + super constructor, speak, color, and avgBreedWEight methods. 
    
    I certify that the code below is my own work.

	Exception(s): N/A

*/

public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    private int breedWeight = 75;

    public Labrador(String name,String color)
    {
    	super(name);
    	this.color = color;
    }

    public String speak()
    {
    	return "WOOF";
    }

    public String color()
    {
    	return color;
    }
    
    public int avgBreedWeight()
    {
    	return breedWeight;
    }
}