// Fig. 16.14: StackTest.java
// Stack class of package java.util.
import java.util.Stack;
import java.util.EmptyStackException;

public class StackTest 
{
   public static void main(String[] args)
   {
      Stack<Number> stack = new Stack<>(); // create a Stack

      // use push method
      stack.push(12L); // push long value 12L
      System.out.println("Pushed 12L");
      printStack(stack);
      stack.push(34567); // push int value 34567
      System.out.println("Pushed 34567");
      printStack(stack);
      stack.push(1.0F); // push float value 1.0F
      System.out.println("Pushed 1.0F");
      printStack(stack);
      stack.push(1234.5678); // push double value 1234.5678
      System.out.println("Pushed 1234.5678 ");
      printStack(stack);

      // remove items from stack
      try 
      {
         Number removedObject = null;

         // pop elements from stack
         while (true) 
         {
            removedObject = stack.pop(); // use pop method
            System.out.printf("Popped %s%n", removedObject);
            printStack(stack);
         } 
      } 
      catch (EmptyStackException emptyStackException) 
      {
         emptyStackException.printStackTrace();
      } 
   } 

   // display Stack contents
   private static void printStack(Stack<Number> stack)
   {
      if (stack.isEmpty())
         System.out.printf("stack is empty%n%n"); // the stack is empty
      else // stack is not empty
         System.out.printf("stack contains: %s (top)%n", stack);      
   } 
} // end class StackTest


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
