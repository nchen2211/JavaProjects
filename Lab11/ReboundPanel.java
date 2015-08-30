/*  Java Class: ReboundPanel.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/21/14
    Description: Added one more GIF image.
    
    I certify that the code below is my own work.

	Exception(s): N/A

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReboundPanel extends JPanel
{
   private final int WIDTH = 300, HEIGHT = 100;
   private final int DELAY = 18, IMAGE_SIZE = 35;

   private ImageIcon image, image1;
   private Timer timer;
   private int x, y, x1,y1, moveX, moveY, moveX1, moveY1;

   //-----------------------------------------------------------------
   //  Sets up the panel, including the timer for the animation.
   //-----------------------------------------------------------------
   public ReboundPanel()
   {
      timer = new Timer(DELAY, new ReboundListener());

      image = new ImageIcon ("happyFace.gif");
      image1 = new ImageIcon ("happyFace.gif");

      x = 0;
      y = 40;
      
      x1 = 18;
      y1 = 48;
      moveX = moveY = 3;
      moveX1 = moveY1 = 8;
      

      setPreferredSize (new Dimension(WIDTH, HEIGHT));
      setBackground (Color.black);
      timer.start();
   }

   //-----------------------------------------------------------------
   //  Draws the image in the current location.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);
      image.paintIcon (this, page, x, y);
      image1.paintIcon(this, page, x1, y1);
   }

   //*****************************************************************
   //  Represents the action listener for the timer.
   //*****************************************************************
   private class ReboundListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Updates the position of the image and possibly the direction
      //  of movement whenever the timer fires an action event.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         x += moveX;
         y += moveY;
         
         x1 += moveX1;
         y1 += moveY1;

         if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
            moveX = moveX * -1;

         if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
            moveY = moveY * -1;
         
         if (x1 <= 0 || x1 >= WIDTH-IMAGE_SIZE)
             moveX1 = moveX1 * -1;

          if (y1 <= 0 || y1 >= HEIGHT-IMAGE_SIZE)
             moveY1 = moveY1 * -1;
    
         repaint();
      }
   }
}
