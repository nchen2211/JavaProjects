/*  Program: DogTest.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/23/14
    Description: Test base class Dog and derived class Labrador and Yorkshire

    I certify that the code below is my own work.

	Exception(s): N/A

*/
public class DogTest
{
    public static void main(String[] args)
    {
		Labrador labrador = new Labrador("Top Top", "brown");
		Yorkshire yorkshire = new Yorkshire("Luna");
		System.out.println(labrador.getName() + " says " + labrador.speak());
		System.out.println(labrador.getName() + "'s fur is " + labrador.color());
		System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
		System.out.println(labrador.getName() + "'s average weight: " + labrador.avgBreedWeight());
		System.out.println(yorkshire.getName() + "'s average weight: " + yorkshire.avgBreedWeight());
		System.out.println("Author: Noreen Chrysilla");
    }
}