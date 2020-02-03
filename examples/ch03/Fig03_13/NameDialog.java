// Fig. 3.13: NameDialog.java
// Obtaining user input from a dialog.
import javax.swing.JOptionPane;

public class NameDialog
{
   public static void main(String[] args)
   {
      // prompt user to enter name
      String name = JOptionPane.showInputDialog("What is your name?");
      
      // create the message
      String message =                                              
         String.format("Welcome, %s, to Java Programming!", name);

      // display the message to welcome the user by name 
      JOptionPane.showMessageDialog(null, message);
   } 
} // end class NameDialog

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