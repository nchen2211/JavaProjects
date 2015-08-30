/*Program: VoteCounter.java
 * Author: Noreen Chrysilla
 * Class: CSCI 145
 * Date: Due on 3/28/2014 (close lab)
 * Description: 
 * 
 * Exception: I certified code below is modified by me.
 */

import javax.swing.JFrame;

public class VoteCounter
{
    //----------------------------------------------
    // Creates the main program frame.
    //----------------------------------------------
    public static void main(String[] args)
    {
	JFrame frame = new JFrame("Vote Counter");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.getContentPane().add(new VoteCounterPanel());
	
	frame.pack();
	frame.setVisible(true);
    }
}