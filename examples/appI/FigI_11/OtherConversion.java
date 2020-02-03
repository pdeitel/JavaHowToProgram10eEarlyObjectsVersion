// Fig. I.11: OtherConversion.java
// Using the b, B, h, H, % and n conversion characters.

public class OtherConversion 
{
   public static void main(String[] args) 
   {
      Object test = null;
      System.out.printf("%b\n", false);
      System.out.printf("%b\n", true);
      System.out.printf("%b\n", "Test");
      System.out.printf("%B\n", test);
      System.out.printf("Hashcode of \"hello\" is %h\n", "hello");
      System.out.printf("Hashcode of \"Hello\" is %h\n", "Hello");
      System.out.printf("Hashcode of null is %H\n", test);
      System.out.printf("Printing a %% in a format string\n");
      System.out.printf("Printing a new line %nnext line starts here");
   } // end main
} // end class OtherConversion

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
