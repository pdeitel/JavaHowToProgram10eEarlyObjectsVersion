// Fig. 20.7: Stack.java
// Stack generic class declaration.
import java.util.ArrayList;

public class Stack<T>  
{
   private final ArrayList<T> elements; // ArrayList stores stack elements

   // no-argument constructor creates a stack of the default size
   public Stack()
   {
      this(10); // default stack size
   } 

   // constructor creates a stack of the specified number of elements
   public Stack(int capacity)
   {
      int initCapacity = capacity > 0 ? capacity : 10; // validate
      elements = new ArrayList<T>(initCapacity); // create ArrayList
   }

   // push element onto stack
   public void push(T pushValue)
   {
      elements.add(pushValue); // place pushValue on Stack
   } 

   // return the top element if not empty; else throw EmptyStackException
   public T pop()
   {
      if (elements.isEmpty()) // if stack is empty
         throw new EmptyStackException("Stack is empty, cannot pop");

      // remove and return top element of Stack
      return elements.remove(elements.size() - 1); 
   }
} // end class Stack<T>

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