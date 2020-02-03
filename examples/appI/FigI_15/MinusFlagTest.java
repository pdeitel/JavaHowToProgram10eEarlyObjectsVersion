// Fig 29.15: MinusFlagTest.java
// Right justifying and left justifying values 

public class MinusFlagTest 
{
   public static void main(String[] args)
   { 
      System.out.println("Columns:");
      System.out.println("0123456789012345678901234567890123456789\n");
      System.out.printf("%10s%10d%10c%10f\n\n", "hello", 7, 'a', 1.23);
      System.out.printf(
         "%-10s%-10d%-10c%-10f\n", "hello", 7, 'a', 1.23);
   } // end main 
} // end class MinusFlagTest

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
