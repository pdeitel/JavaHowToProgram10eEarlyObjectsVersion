// Fig 29.13: PrecisionTest.java
// Using precision for floating-point numbers and strings.
public class PrecisionTest 
{
   public static void main(String[] args)
   { 
      double f = 123.94536; 
      String s = "Happy Birthday"; 

      System.out.printf("Using precision for floating-point numbers\n");
      System.out.printf("\t%.3f\n\t%.3e\n\t%.3g\n\n", f, f, f);  
   
      System.out.printf("Using precision for strings\n");
      System.out.printf("\t%.11s\n", s);
   } // end main 
} // end class PrecisionTest


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
