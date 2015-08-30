/*Program: PhoneNumber.java
 * Author: Noreen Chrysilla
 * Class: CSCI 145
 * Date: Due on 3/28/2014 (close lab)
 * Description:
 *
 * Exception: I certified code below is my own.
 */
import java.util.Random;

public class PhoneNumber {

	public static void main(String args[])
	{

		System.out.println("Phone Number");
		Random generator = new Random();
		int num[] = new int[7];

		for(int trial = 0; trial <10; trial++)
		{
			for(int i=0; i<7; i++)
			{
				if(i >= 0 && i<=2)
				{
					num[i] = generator.nextInt(6);
				}
				else
					num[i] = generator.nextInt(10);

				if(i == 3)
				{
					System.out.print("-");
				}
				System.out.print(num[i]);

			}
			System.out.println();

		}
		System.out.println("Author: Noreen Chrysilla");
	}
}
