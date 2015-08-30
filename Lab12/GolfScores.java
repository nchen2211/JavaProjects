
public class GolfScores {
	
	private int totalPar;
	private int totalScore;
	
	/*public GolfScores(int par, int[] score, int length)
	{
		totalPar = par;
		for(int i=0; i<length; i++)
			totalScore += score[i];
	}*/
	
	public GolfScores(int par, int score)
	{
		totalPar = par;
	    totalScore = score;
	}
	
	public int getScore()
	{
		return totalScore;
	}
	
	public String toString()
	{
		return "par: " + " score: " + "\n" + 
				totalPar +  "    " + (totalScore - totalPar);
	}

}
