/*  Program: ListTest.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/23/14
    Description: Test derived class SortedIntList from base class IntList 

    I certify that the code below is my own work.

	Exception(s): N/A

*/
public class ListTest
{
    public static void main(String[] args)
    {
		SortedIntList myList = new SortedIntList();
		IntList list = new IntList(10);
		System.out.println("Using SortedIntList class: ");
		myList.add(100);
		myList.add(50);
		myList.add(200);
		myList.add(25);
		myList.add(8);
		myList.add(88);
		myList.add(15);
		myList.add(10);
		myList.add(35);
		myList.add(1);
		System.out.println(myList);
		
		System.out.println("Using IntList class: ");
		list.add(100);
		list.add(50);
		list.add(200);
		list.add(25);
		list.add(8);
		list.add(88);
		list.add(15);
		list.add(10);
		list.add(35);
		list.add(1);
		System.out.println(list);
		System.out.println("Author: Noreen Chrysilla");
		
    }
}