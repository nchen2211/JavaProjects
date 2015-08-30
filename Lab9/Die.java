/*  Program: Die.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: due on 4/30/2014
    Description: Generate a random number in a dice

	Exception(s): N/A

*/
public class Die
{
	private final int MAX = 6;
	private int faceValue;

	public Die()
	{
		faceValue = 1;
	}

	public int roll()
	{
		faceValue  =(int)(Math.random() * MAX) + 1;
		return faceValue;
	}

	public void setFaceValue(int value)
	{
		faceValue = value;
	}

	public int getFaceValue()
	{
		return faceValue;
	}
}
