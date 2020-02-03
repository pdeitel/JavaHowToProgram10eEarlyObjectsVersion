// Fig. 21.13: Queue.java
// Queue uses class List.
package com.deitel.datastructures;

public class Queue<T> 
{
   private List<T> queueList;

   // constructor
   public Queue() 
   { 
      queueList = new List<T>("queue"); 
   } 

   // add object to queue
   public void enqueue(T object)
   { 
      queueList.insertAtBack(object); 
   }

   // remove object from queue
   public T dequeue() throws EmptyListException
   { 
      return queueList.removeFromFront(); 
   }

   // determine if queue is empty
   public boolean isEmpty()
   {
      return queueList.isEmpty();
   }

   // output queue contents
   public void print()
   {
      queueList.print();
   }
} // end class Queue


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
