/*  Java Class:Player.java
    Author:Noreen Chrysilla
    Class:CSCI 145
    Date:Due on 4/18/2014
    Description:Modify and add class Player so Roulette player can make bet,
    find out the result and how much he win/lose, ask the player to play again

    I certify that the code below is modified and added by me.

	Exception(s): N/A

*/
import java.util.*;

class Player
{
   private int bet, money, number, addMoney, lostAmt, winAmt;
   private Scanner scan;
   private int betType;

   Wheel wheel = new Wheel();

   public Player (int initialMoney)
   {
	  money = initialMoney;
      scan = new Scanner(System.in);
   }


   public int getMoney()
   {
	   return money;
   }


   public void makeBet()
   {
	   String doubleZero = "00";

      do
      {
    	  if(getMoney() == 0)
    	  {
    		  addMoney();
    	  }
    	  else
    	  {
	    	  System.out.print("How much to bet: $");
	          bet = scan.nextInt();


	          if(bet == -1)
		        	spinAgain();

	          else if(bet > 0 && bet <= money)
	          {

	    		  System.out.println("Betting it all!");

	    		  wheel.betOptions();
	    		  betType = scan.nextInt();


	    	      if(betType == wheel.RED || betType == wheel.BLACK)
	    	      {
	    	    	  System.out.println("You have bet on color.");
	    	      }
	    	      else if(betType == wheel.NUMBER)
	    	      {
	    	    	  do
	    	    	  {
	    	    		  System.out.println("Enter the number you would like to bet on (1 - 36). 37 for 00");
	    	    		  number = scan.nextInt();
	    	    		  if(number >= (wheel.MIN_NUM-1) && number <= wheel.MAX_NUM)
	    	    			  System.out.println("The number you are betting on is: " + number);
	    	    		  else if(number == 37)
	    	    			  System.out.println("The number you are betting on is: " + wheel.GREEN + wheel.GREEN);
	    	    		  else
	    	    			  System.out.println("The number is out of range.");
	    	    	  }while (number > (wheel.MAX_NUM + 1) || number < (wheel.MIN_NUM-1));
	    	      }
				  else
		    	  {
		    	      System.out.println("Bet type is invalid.");
		    	      wheel.betOptions();
		    	      betType = scan.nextInt();
		    	  }

	          }

	    	  else
	    	  {
	    		  System.out.println("Insufficient amount.");
	    	  }

    	  }

   }while(bet <-1 || bet == 0 || bet > money);

}

   public void payment()
   {
	   int winningAmt = wheel.payoff(bet, betType, number);
	   int losingAmt = 0;

	   if(winningAmt == 0)
			losingAmt = bet;
	   else
	   		losingAmt = 0;

	   System.out.println("You have won: $" + winningAmt);
	   System.out.println("You have lost: $" + losingAmt);

	   winAmt += winningAmt;

	   if(winningAmt == 0)
	   {
		   money -= bet;
		   lostAmt += bet;
	   }
	   else
	   {
		   money += winningAmt;
	   }

	   System.out.println("Your current balance is: $" + money);
	   if(money == 0)
		   addMoney();
   }


   public void addMoney()
   {
	   int option = 0;
	   System.out.println("Would you like to add more balance?");
	   System.out.println("Press 1 for Yes. Press other key to skip");
	   option = scan.nextInt();
	   if(option == 1)
	   {
		   System.out.println("Enter the amount you would like to add: ");
		   addMoney = scan.nextInt();
		   money += addMoney;
		   System.out.println("Your current balance is: $" + money);
	   }
	   else
		   return;
   }


   public int summaryWin()
   {
	   return winAmt;
   }


   public int summaryLost()
   {
	   return lostAmt;
   }


   public boolean spinAgain()
   {
      String answer;
      int invalid = 0;
      int player;
      player = wheel.getNumPlayer();

      do
      {
    	  System.out.print ("Spin again [y/n]? ");
    	  answer = scan.next();
	      if(answer.equals("y") || answer.equals("Y"))
	    	  return true;
	      else if(answer.equals("n")|| answer.equals("N"))
	      {
			  player--;
	    	  wheel.setNumPlayer(player);
	    	  System.out.println("Total player: " + (wheel.getNumPlayer()));
	    	  System.out.println("Thank you for playing!");
	    	  return false;
	      }
	      else
	    	  invalid++;
      }while(invalid > 0 );

      return true;
   }

}