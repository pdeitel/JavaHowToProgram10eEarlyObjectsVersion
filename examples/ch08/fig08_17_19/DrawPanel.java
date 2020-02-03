// Fig. 8.18: DrawPanel.java
// Program that uses class MyLine
// to draw random lines.
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   private SecureRandom randomNumbers = new SecureRandom();   
   private MyLine[] lines; // array on lines

   // constructor, creates a panel with random shapes
   public DrawPanel()
   {
      setBackground(Color.WHITE);
      
      lines = new MyLine[5 + randomNumbers.nextInt(5)];

      // create lines
      for (int count = 0; count < lines.length; count++)
      {
         // generate random coordinates
         int x1 = randomNumbers.nextInt(300);
         int y1 = randomNumbers.nextInt(300);
         int x2 = randomNumbers.nextInt(300);
         int y2 = randomNumbers.nextInt(300);
         
         // generate a random color
         Color color = new Color(randomNumbers.nextInt(256), 
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
         
         // add the line to the list of lines to be displayed
         lines[count] = new MyLine(x1, y1, x2, y2, color);
      } 
   } 

   // for each shape array, draw the individual shapes
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      // draw the lines
      for (MyLine line : lines)
         line.draw(g);
   } 
} // end class DrawPanel


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/