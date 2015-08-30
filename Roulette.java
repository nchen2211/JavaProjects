/*  Program:Roulette.java
    Author:Noreen Chrysilla
    Class:CSCI 145
    Date:Due on 4/18/2014
    Description:main function that implements Player class and Wheel class. It keeps track of how
    			many people is/are playing and return summary of each player winning &lost and the house winning & lost

    I certify that the code below is modified and added by me.

	Exception(s): N/A

*/
import java.util.*;

class Roulette
{

   public static void main (String[] args)
   {

	 Wheel wheel = new Wheel();
	 int numOfPlayer = 3;
	 wheel.setNumPlayer(numOfPlayer);
	 int playerCount = wheel.getNumPlayer();
	 int round = 1;
	 boolean goOn = true;
	 Player player[] = new Player[numOfPlayer];
	 System.out.println("Welcome to Roulette");
	 System.out.println("Press -1 to quit the game at any time.");

	 while(playerCount > 0)
	 {
		 System.out.println("ROULETTE ROUND " + round);

	     for(int n=0; n<=wheel.getNumPlayer(); n++)
	     {

	    	if(round == 1)
	    		player[n] = new Player(100);
	    	else
	    		player[n].getMoney();

	    	System.out.println("Player" + (n+1) + " money available $" + player[n].getMoney());
	    	System.out.println("Player" + (n+1) + " please make a bet.");

	    	player[n].makeBet();

			if(playerCount != wheel.getNumPlayer())
			{
				if(n < wheel.getNumPlayer())
				{
					while(n != wheel.getNumPlayer())
					{
						player[n] = player[n+1];
						System.out.println("Player" + (n+2) + " is now player" + (n+1));
						n++;
					}

				}
				playerCount = wheel.getNumPlayer();
				System.out.println ("Player exit the game. The remaining player(s), please re-enter the bet");
			}

			wheel.setNumPlayer(playerCount);

				if(n == (playerCount-1))
				{
					wheel.spin();

					for(n=0; n<=wheel.getNumPlayer(); n++)
					{
						System.out.println("Player" + (n+1));
						player[n].payment();



						if(n == (playerCount-1))
						{

							for(n=0; n<wheel.getNumPlayer(); n++)
							{
								System.out.println("Player" + (n+1));
								goOn = player[n].spinAgain();

								if(!goOn)
								{
									System.out.println("Player" + (n+1) + ":");
									System.out.println("The amount you won: $" + player[n].summaryWin());
									System.out.println("The amount you lost: $" + player[n].summaryLost());

									playerCount--;

									if(n < wheel.getNumPlayer())
									{
										while(n != playerCount)
										{
											System.out.println("Player" + (n+2) + " is now player" + (n+1));
											player[n] = player[n+1];
											goOn = player[n].spinAgain();
		    	     						n++;
										}
									}

								}

								playerCount = wheel.getNumPlayer();

							}
							wheel.setNumPlayer(playerCount);

	     				}
	     			}

	    		}
			}
			 round++;

	     }

 		 System.out.println("Game Over.");
		 wheel.house();

	}
}







