/*  Java Class: Dog.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/21/14
    Description: modify a base class Dog that inherits Labrador and Yorkshire. It is an abstract class
    
    I certify that the code below is my own work.

	Exception(s): N/A

*/
public abstract class Dog
{
    protected String name;

    public Dog(String name)
    {
    	this.name = name;
    }

    public String getName()
    {
    	return name;
    }

    public abstract String speak();   
    public abstract int avgBreedWeight();
}