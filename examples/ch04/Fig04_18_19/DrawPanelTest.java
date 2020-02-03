// Fig. 4.19: DrawPanelTest.java
// Creating JFrame to display DrawPanel.
import javax.swing.JFrame;

public class DrawPanelTest
{
   public static void main(String[] args)
   {
      // create a panel that contains our drawing
      DrawPanel panel = new DrawPanel();
      
      // create a new frame to hold the panel
      JFrame application = new JFrame();
      
      // set the frame to exit when it is closed
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      application.add(panel); // add the panel to the frame      
      application.setSize(250, 250); // set the size of the frame
      application.setVisible(true); // make the frame visible    
   } 
} // end class DrawPanelTest


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