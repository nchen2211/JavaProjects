import java.io.*;
import java.util.Scanner;

public class TestRoulette {
	
	public static void main(String[] args)
	{
		final int MAX_PLAYER = 5;
		Scanner scan, inFile, lineScan, lineScan1;
		scan = new Scanner (System.in);
		int option = 0;
		String availGame ="";
		
		Chips chip = new Chips();
		Wheel wheel = new Wheel();
		Transaction[] transaction = new Transaction[MAX_PLAYER];	
		Game game = new Game();
		Player[] player = new Player[MAX_PLAYER];
		int[] seatNum = new int[MAX_PLAYER];
		
		String line, line1;
		int minBet = 0, maxBet = 0;
		int chipOne = 0, chipFive = 0, chipTfive = 0, chipHundred = 0;
		String gameMode = "";
		int gameVersion = 0;
		int playerCount = 0;
		
		
		int initialBalance = 0, totalCash = 0;
		String isVIP = "", vipID = "", name = "";
		
		int amountToExchange = 0;//use this for CashToChips()
				
		/*System.out.println("Initialize games. Please wait...");
		System.out.println("All games are ready.");
		System.out.println("Available games: 100A1, 100A2 ");
		System.out.println();
		
		System.out.println("Main Menu");
		System.out.println("1. Select a game");
		System.out.println("2. Quit");
		option = scan.nextInt();
		while(option != 1 && option != 2)
		{
			System.out.println("Option invalid. Try again");
			option = scan.nextInt();
		}
		
		if(option == 1)
		{
			System.out.println("Select a game");
			availGame = scan.next();
			if(availGame.equals("100A1"))//start open a game
			{
				System.out.println("BOO");*/
				String fileName = "games.txt";
				try
				{
					
					inFile = new Scanner(new File(fileName));
					
					while(inFile.hasNext())
					{
						line = inFile.nextLine();
						lineScan = new Scanner(line);
						gameMode = lineScan.next();
						System.out.println("Game mode: " + gameMode);
						gameVersion = Integer.parseInt(lineScan.next());
						System.out.println("Game version: " + gameVersion);
						
						line1 = inFile.nextLine();
						lineScan1 = new Scanner(line1);
						
						minBet = Integer.parseInt(lineScan1.next());		
						System.out.println("minBet:  " + minBet);
						maxBet = Integer.parseInt(lineScan1.next());
						System.out.println("maxBet:  " + maxBet);
						
						chipOne = Integer.parseInt(lineScan1.next());				
						System.out.println("chipOne:  " + chipOne);
						chipFive = Integer.parseInt(lineScan1.next());
						System.out.println("chipFive:  " + chipFive);
						chipTfive = Integer.parseInt(lineScan1.next());
						System.out.println("chipTfive:  " + chipTfive);
						chipHundred = Integer.parseInt(lineScan1.next());
						System.out.println("chipHundred:  " + chipHundred);
						break;
					}
					
					inFile.close();
					
				}
				catch (FileNotFoundException exception)
			      {
			         System.out.println ("The file " + fileName + " was not found.");
			      }
			      catch (IOException exception)
			      {
			         System.out.println (exception);
			      }
				
				game.setGameModel(gameMode);
				game.setInitialChips(chipOne, chipFive, chipTfive, chipHundred);
				game.setMinBet(minBet);
				game.setMaxBet(maxBet);
				game.houseTrackChips();
				System.out.println("\nHouse balance: $" + game.houseChipsAmount());
				System.out.println();
			
				/*do
				{
					System.out.println("1. Add a player to the game");
					System.out.println("2. Play one round");
					System.out.println("3. Switch to another game");
					option = scan.nextInt();
					while(option != 1 && option != 2)
					{
						System.out.println("Option invalid. Try again");
						option = scan.nextInt();
					}
					
					if(option == 1)//start add player
					{*/
						fileName = "players.txt";
						try
						{
							
							int countLine = 0;
							inFile = new Scanner(new File(fileName));
							int i= 0;
							
							while(inFile.hasNext())
							{
								countLine++;
								line = inFile.nextLine();
								lineScan = new Scanner(line);
							
								if(countLine == MAX_PLAYER + 1)
								{
									break;
								}
								
								isVIP = lineScan.next();
								if(isVIP.equals("Y"))
								{
		
									initialBalance = Integer.parseInt(lineScan.next());
									vipID = lineScan.next();
									name = lineScan.next();
									player[playerCount++] = new VIPPlayer(initialBalance,vipID,name);							
	
									for(i= 0; i<MAX_PLAYER; i++)
									{
										if(i == playerCount-1)				
											seatNum[i]++;
									}
									
									
								}
								else if(isVIP.equals("N"))
								{
									initialBalance = Integer.parseInt(lineScan.next());
									player[playerCount++] = new RegularPlayer(initialBalance);
									
								}
								
							}
							
							inFile.close();
							
						}
						catch (FileNotFoundException exception)
					    {
					       System.out.println ("The file " + fileName + " was not found.");
					    }
					    catch (IOException exception)
					    {
					       System.out.println (exception);
					    }
					
					
					game.setNumPlayer(playerCount);
					int totalPlayer = game.getNumPlayer();
					int round = 0;
					boolean goOn = true;
					int i = 0;
		
					while(totalPlayer > 0)
					{
						if(round > 0)
							transaction[i] = new Transaction();
						
						for(i=0; i<game.getNumPlayer(); i++)
						{
							System.out.println("Player" + (i+1));
							System.out.println("Balance: " + player[i].getBalance());	
							player[i].setSeatNum(i+1);
							System.out.println("Seat number: " + player[i].getSeatNum());
							if(seatNum[i] > 0)
							{
								System.out.println("VIP ID: " + ((VIPPlayer)player[i]).getVipID());
								System.out.println("Name: " + ((VIPPlayer)player[i]).getName());
							}
							System.out.println();
						}
						
										
						for(i=0; i<game.getNumPlayer(); i++)
						{
							int n = 0;
							
							if(round == 0)
								transaction[i] = new Transaction();
							
							/*if(round > 0)
							{
								for( i=0; i<game.getNumPlayer(); i++)
								{
									System.out.println("Player" + (i+1));
									System.out.println("Balance: " + transaction[i].getTotalCash());	
									System.out.println("Chips: ");
									transaction[i].trackChips();
									player[i].setSeatNum(i+1);
									System.out.println("Seat number: " + player[i].getSeatNum());
									if(seatNum[i] > 0)
									{
										System.out.println("VIP ID: " + ((VIPPlayer)player[i]).getVipID());
										System.out.println("Name: " + ((VIPPlayer)player[i]).getName());
									}
									System.out.println();
																	
								}
								
								i = 0;
							}*/
						
							
							System.out.println("Player" + (i+1));
							if(round > 0)
							{
								System.out.println("Chips on hand: ");
								transaction[i].trackChips();
								System.out.println("Cash on hand: " +  transaction[i].getTotalCash());
							}
							System.out.println("Enter the amount to exchange into chips: ");
							amountToExchange = scan.nextInt();
							transaction[i].cashToChip(amountToExchange,player[i].getBalance());
							
							System.out.println("Total cash on hand: " + transaction[i].getTotalCash());
							System.out.println();System.out.println();
							
							if(i == game.getNumPlayer() - 1)
							{	
								for(i =0; i<game.getNumPlayer(); i++)
								{
									System.out.println("Player" + (i+1));
									transaction[i].trackChips();
									System.out.println("BOO");
									transaction[i].makeBet();
									n++;
									System.out.println();System.out.println();
								
									game.setNumPlayer(totalPlayer);
									
									if(n == game.getNumPlayer())
									{
										wheel.spin();
										round++;
								
										for(i=0; i<game.getNumPlayer(); i++)
										{
											System.out.println("Player" + (i+1) + " result: ");
											transaction[i].payment();
											System.out.println();System.out.println();
										}
										
										for(i=0; i<game.getNumPlayer(); i++)
										{
											System.out.println("Player" + (i+1));
											goOn = transaction[i].spinAgain(game.getNumPlayer());
											
											if(!goOn)
											{
												System.out.println("Player" + (i+1) + " summary : ");
												System.out.println("Chips on hand: ");
												transaction[i].trackChips();
												System.out.println("Cash on hand: " + transaction[i].getTotalCash());
												
												totalPlayer--;
												
												if(i < game.getNumPlayer())
												{
												
													while(i != totalPlayer)
													{
														System.out.println("Player" + (i+2) + " is now player" + (i+1));
														player[i] = player[i+1];
														goOn = transaction[i].spinAgain(game.getNumPlayer());
					    	     						i++;
													}
												}
											}
											totalPlayer = game.getNumPlayer();
										
										}
										
										game.setNumPlayer(totalPlayer);
										
									}
								}
							}
						}
					}
					
					}//end add player
						
					/*else if(option == 2)
					{
						if(playerCount == 0)
						{
							System.out.print("Total player is: " + playerCount);
							System.out.print("Game can't be started without any player");
						}
						else
						{
							for(int i=0; i<playerCount; i++)
							{
								System.out.println("Player" + (i+1));
								//System.out.println("Seat number: " + player[i].getSeatNum());
								System.out.println("Initial balance: " + player[i].getBalance());
								System.out.println("Enter the amount to exchange into chips: ");
								amountToExchange = scan.nextInt();
								transaction.cashToChip(amountToExchange,player[i].getBalance());
								transaction.makeBet();
								
								if(i == playerCount - 1)
								wheel.spin();
								for(int n=0; n<playerCount; n++)
								{
									System.out.println("Player" + (n+1) + " result: ");
									transaction.payment();
								}
							}
						}
					}//end play one round
				}while(option != 3);*/
				
				

					
			}


		
		
		
		
	
	
		
		

		/*Player player;
		Player playerVIP;
		player = new RegularPlayer(100);
		playerVIP = new VIPPlayer(500, "abc");
		
		System.out.print("\nBalance of regular player: " + player.getBalance());
		System.out.print("\nSeat number of regular player: " + player.getSeatNum());
		System.out.print("\nBalance of VIP player: " + playerVIP.getBalance());
		
		System.out.println();
		transaction.cashToChip(player.getBalance());
		//System.out.println("House chip after cash to chip: ");
		//game.houseTrackChips();
		System.out.println("Cash in chips: " + transaction.getAmountInChips());
		transaction.makeBet();
		wheel.spin();
		transaction.payment();
		
		//System.out.println("House chip after result: ");
		//game.houseTrackChips();
		
		player.trackChips();
		player.money();*/

	


