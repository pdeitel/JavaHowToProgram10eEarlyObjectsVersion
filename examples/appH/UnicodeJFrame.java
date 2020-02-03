// Fig. L.3: UnicodeJFrame.java
// Demonstrating how to use Unicode in Java programs.
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnicodeJFrame extends JFrame 
{
   // constructor creates JLabels to display Unicode
   public UnicodeJFrame()
   {
      super("Demonstrating Unicode");

      setLayout(new GridLayout(8, 1)); // set frame layout

      // create JLabels using Unicode
      JLabel englishJLabel = new JLabel("\u0057\u0065\u006C\u0063" +
         "\u006F\u006D\u0065\u0020\u0074\u006F\u0020Unicode\u0021");
      englishJLabel.setToolTipText("This is English");
      add(englishJLabel);
      
      JLabel chineseJLabel = new JLabel("\u6B22\u8FCE\u4F7F\u7528" +
         "\u0020\u0020Unicode\u0021");
      chineseJLabel.setToolTipText("This is Traditional Chinese");
      add(chineseJLabel);
      
      JLabel cyrillicJLabel = new JLabel("\u0414\u043E\u0431\u0440" +
         "\u043E\u0020\u043F\u043E\u0436\u0430\u043B\u043E\u0432" +
         "\u0430\u0422\u044A\u0020\u0432\u0020Unicode\u0021");
      cyrillicJLabel.setToolTipText("This is Russian");
      add(cyrillicJLabel);
      
      JLabel frenchJLabel = new JLabel("\u0042\u0069\u0065\u006E\u0076" +
         "\u0065\u006E\u0075\u0065\u0020\u0061\u0075\u0020Unicode\u0021");
      frenchJLabel.setToolTipText("This is French");
      add(frenchJLabel);
      
      JLabel germanJLabel = new JLabel("\u0057\u0069\u006C\u006B\u006F" +
         "\u006D\u006D\u0065\u006E\u0020\u007A\u0075\u0020Unicode\u0021");
      germanJLabel.setToolTipText("This is German");
      add(germanJLabel);
      
      JLabel japaneseJLabel = new JLabel("Unicode\u3078\u3087\u3045" +
         "\u3053\u305D\u0021");
      japaneseJLabel.setToolTipText("This is Japanese");
      add(japaneseJLabel);
      
      JLabel portugueseJLabel = new JLabel("\u0053\u00E9\u006A\u0061" +  
         "\u0020\u0042\u0065\u006D\u0076\u0069\u006E\u0064\u006F\u0020" + 
         "Unicode\u0021");
      portugueseJLabel.setToolTipText("This is Portuguese");
      add(portugueseJLabel);
      
      JLabel spanishJLabel = new JLabel("\u0042\u0069\u0065\u006E" +
         "\u0076\u0065\u006E\u0069\u0064\u0061\u0020\u0061\u0020" +
         "Unicode\u0021");
      spanishJLabel.setToolTipText("This is Spanish");
      add(spanishJLabel);
   } // end UnicodeJFrame constructor
} // end class UnicodeJFrame




/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
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
 