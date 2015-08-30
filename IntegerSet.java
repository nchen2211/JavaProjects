/*  Java Class: IntegerSet.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 5/9/2014
    Description: Provides methods that generate a copy,union and intersection of two integer set object, 
    methods that allow element insertion and removal, methods that generate boolean sub & superset, Comparable
    method that generates objects size comparison.

    I certify that the code below is my own work.

	Exception(s): N/A

*/
public class IntegerSet implements Comparable<IntegerSet>
{

	private int[] set1;
	private int size;

	public IntegerSet()
	{
		set1 = new int [256];
		size = 0;
	}

	public IntegerSet(int number)
	{
		set1 = new int [256];
		if(valid(number))
		{
			set1[number] = 1;
			size = 1;
		}
		else
			System.out.println("The element is our of range");
	}

	public IntegerSet(int[] arr)
	{
		set1 = arr;
		
		for(int i=0; i<arr.length; i++)
			if(set1[i] == 1)
				size++;
	}
	
	public boolean valid(int element)
	{
		if(element >= 0 && element <= 255)
			return true;
		return false;
	}
	
	public int getSize() 
	{
		return size;
	}
	
	public void insertElement(int elem)
	{
		if(valid(elem))
		{
			set1[elem] = 1;
			size++;
		}
		else
			System.out.println("An element is out of range");
	}

	public void removeElement(int elem)
	{
		if(set1[elem] == 1)
		{
			set1[elem]--;
			size--;
		}
		else
			System.out.println("The element is not in the set");
	}

	public boolean isElement (int integer)
	{
		if(set1[integer] == 1)
			return true;
		return false;
	}

	public void print()
	{
		int count = 0;
		System.out.print("{");

		for(int i=0; i<set1.length; i++)
		{
			if(set1[i] == 1)
			{
				count++;
				if(count % 10 == 0)
					System.out.print("\n");
				
				if(count == size)
					System.out.print(i);
				else
					System.out.print(i + ", ");
			}
		}
		
		System.out.print("}");

	}

	public IntegerSet copy()
	{
		IntegerSet temp = new IntegerSet();

		for(int i=0; i<set1.length; i++)
		{
			if(set1[i] > 0)
				temp.insertElement(i);
		}
		return temp;
	}

	public IntegerSet union(IntegerSet u)
	{
		IntegerSet temp = new IntegerSet();
		
		for(int i=0; i<set1.length; i++)
		{
			if(set1[i] == 1|| u.set1[i] == 1)
				temp.insertElement(i);
		}
		return temp;
	}

	public IntegerSet intersect(IntegerSet u)
	{
		IntegerSet temp = new IntegerSet();
		for(int i=0; i<set1.length; i++)
		{
			if(set1[i] == 1 && u.set1[i] == 1)
				temp.insertElement(i);
		}
		return temp;
	}
	
	public IntegerSet difference(IntegerSet set2)
	{
		int[] temp1 = new int[set1.length];
		int[] temp2 = new int[set2.set1.length];
		int[] diff;
		IntegerSet array1 = new IntegerSet();
		int n = 0;
		
		for(int i=0; i<set1.length; i++)
		{	
			if(set1[i] == 1)
			{
				temp1[n] = i;
				n++;
			}
		}	
		
		System.out.println();
		n = 0;
		for(int i=0; i<set2.set1.length; i++)
		{
			if(set2.set1[i] == 1)
			{
				temp2[n] = i;
				n++;
			}
		}
		
		diff = new int [temp1.length];
		for(int i=0; i<temp1.length; i++)
			diff[i] = (temp1[i] - temp2[i]);
		
		for(int i=0; i<set1.length; i++)
		{
			if(diff[i] != 0)
				array1.insertElement(diff[i]);
		}
		
		return array1;
	}

	public boolean subset(IntegerSet sub)
	{
		for(int i=0; i<set1.length; i++)
			if(set1[i] == 1)
				if(sub.set1[i] == 1)
					return true;
		return false;

	}

	public boolean superset(IntegerSet supers)
	{
		for(int i=0; i<supers.set1.length; i++)
			if(supers.set1[i] == 1)
				if(set1[i] != 1)
					return true;
		return false;
	}

	public void addAll()
	{
		for(int i=0; i<set1.length; i++)
			if(set1[i] == 0)
			{
				set1[i] = 1;
				size++;
			}
	}

	public void removeAll()
	{
		for(int i=0; i<set1.length; i++)
			if(set1[i] == 1)
			{
				set1[i] = 0;
				size--;
			}
	}


	public int compareTo(IntegerSet comp)
	{
		if(this.getSize() == comp.getSize())
			return 0;
		else if(this.getSize() > comp.getSize())
			return 1;
		else
			return -1;
	}

}









