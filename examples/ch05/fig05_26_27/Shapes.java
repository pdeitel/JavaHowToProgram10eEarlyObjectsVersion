// Fig. 5.26: Shapes.java
// Demonstrates drawing different shapes.
import java.awt.Graphics; //handle the display
import javax.swing.JPanel;

public class Shapes extends JPanel
{
   private int choice; // user's choice of which shape to draw
   
   // constructor sets the user's choice
   public Shapes(int userChoice)
   {
      choice = userChoice;
   } 
   
   // draws a cascade of shapes starting from the top-left corner
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      for (int i = 0; i < 10; i++)
      {
         // pick the shape based on the user's choice
         switch (choice)
         {
            case 1: // draw rectangles
               g.drawRect(10 + i * 10, 10 + i * 10, 
                  50 + i * 10, 50 + i * 10);
               break;
            case 2: // draw ovals
               g.drawOval(10 + i * 10, 10 + i * 10, 
                  50 + i * 10, 50 + i * 10);
               break;
         } 
      } 
   } 
} // end class Shapes


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
