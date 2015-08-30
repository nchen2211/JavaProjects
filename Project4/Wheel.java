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

   private final static int MAX_POSITIONS = 37;
   private final static int NUMBER_PAYOFF = 35;
   private final static int COLOR_PAYOFF  = 2;

   private static int ballPosition;
   private static int color;
   private static String col, doubleZero = Integer.toString(GREEN) + Integer.toString(GREEN);

   private static int houseWin = 0;
   private static int houseLose = 0;
	
	static Game game = new Game ();
	
   
   public static void betOptions()
   {
      System.out.println("1. Bet on red");
      System.out.println("2. Bet on black");
      System.out.println("3. Bet on a number");
   }

   
   public static void spin()
   {
	   Random generator = new Random();
	   ballPosition = generator.nextInt(37);
	   

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
		   System.out.println("\nCurrent ball position is on number:  " + GREEN + GREEN + " color: " + col);
	   }
	   else
		   System.out.println("\nCurrent ball position is on number: "+ ballPosition + " color: " + col);
 }

   
   public static void winNumber(int one, int five, int tfive, int hundred)
   {
	   if(one != 0)
		   one += NUMBER_PAYOFF -1;
	   if(five != 0)
		   five += NUMBER_PAYOFF -1;
	   if(tfive != 0)
		   tfive += NUMBER_PAYOFF -1;
	   if(hundred != 0)
		   hundred += NUMBER_PAYOFF -1;
	   
	   game.deductHouseChips(one, five, tfive, hundred);
   }
   
   
   public static void winColor(int one, int five, int tfive, int hundred)
   {
	   winColorOne(one);
	   winColorFive(five);
	   winColorTfive(tfive);
	   winColorHundred(hundred);
	   
	   game.deductHouseChips( winColorOne(one), winColorFive(five), winColorTfive(tfive), winColorHundred(hundred));
   }
   
   
   public static int winColorOne(int one)
   {
	   if(one != 0)
		   one *= COLOR_PAYOFF;
	   return one;
   }
   
   
   public static int winColorFive(int five)
   {
	   if(five != 0)
		   five *= COLOR_PAYOFF;
	   return five;
   }
   
   
   public static int winColorTfive(int tfive)
   {
	   if(tfive != 0)
		   tfive *= COLOR_PAYOFF;
	   return tfive;
   }
   
   
   public static int winColorHundred(int hundred)
   {
	   if(hundred != 0)
		   hundred *= COLOR_PAYOFF;
	   return hundred;
   }
      
   
   public static void lose(int one, int five, int tfive, int hundred)
   {
	  
	  game.addHouseChips(one, five, tfive, hundred);
	  
   }
   
   
   public static void payoff(int one, int five, int tfive, int hundred)
   {
	   
	   winColor(one,five,tfive,hundred);
   }
	   
	   
   public static boolean isWin(int betype, int num)
   {
	   
	   if(betype == NUMBER || betype == Integer.parseInt(doubleZero))
	   {
	
		   if(num == ballPosition)
		   {	
			   System.out.println("NUMBER WON");		   
			   	return true;
		   }
		   else
			   return false;
		   
	   }
	   else if(betype == RED)
	   {
		   
		   if(betype == color)
		   {
			   System.out.println("RED WON");
			   return true;
		   }
		   else
			   return false;

	   }
	   else if(betype == BLACK)
	   {
		   
		   if(betype == color)
		   {
			   System.out.println("BLACK WON");
			   return true;
		   }
		   else 
			   return false;
	   }
	   
	   return true;
   }
   
}
   
   

	/*public static void house()
	{
		System.out.println("HOUSE WON: " + houseWin);
		System.out.println("HOUSE WON: " + houseLose);
	}*/

