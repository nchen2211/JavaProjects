/*  Program:Shapes.java
    Author:Noreen Chrysilla
    Class:CSCI 145
    Date:3/8/2014
    Description:Draw shapes using Java applet

    I certify that the code below is copied from Lab2 PDF and modified by me

	Exception(s): N/A

*/
import javax.swing.JApplet;
import java.awt.*;
public class Shapes extends JApplet {
	
	public void paint (Graphics page)
	{
		// Declare size constants
		final int MAX_SIZE = 300;
		final int PAGE_WIDTH = 600;
		final int PAGE_HEIGHT = 400;
		
		// Declare variables
		int x1, y1, x2, y2, x3, y3,x4, y4; // x and y coordinates of upper left-corner of each shape
		int w1, h1, w2, h2, w3, h3, w4, h4; // width and height of each shape
		
		
		// First rect color
		page.setColor (Color.yellow);
		
		// First rect
		x1 = 400;
		y1 = 40;
		w1 = 150;
		h1 = 200;
		
		// Draw the first rectangle
		page.fillRect(x1, y1, w1, h1);
		
		// Second rect color
		page.setColor (Color.blue);
		
		// Second rect
		x2 = 450;
		y2 = 70;
		w2 = 100;
		h2 = 115;
		
		// Draw the second rectangle
		page.fillOval(x2, y2, w2, h2);
		
		// Third rect color
		page.setColor (Color.pink);
				
		// Third rect
		x3 = 485;
		y3 = 70;
		w3 = 210;
		h3 = 100;
				
		// Draw the third rectangle
		page.fillRect(x3, y3, w3, h3);
		
		// Forth rect color
		page.setColor (Color.orange);
				
		// Forth rect
		x4 = 0;
		y4 = 0;
		w4 = 110;
		h4 = 90;
				
		// Draw the Forth rectangle
		page.fillOval(x4, y4, w4, h4);
		
		System.out.print("Author: Noreen Chrysilla");
	}
}

