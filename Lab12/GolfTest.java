import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class GolfTest {
	
	public static void main (String[] args)
	{

		Scanner inFile, lineScan;
		StringTokenizer tokenizer;
		String line, row, file = "golf4.txt";
		int par = 0;
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		int score4 = 0;
		int totalPar, totalScore;
		int count = 0;
		int countLS = 0;


		try
		{
			inFile = new Scanner(new File(file));
			
			while(inFile.hasNext())
			{
				line = inFile.nextLine();
				lineScan = new Scanner(line);
				par += Integer.parseInt(lineScan.next());
			//	count = 0;
				while(lineScan.hasNext())
				{
					try
					{
						score1 += Integer.parseInt(lineScan.next());
						//count++;
						score2 += Integer.parseInt(lineScan.next());
						//count++;
						score3 += Integer.parseInt(lineScan.next());
						//count++;
						score4 += Integer.parseInt(lineScan.next());
						//count++;
			
					}
					catch (NumberFormatException exception)
		            {
		               System.out.println ("Error in input. Line ignored:");
		               System.out.println (line);
		            } 
					
					countLS++;
				}
				count++;
				
			}
			inFile.close();
		
			GolfScores golf1 = new GolfScores(par,score1);
			GolfScores golf2 = new GolfScores(par,score2);	
			GolfScores golf3 = new GolfScores(par,score3);			
			GolfScores golf4 = new GolfScores(par,score4);
			
			System.out.print("Player1: ");
	        System.out.println("\n" + golf1.toString());
	        System.out.print("Player2: ");
	        System.out.println ("\n" + golf2.toString());
			System.out.print(""+ "Player3: ");
	        System.out.println ("\n" + golf3.toString());
	        System.out.print("Player4: ");
	        System.out.println ("\n" + golf4.toString());
	        
	        if(golf1.getScore() < golf2.getScore() && 
	        		golf1.getScore() < golf3.getScore() & golf1.getScore() < golf4.getScore())
	        	 System.out.print("\nWinner: Player 1");
	        else if(golf2.getScore() < golf1.getScore() && 
	        		golf2.getScore() < golf3.getScore() & golf2.getScore() < golf4.getScore())
	        	 System.out.print("\nWinner: Player 2");
	        else if(golf3.getScore() < golf1.getScore() && 
	        		golf3.getScore() < golf2.getScore() & golf3.getScore() < golf4.getScore())
	        	 System.out.print("\nWinner: Player 3");
	        else
	        	 System.out.print("\nWinner: Player 4");
	        
	        System.out.print("\nAuthor: Noreen Chrysilla");
		}
		catch (FileNotFoundException exception)
		{
			System.out.println ("The file " + file + " was not found.");
		}
		catch (IOException exception)
      	{
    	  	System.out.println (exception);
      	}
			
	}

}
