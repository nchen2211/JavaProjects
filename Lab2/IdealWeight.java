/*  Program:Ideal Weight
    Author:Noreen Chrysilla
    Class:CSCI 145
    Date:3/7/2014
    Description: Calculate individual ideal weight for both gender based on his/her height
    and generate the ideal weight range for that height

    I certify that the code below is my own work.

	Exception(s): N/A

*/

import java.util.Scanner;
public class IdealWeight {
	
	public static void main(String[] args)
    {
		//declare const var
		final int constAddF = 5;
		final int constWeightF = 100;
		final int constAddM = 6;
		final int constWeightM = 106;
		final double range = 0.15;
		final int ftToIn = 12;
		
		//declare variables
		Scanner input = new Scanner (System.in);
		int heightFt = 0;
		int heightIn = 0;
		int gender = 1;
		int diff;
		double weight = 0.0;
		double weight1, weight2;
		int opt = 0;
		
		do
		{
			System.out.print("Enter 1 to enter the program. Enter 2 to terminate");
			opt = input.nextInt();
			if(opt == 1)
			{
				//choose gender
				System.out.print("Enter 1 for female and 2 for male");
				gender = input.nextInt();
					
				//enter the height in ft and inch
				System.out.print("Enter the height in feet and inch separately: ");
				heightFt = input.nextInt();
				heightIn = input.nextInt();
				System.out.println("The height you entered is: " + heightFt + 
						" ft " + heightIn + " in" );
					
				//determine body weight for F
				if(gender == 1)
				{
					//if height is within 5ft range
					if(heightFt == 5)
					{
						weight = constWeightF + (heightIn * constAddF);
						System.out.println("Ideal body weight is: " + weight);
					}	
					//if height is more than 5ft range
					else if(heightFt > 5)
					{
						diff = heightFt - 5;
						for(int i=0; i<diff; i++)
						{
							heightIn += ftToIn;
						}
						weight = constWeightF + (heightIn * constAddF);
						System.out.println("Ideal body weight is: " + weight +" lbs");
					}
						
				}
				//determine body weight for M
				else if(gender == 2)
				{
					//if height is within 5ft range
					if(heightFt == 5)
					{
						weight = constWeightM + (heightIn * constAddM);
						System.out.println("Ideal body weight is: " + weight);
					}
					//if height is more than 5ft range
					else if(heightFt > 5)
					{
						diff = heightFt - 5;
						for(int i=0; i<diff; i++)
						{
							heightIn += ftToIn;
						}
						weight = constWeightM + (heightIn * constAddM);
						System.out.println("Ideal body weight is: " + weight +" lbs");
					}
				}
					
				//calculate the 15% range of the ideal weight 
				weight1 = weight - (range * weight);
				weight2 = weight + (range * weight);
				System.out.println("The range of ideal weight is: " + weight1 + " lbs - " 
					+ weight2 + " lbs.");
			}
				else if(opt == 2)
				{
					//terminate the program
					System.out.println("Program terminated.");
					//print author's name
					System.out.println("Author: Noreen Chrysilla");
				}
		}while(opt == 1);
    }
}
