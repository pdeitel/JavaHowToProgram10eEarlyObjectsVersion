// Fig. 15.10: CreateSequentialFile.java
// Writing objects sequentially to a file with class ObjectOutputStream.
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequentialFile
{
   private static ObjectOutputStream output; // outputs data to file

   public static void main(String[] args)
   {
      openFile();
      addRecords();
      closeFile();
   }

   // open file clients.ser
   public static void openFile()
   {
      try 
      {
         output = new ObjectOutputStream(
            Files.newOutputStream(Paths.get("clients.ser")));
      }
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1); // terminate the program
      } 
   } 

   // add records to file
   public static void addRecords()
   {
      Scanner input = new Scanner(System.in);

      System.out.printf("%s%n%s%n? ", 
         "Enter account number, first name, last name and balance.",
         "Enter end-of-file indicator to end input.");

      while (input.hasNext()) // loop until end-of-file indicator
      {
         try 
         {
            // create new record; this example assumes valid input
            Account record = new Account(input.nextInt(),
               input.next(), input.next(), input.nextDouble());

            // serialize record object into file
            output.writeObject(record); 
         } 
         catch (NoSuchElementException elementException)
         {
            System.err.println("Invalid input. Please try again.");
            input.nextLine(); // discard input so user can try again 
         } 
         catch (IOException ioException)
         {
            System.err.println("Error writing to file. Terminating.");
            break;
         } 

         System.out.print("? ");
      }
   } 

   // close file and terminate application 
   public static void closeFile() 
   {
      try 
      {
         if (output != null)
            output.close();
      } 
      catch (IOException ioException)
      {
         System.err.println("Error closing file. Terminating.");
      } 
   } 
} // end class CreateSequentialFile

/*************************************************************************
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