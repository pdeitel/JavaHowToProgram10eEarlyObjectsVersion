// Fig. I.9: DateTimeTest.java
// Formatting dates and times with conversion characters t and T.
import java.util.Calendar;

public class DateTimeTest
{
   public static void main(String[] args) 
   {
      // get current date and time
      Calendar dateTime = Calendar.getInstance();

      // printing with conversion characters for date/time compositions
      System.out.printf("%tc\n", dateTime);
      System.out.printf("%tF\n", dateTime);
      System.out.printf("%tD\n", dateTime);
      System.out.printf("%tr\n", dateTime);
      System.out.printf("%tT\n", dateTime);

      // printing with conversion characters for date
      System.out.printf("%1$tA, %1$tB %1$td, %1$tY\n", dateTime);
      System.out.printf("%1$TA, %1$TB %1$Td, %1$TY\n", dateTime);
      System.out.printf("%1$ta, %1$tb %1$te, %1$ty\n", dateTime);

      // printing with conversion characters for time
      System.out.printf("%1$tH:%1$tM:%1$tS\n", dateTime);
      System.out.printf("%1$tZ %1$tI:%1$tM:%1$tS %Tp", dateTime);
   } // end main
} // end class DateTimeTest

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
