// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student’s info. 
// ****************************************************************
import java.util.Scanner;

public class Student
{
	String name ="";
	int grade1, grade2;

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
		name = studentName;
    }
    
    public String getName()
    {
		return name;
    }
    
    public void inputGrades()
    {
    	boolean valid = false;
    	Scanner input = new Scanner(System.in);
    	do
    	{
    		//enter grade1
			System.out.println("Enter " + getName() + "'s score for test1");
			grade1 = input.nextInt();
			//isValid
			if(grade1 >= 0 && grade1 <= 100)
				valid = true;
			else
			{
				valid = false;
				System.out.println("Grade invalid");
			}	
			
			//enter grade2
			System.out.println("Enter " + getName() + "'s score for test2");
			grade2 = input.nextInt();
			//isValid
			if(grade2 >= 0 && grade2 <= 100)
				valid = true;
			else
			{
				valid = false;
				System.out.println("Grade invalid");
			}
    	}
		while(valid == false);
    }
    
    public int getAverage ()
    {
    	int avg;
    	avg = (grade1 +grade2) / 2;
    	System.out.println(getName() + " 's average is: " + avg);
    	return avg;
    }   
    
    public String toString()
    {
    	return "Name: " + getName() + " Test1: " + grade1 + " Test2: " +
    			grade2;
    }
    
}