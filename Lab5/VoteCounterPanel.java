/*Program: VoteCounterPanel.java
 * Author: Noreen Chrysilla
 * Class: CSCI 145
 * Date: Due on 3/28/2014 (close lab)
 * Description: 
 * 
 * Exception: I certified code below is modified by me.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VoteCounterPanel extends JPanel
{
    private int votesForJoe;
    private JButton joe;
    private JLabel labelJoe;
    private int votesForSam;
    private JButton sam;
    private JLabel labelSam;
    private JLabel labelAuthor;

    //----------------------------------------------
    // Constructor: Sets up the GUI.
    //----------------------------------------------
    public VoteCounterPanel()
    {
	votesForJoe = 0;
	votesForSam = 0;

	joe = new JButton("Vote for Joe");
	joe.addActionListener(new JoeButtonListener());

	labelJoe = new JLabel("Votes for Joe: " + votesForJoe);

	add(joe);
	add(labelJoe);
	
	sam = new JButton("Vote for Sam");
	sam.addActionListener(new SamButtonListener());

	labelSam = new JLabel("Votes for Sam: " + votesForSam);

	add(sam);
	add(labelSam);

	labelAuthor = new JLabel("Author: Noreen Chrysilla");
	add(labelAuthor);

	setPreferredSize(new Dimension(300, 90));
	setBackground(Color.cyan);
    }

    //***************************************************
    // Represents a listener for button push (action) events
    //***************************************************
    private class JoeButtonListener implements ActionListener
    {
	//----------------------------------------------
	// Updates the counter and label when Vote for Joe 
	// button is pushed
	//----------------------------------------------
    	public void actionPerformed(ActionEvent event)
		{
		    votesForJoe++;
		    labelJoe.setText("Votes for Joe: " + votesForJoe);
		}
    }
    
    private class SamButtonListener implements ActionListener
    {
	//----------------------------------------------
	// Updates the counter and label when Vote for Sam 
	// button is pushed
	//----------------------------------------------
    	public void actionPerformed(ActionEvent event)
    	{	
    		votesForSam++;
    		labelSam.setText("Votes for Sam: " + votesForSam);
    	}
    }
}