// Fig. 15.13: JFileChooserTest.java
// Tests class JFileChooserDemo.
import java.io.IOException;
import javax.swing.JFrame;

public class JFileChooserTest
{
   public static void main(String[] args) throws IOException
   {
      JFileChooserDemo application = new JFileChooserDemo();
      application.setSize(400, 400); 
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.setVisible(true); 
   } 
} // end class JFileChooserTest

/*************************************************************************
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