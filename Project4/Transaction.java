import java.util.Scanner;

public class Transaction {
	
	private int transactionNum, amountInChips, totalCash, totalBet;
	private int oneOnHand, fiveOnHand, tfiveOnHand, hundredOnHand;
	private int [] betOne; 
	private int [] betFive;
	private int [] betTfive;
	private int [] betHundred;
	private int betOnNumber, betCount;
	private int totalBetOne, totalBetFive, totalBetTfive, totalBetHundred;
	private int[] betType;


	Scanner scan = new Scanner(System.in);
	Game game = new Game();
	Chips chip = new Chips();
	Wheel wheel = new Wheel();
	Player player;
	

	public int getAmountInChips()
	{
		/*return amountInChips = (chip.totalOne(oneOnHand) + chip.totalFive(fiveOnHand)
				+ chip.totalTfive(tfiveOnHand) + chip.totalHundred(hundredOnHand));*/
		return amountInChips = chip.amountInChips(oneOnHand, fiveOnHand, tfiveOnHand, hundredOnHand);
	}
	
	
	public void setTotalCash(int amount)
	{
		totalCash = amount;
	}
	
	
	public int getTotalCash()
	{
		return totalCash;
	}
	
	
	public void trackChips()
	{
		System.out.println(getOneOnHand() +" $1.00 chip(s)");
		System.out.println(getFiveOnHand() +" $5.00 chip(s)");
		System.out.println(getTfiveOnHand() +" $25.00 chip(s)");
		System.out.println(getHundredOnHand() +" $100.00 chip(s)");
	}

	
	public int getOneOnHand()
	{
		return oneOnHand;
	}
	
	
	public int getFiveOnHand()
	{
		return fiveOnHand;
	}
	
	
	public int getTfiveOnHand()
	{
		return tfiveOnHand;
	}
	
	
	public int getHundredOnHand()
	{
		return hundredOnHand;
	}
	
	
	public void cashToChip(int amount, int cashAvailable)
	{
		totalCash = cashAvailable;
		int one = 0, five = 0, tfive = 0, hundred = 0;		
		int totalOne = 0, totalFive = 0, totalTfive = 0, totalHundred = 0;
		
		while(amount > getTotalCash())
		{
			System.out.println("The amount is greater than cash on hand");
			System.out.println("Re-enter the bet: ");
			amount = scan.nextInt();
		}
		
		totalCash -= amount;
		while(amount % 100 != 0)
		{
			System.out.println("The amount needs to be a multiple of 100");
			System.out.println("Re-enter the bet: ");
			amount = scan.nextInt();
		}
		if(amount != 0)
		{
			System.out.println("How many of $1.00 chip: ");
			one = scan.nextInt();
			totalOne = chip.totalOne(one);
			while(amount < totalOne)
			{
				totalOne = 0;		
				System.out.println("Insufficient amount of cash.");
				System.out.println("Re-enter: ");
				one = scan.nextInt();
				totalOne = chip.totalOne(one);
			}
			amount -= totalOne;
			oneOnHand += one;
			
			System.out.println("How many of $5.00 chip: ");
			five = scan.nextInt();
			totalFive = chip.totalFive(five);
			while(amount < totalFive)
			{
				totalFive = 0;
				System.out.println("Insufficient amount of cash.");
				System.out.println("Re-enter: ");
				five = scan.nextInt();
				totalFive = chip.totalFive(five);
			}
			amount -= totalFive;
			fiveOnHand += five;
			
			System.out.println("How many of $25.00 chip: ");
			tfive = scan.nextInt();
			totalTfive = chip.totalTfive(tfive);
			while(amount < totalTfive)
			{
				totalTfive = 0;
				System.out.println("Insufficient amount of cash.");
				System.out.println("Re-enter: ");
				tfive = scan.nextInt();
				totalTfive = chip.totalTfive(tfive);
			}
			amount -= totalTfive;
			tfiveOnHand += tfive;
			
			System.out.println("How many of $100.00 chip: ");
			hundred = scan.nextInt();		
			totalHundred = chip.totalHundred(hundred);
			while(amount < totalHundred)
			{
				totalHundred = 0;
				System.out.println("Insufficient amount of cash.");
				System.out.println("Re-enter: ");
				hundred = scan.nextInt();
				totalHundred = chip.totalHundred(hundred);
			}
			amount -= totalHundred;
			hundredOnHand += hundred;
					
			amount = chip.amountInChips(oneOnHand, fiveOnHand, tfiveOnHand, hundredOnHand);
			System.out.println("You have exchanged: $" + amount + " with ");
		}
		trackChips();
		
		game.deductHouseChips(oneOnHand, fiveOnHand, tfiveOnHand, hundredOnHand);
		
	}

	
	public int chipOneToBet()
	{
		int one = 0;
		
		System.out.print("\n$1.00 chip(s): ");
		one = scan.nextInt();
		while(one > getOneOnHand())
		{
			System.out.println("The number you entered is greater than chips on hand");
			one = scan.nextInt();
		}
		return one;
	}
	
	
	public int chipFiveToBet()
	{
		int five = 0;
		
		System.out.print("\n$5.00 chip(s): ");
		five = scan.nextInt();
		while(five > getFiveOnHand())
		{
			System.out.println("The number you entered is greater than chips on hand");
			five = scan.nextInt();
		}
		return five;
	}
	
	
	public int chipTfiveToBet()
	{
		int tfive = 0;
		
		System.out.print("\n$25.00 chip(s): ");
		tfive = scan.nextInt();
		while(tfive > getTfiveOnHand())
		{
			System.out.println("The number you entered is greater than chips on hand");
			tfive = scan.nextInt();
		}
		return tfive;
	}
	
	
	public int chipHundredToBet()
	{
		int hundred = 0;
		
		System.out.print("\n$100.00 chip(s): ");
		hundred = scan.nextInt();
		while(hundred > getHundredOnHand())
		{
			System.out.println("The number you entered is greater than chips on hand");
			hundred = scan.nextInt();
		}
		return hundred;
	}

	
	public void makeBet()
	{
		
		int maxBet = 3;
		betType = new int [maxBet];
		betOne = new int[maxBet];
		betFive = new int[maxBet];
		betTfive = new int[maxBet];
		betHundred = new int [maxBet];
		int placeMoreBet = 0;
		betCount = 0;
		
		while(betCount < maxBet)
		{
			System.out.println("INSIDE MAKEBET");
			wheel.betOptions();
			betType[betCount] = scan.nextInt();
			
			while(betType[betCount] < 0 || betType[betCount] > 3)
			{
				System.out.print("\nInvalid bet type.");
				betType[betCount] = scan.nextInt();
			}
			
						
			if(betType[betCount] == wheel.RED)
			{
				System.out.print("\nChips to bet on " + wheel.RED);
				betOne[betCount] = chipOneToBet();
				betFive[betCount] = chipFiveToBet();
				betTfive[betCount] = chipTfiveToBet();
				betHundred[betCount] = chipHundredToBet();
			}
			else if(betType[betCount] == wheel.BLACK)
			{
				System.out.print("\nChips to bet on " + wheel.BLACK);
				betOne[betCount] = chipOneToBet();
				betFive[betCount] = chipFiveToBet();
				betTfive[betCount] = chipTfiveToBet();
				betHundred[betCount] = chipHundredToBet();
			}
			else if(betType[betCount] == wheel.NUMBER)
			{
				System.out.print("\nEnter the number you want to bet on: ");
				betOnNumber = scan.nextInt();
				while(betOnNumber < 0 || betOnNumber > 37)
				{
					System.out.print("\nNumber is out of range");
					betOnNumber = scan.nextInt();
				}
				System.out.print("\nChips to bet on " + betOnNumber);
				
				betOne[betCount] = chipOneToBet();
				betFive[betCount] = chipFiveToBet();
				betTfive[betCount] = chipTfiveToBet();
				betHundred[betCount] = chipHundredToBet();
			}
			else if(betType[betCount] == 0)
			{
				System.out.println("Stop entering bet.");
				maxBet = betCount;
				break;
			}
			
			betCount++;		
			System.out.print("\nYou have " + (maxBet - betCount) + " bet(s) left.");
		}
		
		for(int i=0; i<betCount; i++)
		{
			totalBetOne += betOne[i];
			totalBetFive += betFive[i];
			totalBetTfive += betTfive[i];
			totalBetHundred += betHundred[i];
		}
		
		oneOnHand -= totalBetOne;
		fiveOnHand -= totalBetFive;
		tfiveOnHand -= totalBetTfive;
		hundredOnHand -= totalBetHundred;
		
		System.out.println("\nYou have: ");
		trackChips();
		System.out.println("on hand after placing the bets");
		
	}
	
	
	public int getBet()
	{
		/*totalBet =  (chip.totalOne(betOne) + chip.totalFive(betFive)
				+ chip.totalTfive(betTfive) + chip.totalHundred(betHundred));*/
		
		return totalBet = chip.amountInChips(totalBetOne, totalBetFive, totalBetTfive, totalBetHundred);
	}
	
	
	public void payment()
	{
		int amount = 0, option = 0;
		
		for(betCount=0; betCount<betType.length; betCount++)
		{
			if(wheel.isWin(betType[betCount], betOnNumber))
			{
			 wheel.payoff(betOne[betCount], betFive[betCount], betTfive[betCount], 
					 betHundred[betCount]);
			 
			 oneOnHand += (betOne[betCount] + wheel.winColorOne(betOne[betCount]));
			 fiveOnHand += (betFive[betCount] + wheel.winColorFive(betFive[betCount]));
			 tfiveOnHand += (betTfive[betCount] + wheel.winColorTfive(betTfive[betCount]));
			 hundredOnHand += (betHundred[betCount] + wheel.winColorHundred(betHundred[betCount]));
			}
			else if(!wheel.isWin(betType[betCount], betOnNumber))
			{
				 wheel.lose(betOne[betCount], betFive[betCount], betTfive[betCount], betHundred[betCount]);
			}
			 
		}
		
		System.out.println("You have: ");
		trackChips();
		System.out.println("on hand");
		if(zeroChipLeft())
		{
			System.out.println("Chips available: 0. Would you like to purchase more chips?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			option = scan.nextInt();
			while(option != 1 && option != 2)
			{
				System.out.println("Invalid entry.");
				option = scan.nextInt();
			}
			if(option == 1)
			{
				if(getTotalCash() == 0)
				{
					System.out.println("Cash available: $0.0. Would you like to add more cash?");
					System.out.println("1. Yes");
					System.out.println("2. No");
					option = scan.nextInt();
					while(option != 1 && option != 2)
					{
						System.out.println("Invalid entry.");
						option = scan.nextInt();
					}
					if(option == 1)
						addMoreCash(amount);
					else if(option == 2)
					{
					
					}
						//spinAgain();
				}
				else//when the player still have more cash avail
				{
					System.out.println("Enter the amount for purchasing the chips.");
					amount = scan.nextInt();
					cashToChip(amount, totalCash);
				}
			}
			else if(option == 2)
			{
				//spinAgain();
			}
	
		}

	}
	
	
	public boolean zeroChipLeft()
	{
		if(oneOnHand == 0 && fiveOnHand == 0 && tfiveOnHand == 0 && hundredOnHand == 0)
			return true;
		return false;
	}
	
	
	public void addMoreCash(int amount)
	{
		System.out.println("Enter the amount.");
		amount = scan.nextInt();
		totalCash += amount;
	}
	
	
	public boolean spinAgain(int player)
	{
		String answer;
		int invalid = 0;
		game.setNumPlayer(player);
		
		do
	      {
	    	  System.out.print ("Spin again [y/n]? ");
	    	  answer = scan.next();
		      if(answer.equals("y") || answer.equals("Y"))
		    	  return true;
		      else if(answer.equals("n")|| answer.equals("N"))
		      {
				  player--;
		    	  game.setNumPlayer(player);
		    	  System.out.println("Total player: " + (game.getNumPlayer()));
		    	  System.out.println("Thank you for playing!");
		    	  return false;
		      }
		      else
		    	  invalid++;
	      }while(invalid > 0 );

	      return true;
	}
	
}
