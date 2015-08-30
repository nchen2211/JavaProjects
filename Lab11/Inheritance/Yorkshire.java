/*  Java Class: Yorkshire.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/21/14
    Description: modify a derived class Yorkshire that iinherits from base class Dog
    and provides constructor + super constructor, speak and avgBreedWeight methods.
    
    I certify that the code below is my own work.

	Exception(s): N/A

*/

public class Yorkshire extends Dog
{
	private int breedWeight = 30;
	
    public Yorkshire(String name)
    {
    	super(name);
    }

    public String speak()
    {
    	return "woof";
    }
    
    public int avgBreedWeight()
    {
    	return breedWeight;
    }

}