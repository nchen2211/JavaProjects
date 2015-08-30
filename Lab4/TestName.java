
import java.util.Scanner;

public class TestName {
	
	public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		String firstN, middleN, lastN;
		for(int i=1; i<=2; i++)
		{
		System.out.println("Enter person" + i + "'s first, middle, and last name.");
		firstN = input.next();
		middleN = input.next();
		lastN = input.next();
		
		Name person = new Name (firstN,middleN,lastN);
			
		System.out.println(person.firstMiddleLast());
		System.out.println(person.lastFirstMiddle());
		System.out.println(person.initials());
		System.out.println(person.length());
		}
    }

}
