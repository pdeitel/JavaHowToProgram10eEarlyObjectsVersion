// Fig. 5.27: ShapesTest.java
// Test application that displays class Shapes.
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest
{
   public static void main(String[] args)
   {
      // obtain user's choice
      String input = JOptionPane.showInputDialog(
         "Enter 1 to draw rectangle\n" +
         "Enter 2 to draw ovals");
      
      int choice = Integer.parseInt(input); // convert input to int
      
      // create the panel with the user's input
      Shapes panel = new Shapes(choice);
      
      JFrame application = new JFrame(); // creates a new JFrame

      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel); 
      application.setSize(300, 300); 
      application.setVisible(true); 
   }
} // end class ShapesTest


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
