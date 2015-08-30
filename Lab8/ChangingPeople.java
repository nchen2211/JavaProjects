/*  Program: ChangingPeople.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/23/14
    Description: Implements Person class and modidied below code so p2 refers to Jill 21
    I certify that the code below is modified by me.

	Exception(s): N/A

*/

public class ChangingPeople
{
	public static void main (String[] args)
	{
		Person person1 = new Person ("Sally", 13);
		Person person2 = new Person ("Sam", 15);
		int age = 21;
		String name = "Jill";

		System.out.println ("\nParameter Passing... Original values...");
		System.out.println ("person1: " + person1);
		System.out.println ("person2: " + person2);
		System.out.println ("age: " + age + "\tname: " + name + "\n");

		changePeople (person1, person2, age, name);
		System.out.println ("\nValues after calling changePeople...");
		System.out.println ("person1: " + person1);
		System.out.println ("person2: " + person2);
		System.out.println ("age: " + age + "\tname: " + name + "\n");
	}

	public static void changePeople (Person p1, Person p2, int age, String name)
	{
		System.out.println ("\nInside changePeople... Original parameters...");
		System.out.println ("person1: " + p1);
		System.out.println ("person2: " + p2);
		System.out.println ("age: " + age + "\tname: " + name + "\n");

		p2.changeName(name);
		p2.changeAge(age);

		name = "Jack";
		age = 101;
		p1.changeName (name);
		p1.changeAge (age);

		System.out.println ("\nInside changePeople... Changed values...");
		System.out.println ("person1: " + p1);
		System.out.println ("person2: " + p2);
		System.out.println ("age: " + age + "\tname: " + name + "\n");
	}
}