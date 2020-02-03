// Fig. 20.13: TotalNumbersErrors.java
// Summing the elements of an ArrayList.
import java.util.ArrayList;

public class TotalNumbersErrors
{
   public static void main(String[] args) 
   {
      // create, initialize and output ArrayList of Integers 
      // then display total of the elements 
      Integer[] integers = {1, 2, 3, 4}; 
      ArrayList<Integer> integerList = new ArrayList<>();

      for (Integer element : integers) 
         integerList.add(element); // place each number in integerList

      System.out.printf("integerList contains: %s%n", integerList);
      System.out.printf("Total of the elements in integerList: %.1f%n", 
         sum(integerList));
   }

   // calculate total of ArrayList elements
   public static double sum(ArrayList<Number> list)
   {
      double total = 0; // initialize total

      // calculate sum
      for (Number element : list)
         total += element.doubleValue();

      return total;
   } 
} // end class TotalNumbersErrors

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