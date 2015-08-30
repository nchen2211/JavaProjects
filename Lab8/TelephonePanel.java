/*  Program: TelephonePanel.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/23/2014
    Description: Create a telephone panel using borderLayout and gridLayout

    I certify that the code below is my own work.

	Exception(s): N/A

*/
import java.awt.*;
import javax.swing.*;

public class TelephonePanel extends JPanel
{
	public TelephonePanel()
	{
		//set BorderLayout for this panel
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		//create a JLabel with "Your Telephone" title
		JLabel labelTitle = new JLabel("Your Telephone!");
		System.out.println();
		add(labelTitle, BorderLayout.NORTH);
		//add title label to north of this panel
		
		//create panel to hold keypad and give it a 4x3 GridLayout
		JPanel subpanel = new JPanel();
		subpanel.setLayout(new GridLayout(4,3));
		
		//add buttons representing keys to key panel
		JButton b1 = new JButton ("1");
		JButton b2 = new JButton ("2");
		JButton b3 = new JButton ("3");
		JButton b4 = new JButton ("4");
		JButton b5 = new JButton ("5");
		JButton b6 = new JButton ("6");
		JButton b7 = new JButton ("7");
		JButton b8 = new JButton ("8");
		JButton b9 = new JButton ("9");
		JButton b10 = new JButton ("*");
		JButton b11 = new JButton ("0");
		JButton b12 = new JButton ("#");
		
		add (b1);
		add (b2);
		add (b3);
		add (b4);
		add (b5);
		add (b6);
		add (b7);
		add (b8);
		add (b9);
		add (b10);
		add (b11);
		add (b12);
		//add key panel to center of this panel
		
		add(subpanel, BorderLayout.CENTER);
		
		JLabel authorLabel = new JLabel("Noreen Chrysilla");
		add(authorLabel);
	}
}