/*Program: NestedPanel.java
 * Author: Noreen Chrysilla
 * Class: CSCI 145
 * Date: Due on 3/26/2014
 * Description: 
 * 
 * Exception: I modified the code. It was originally provided by the book.
 */
import java.awt.*;
import javax.swing.*;

public class NestedPanel
{
   //-----------------------------------------------------------------
   //  Presents two colored panels nested within a third.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Nested Panels");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      // Set up first subpanel
      JPanel subPanel1 = new JPanel();
      subPanel1.setPreferredSize (new Dimension(150, 100));
      subPanel1.setBackground (Color.green);
      JLabel label1 = new JLabel ("One");
      subPanel1.add (label1);

      // Set up second subpanel
      JPanel subPanel2 = new JPanel();
      subPanel2.setPreferredSize (new Dimension(150, 100));
      subPanel2.setBackground (Color.red);
      JLabel label2 = new JLabel ("Two");
      subPanel2.add (label2);
      
      //set up third subpanel
      JPanel subPanel3 = new JPanel();
      subPanel3.setPreferredSize(new Dimension(300,100));
      subPanel3.setBackground(Color.pink);
      JLabel label3 = new JLabel ("Three");
      subPanel3.add(label3);
      
    //set up forth subpanel
    //What was the effect of this panel?
    //It adds the subPanel4 on top of other subpanels
      JPanel subPanel4 = new JPanel();
      subPanel4.setPreferredSize(new Dimension(320,20));
      subPanel4.setBackground(Color.yellow);
      JLabel label4 = new JLabel ("My Panel");
      subPanel4.add(label4);
      
      // Set up primary panel
      JPanel primary = new JPanel();
      //Now add a statement to the program 
      //to set the preferred size of the primary
      //panel to 320 by 260. (What would be the
     //purpose of this?). The purpose is to set the dimension and adjust the panel
      //to go to the next line if it passes the width.
      primary.setPreferredSize(new Dimension(360,240));
      primary.setBackground (Color.blue);
      primary.add (subPanel4);
      primary.add (subPanel1);
      primary.add (subPanel2);
      primary.add (subPanel3);
      

      frame.getContentPane().add(primary);
      frame.pack();
      frame.setVisible(true);
   }
}
