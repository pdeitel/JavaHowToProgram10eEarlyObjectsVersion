// Fig. 4.18: DrawPanel.java
//  Using drawLine to connect the corners of a panel.
import java.awt.Graphics; 
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   // draws an X from the corners of the panel
   public void paintComponent(Graphics g)
   {
      // call paintComponent to ensure the panel displays correctly
      super.paintComponent(g);
      
      int width = getWidth(); // total width   
      int height = getHeight(); // total height

      // draw a line from the upper-left to the lower-right
      g.drawLine(0, 0, width, height);
      
      // draw a line from the lower-left to the upper-right
      g.drawLine(0, height, width, 0);
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