/*Program: BaseballStats.java
 * Author: Noreen Chrysilla
 * Class: CSCI 145
 * Date: Due on 4/9/2014 (open lab)
 * Description: Open .dat file that contains a baseball team performance. Output each player
 * and each hits, outs, walks, and sacrifices.
 * 
 * Exception: I certified code below is modified by me.
 */

import java.util.Scanner; 
import java.io.*; 

public class BaseballStats 
{ 
 //------------------------------------------------- 
 // Reads baseball stats from a file and counts 
 // total hits, outs, walks, and sacrifice flies 
 // for each player. 
 //------------------------------------------------- 
 public static void main (String[] args) throws IOException 

 { 
	Scanner fileScan, lineScan; 
	String fileName; 
	String player;
	String result = "";

	
 	Scanner scan = new Scanner(System.in); 
	
	System.out.print ("Enter the name of the input file: "); 
	fileName = scan.nextLine(); 
	
	fileScan = new Scanner(new File(fileName)); 
	// Read and process each line of the file 
	
	while(fileScan.hasNext())
	{
		int hits = 0;
		int outs = 0;
		int walks = 0;
		int sac = 0;
		
		player = fileScan.nextLine();
		System.out.println(player);
		
		lineScan = new Scanner(player);
		lineScan.useDelimiter(",");
	
		for(int i=0; i<player.length(); i++)
		{
			if(i > 1 && player.charAt(i-1)==',' && player.charAt(i+1) == ',' 
					|| i > 1 && player.charAt(i-1) ==',' && player.charAt(i+1) ==' ')
			{
				if(player.charAt(i) == 'h')
					hits++;
				else if(player.charAt(i) == 'o')
					outs++;
				else if(player.charAt(i) == 'w')
					walks++;
				else if(player.charAt(i) == 's')
					sac++;
			}
						
		}
			
		System.out.println("hits: " + hits);				
		System.out.println("outs: " + outs);
		System.out.println("walks: " + walks);
		System.out.println("sacrifice: " + sac);
		System.out.println("average: " + (double)hits/(hits+outs));

		}
	System.out.println("Author: Noreen Chrysilla");
			
	}
}
				
	

