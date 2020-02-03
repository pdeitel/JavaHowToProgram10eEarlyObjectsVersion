// Fig. E.1: AccountTest.java
// Create and manipulate an Account object.

public class AccountTest
{
   // main method begins execution
   public static void main(String[] args) 
   {
      Account account = new Account("Jane Green", 50.00); 

      // display initial balance of Account object
      System.out.printf("initial account balance: $%.2f%n", 
         account.getBalance());
      
      double depositAmount = 25.0; // deposit amount
      
      System.out.printf("%nadding %.2f to account balance%n%n", 
         depositAmount);
      account.deposit(depositAmount); // add to account balance

      // display new balance
      System.out.printf("new account balance: $%.2f%n", 
         account.getBalance());
   } // end main
} // end class AccountTest

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
