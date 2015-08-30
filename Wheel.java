/*  Java Class:Wheel.java
    Author:Noreen Chrysilla
    Class:CSCI 145
    Date:Due on 4/18/2014
    Description:Modify and add class Wheel so it can spin and return the spin result and determine
    			if the player has won/lost.

    I certify that the code below is modified and added by me.

	Exception(s): N/A

*/
import java.util.Random;

class Wheel
{
   public final static int GREEN     =  0;
   public final static int RED       =  1;
   public final static int BLACK     =  2;
   public final static int NUMBER    =  3;
   public final static int MIN_NUM   =  1;
   public final static int MAX_NUM   = 36;

   private final static int MAX_POSITIONS = 38;
   private final static int NUMBER_PAYOFF = 35;
   private final static int COLOR_PAYOFF  = 2;

   private static int nPlayer;
   private static int ballPosition;
   private static int color;
   private static String doubleZero = Integer.toString(GREEN) + Integer.toString(GREEN);

   private static int houseWin = 0;
   private static int houseLose = 0;

   public static void setNumPlayer(int n)
   {
		nPlayer = n;
   }

   public static int getNumPlayer()
   {
	   return nPlayer;
   }

   public static void betOptions()
   {
      System.out.println("1. Bet on red");
      System.out.println("2. Bet on black");
      System.out.println("3. Bet on a number");
   }

   public static void spin()
   {
	   Random generator = new Random();
	   ballPosition = generator.nextInt(37) + 1;
	   String col="";


	   if(ballPosition == 0)
	   {
		   color = GREEN;
	   }
	   else if(ballPosition % 2 == 0)
	   {
		   color = BLACK;
	   }
	   else
	   {
		   color = RED;
	   }

	   if(color == 0)
	   {
		    col = "Green";
	   }
	   else if(color == 1)
	   {
		   col = "Red";
	   }
	   else if(color == 2)
	   {
		   col ="Black";
	   }


	   if(ballPosition == 37)
	   {
		   String doubleZero = Integer.toString(GREEN) + Integer.toString(GREEN);
		   System.out.println("Current ball position is on number:  " + GREEN + GREEN + " color: " + col);
	   }
	   else
		   System.out.println("Current ball position is on number: "+ ballPosition + " color: " + col);
 }

   public static int payoff(int betAmount, int betype, int num)
   {
	   int winAmount = 0;
	   int lostAmount = 0;
	   Player player = new Player(0);

	   if(betype == NUMBER || betype == Integer.parseInt(doubleZero))
	   {
		   if(num == ballPosition)
		   {
			   winAmount = betAmount * NUMBER_PAYOFF;
			   System.out.println("Winning: " + winAmount);
			   houseLose += winAmount;
		   }
		   else
		   {
			   winAmount = 0;
			   lostAmount = betAmount;
			   houseWin += lostAmount;
		   }
	   }
	   else if(betype == RED || betype == BLACK)
	   {
		   if(betype == color)
		   {
			   winAmount = betAmount * COLOR_PAYOFF;
			   houseLose += winAmount;
		   }
		   else
		   {
			   winAmount = 0;
			   lostAmount = betAmount;
			   houseWin += lostAmount;
		   }
	   }
	   return winAmount;
	}

	public static void house()
	{
		System.out.println("HOUSE WON: " + houseWin);
		System.out.println("HOUSE LOST: " + houseLose);
	}

}
