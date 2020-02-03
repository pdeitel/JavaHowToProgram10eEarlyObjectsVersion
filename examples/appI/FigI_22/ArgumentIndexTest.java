// Fig. I.22: ArgumentIndexTest
// Reordering output with argument indices.

public class ArgumentIndexTest 
{
   public static void main(String[] args) 
   {
      System.out.printf(
         "Parameter list without reordering: %s %s %s %s\n", 
         "first", "second", "third", "fourth");
      System.out.printf(
         "Parameter list after reordering: %4$s %3$s %2$s %1$s\n", 
         "first", "second", "third", "fourth");      
   } // end main
} // end class ArgumentIndexTest

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
