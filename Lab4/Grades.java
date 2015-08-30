/*Program: Grade.java
 * Author: Noreen Chrysilla
 * Class: CSCI 145
 * Date: Due on 3/26/2014
 * Description: 
 * 
 * Exception: Student.java and Grade.java are used and modified in this program.
 */
public class Grades
{
    public static void main(String[] args)
    {
	Student student1 = new Student("Mary");
	Student student2 = new Student("Mike");
	//int exam1 = 0;
	//int exam2 = 0;

	
	//input grades for Mary
	student1.inputGrades();
	
	//print average for Mary
	student1.getAverage();

	System.out.println();

	//input grades for Mike
	student2.inputGrades();
	//print average for Mike
	student2.getAverage();
	
	System.out.println(student1);
	System.out.println(student2);
    }
}