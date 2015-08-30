/*  Program: IntegerSetTest.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 5/9/2014
    Description: Implement IntegerSet class to test different methods that can be done in two integer sets

    I certify that the code below is my own work.

	Exception(s): N/A

*/
import java.util.Scanner;

public class IntegerSetTest {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		IntegerSet s1, s2, s3, s4, s5, s6, s7, s8;
		int[] arr1 = new int [256];
		int[] arr2 = new int [265];
		
		arr1[15] = 1;
		arr1[20] = 1;
		arr1[71] = 1;
		arr1[99] = 1;
		arr1[255] = 1;

		arr2[12] = 1;
		arr2[16] = 1;
		arr2[50] = 1;
		arr2[53] = 1;
		arr2[105] = 1;
		
		s1 = new IntegerSet();
		s2 = new IntegerSet(8);
		s3 = new IntegerSet (arr1);
		s7 = new IntegerSet(arr2);

		System.out.println("Test Constructor");
		System.out.print("s1: ");
		s1.print();
		System.out.print("\ns2: ");
		s2.print();
		System.out.print("\ns3: ");
		s3.print();

		System.out.print("\n\nAdding 2 element to ");
		s2.print();
		System.out.println("\nEntering 15, 65, 280 into set2... ");
		s2.insertElement(15);
		s2.insertElement(65);
		s2.insertElement(280);
		System.out.println("Updated set2 ");
		s2.print();

		System.out.print("\n\nThe copy of ");
		s3.print();
		s1 = s3.copy();
		System.out.print(" is ");
		s1.print();

		System.out.print("\n\nThe union of ");
		s2.print();
		System.out.print(" and ");
		s3.print();
		s4 = s2.union(s3);
		System.out.print(" is ");
		s4.print();

		System.out.print("\n\nThe intersection of ");
		s3.print();
		System.out.print(" and ");
		s2.print();
		s5 = s3.intersect(s2);
		System.out.print(" is ");
		s5.print();

		System.out.println("\n\nSubset");
		if(s2.subset(s4))
		{
			s2.print();
			System.out.print(" is subset of ");
			s4.print();
		}

		else
			System.out.println("It is not Subset");


		System.out.println("\n\nSuperset");
		if(s5.superset(s3))
		{
			s3.print();
			System.out.print(" is superset of ");
			s5.print();
		}
		else
			System.out.println("It is not Superset");


		System.out.print("\n\nIs element 20 in the set 3");
		if(s3.isElement(20))
			System.out.print(20 + " is in the set 3");
		else
			System.out.print(20 + " is not in the set 3");
		
		System.out.print("\n\nIs element 89 in the set 3");
		if(s3.isElement(89))
			System.out.print(89 + " is in the set 3");
		else
			System.out.print(89 + " is not in the set 3");

		System.out.print("\n\nDifference between ");
		s3.print();
		System.out.print(" with ");
		s7.print();
		System.out.print(" is ");
		s6 = s3.difference(s7);
		s6.print();

		System.out.print("\n\nRemove element 20 from set 3 ");
		s3.removeElement(20);
		System.out.print("\nUpdated set is ");
		s3.print();
		System.out.print("\n\nRemove element 77 from set 3 ");
		s3.removeElement(77);
		System.out.print("Updated set is ");
		s3.print();

		System.out.println("\n\nUsing Comparable Interface ");
		if(s3.compareTo(s2) == 0)
		{
			s2.print();
			System.out.print(" and ");
			s3.print();
			System.out.print("have the same number of elements");
		}
		else if(s3.compareTo(s2) == -1)
		{
			s2.print();
			System.out.print(" has ");
			System.out.print("more number of element compare to number of ");
			s3.print();
		}
		else
		{
			s2.print();
			System.out.print(" has ");
			System.out.print("less number of element compare to number of ");
			s3.print();
		}
		
		System.out.print("\n\nRemove all elements from set 2");
		s2.removeAll();
		System.out.print("\nThe updated set 2 is ");
		s2.print();

		System.out.print("\n\nAdd all elements from set 2");
		s2.addAll();
		System.out.println("\nThe updated set 2 is ");
		s2.print();
		
		System.out.println("\n\nAuthor: Noreen Chrysilla");
		
	}

}
