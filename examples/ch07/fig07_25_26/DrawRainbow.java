// Fig. 7.25: DrawRainbow.java
// Drawing a rainbow using arcs and an array of colors.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel
{
   // define indigo and violet
   private final static Color VIOLET = new Color(128, 0, 128);
   private final static Color INDIGO = new Color(75, 0, 130);
   
   // colors to use in the rainbow, starting from the innermost
   // The two white entries result in an empty arc in the center
   private Color[] colors =
      {Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
       Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
        
   // constructor
   public DrawRainbow()
   {
      setBackground(Color.WHITE); // set the background to white
   } // end DrawRainbow constructor
        
   // draws a rainbow using concentric arcs
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      int radius = 20; // radius of an arc
      
      // draw the rainbow near the bottom-center
      int centerX = getWidth() / 2;
      int centerY = getHeight() - 10;

      // draws filled arcs starting with the outermost
      for (int counter = colors.length; counter > 0; counter--)
      {
         // set the color for the current arc
         g.setColor(colors[counter - 1]);
         
         // fill the arc from 0 to 180 degrees
         g.fillArc(centerX - counter * radius,
            centerY - counter * radius, 
            counter * radius * 2, counter * radius * 2, 0, 180);
      } 
   } 
} // end class DrawRainbow


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

