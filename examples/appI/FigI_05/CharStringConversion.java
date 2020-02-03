// Fig. I.5: CharStringConversion.java
// Using character and string conversion characters.
public class CharStringConversion 
{
   public static void main(String[] args)
   { 
      char character = 'A';  // initialize char
      String string = "This is also a string";  // String object
      Integer integer = 1234;  // initialize integer (autoboxing)

      System.out.printf("%c\n", character);
      System.out.printf("%s\n", "This is a string");
      System.out.printf("%s\n", string);
      System.out.printf("%S\n", string);
      System.out.printf("%s\n", integer); // implicit call to toString
   } // end main 
} // end class CharStringConversion


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
