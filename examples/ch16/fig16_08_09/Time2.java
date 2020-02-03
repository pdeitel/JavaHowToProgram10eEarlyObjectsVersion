// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.  

public class Time2
{
   private int hour; // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59

   // Time2 no-argument constructor: 
   // initializes each instance variable to zero
   public Time2()
   {
      this(0, 0, 0); // invoke Time2 constructor with three arguments
   } // end Time2 no-argument constructor

   // Time2 constructor: hour supplied, minute and second defaulted to 0
   public Time2(int h) 
   { 
      this(h, 0, 0); // invoke Time2 constructor with three arguments
   } // end Time2 one-argument constructor

   // Time2 constructor: hour and minute supplied, second defaulted to 0
   public Time2(int h, int m) 
   { 
      this(h, m, 0); // invoke Time2 constructor with three arguments
   } // end Time2 two-argument constructor 

   // Time2 constructor: hour, minute and second supplied
   public Time2(int h, int m, int s) 
   { 
      setTime(h, m, s); // invoke setTime to validate time
   } // end Time2 three-argument constructor 

   // Time2 constructor: another Time2 object supplied
   public Time2(Time2 time)
   {
      // invoke Time2 three-argument constructor
      this(time.getHour(), time.getMinute(), time.getSecond());
   } // end Time2 constructor with a Time2 object argument

   // Set Methods
   // set a new time value using universal time; 
   // validate the data
   public void setTime(int h, int m, int s)
   {
      setHour(h); // set the hour
      setMinute(m); // set the minute
      setSecond(s); // set the second
   } // end method setTime

   // validate and set hour 
   public void setHour(int h) 
   { 
      if (h >= 0 && h < 24)
         hour = h;
      else
         throw new IllegalArgumentException("hour must be 0-23");
   } // end method setHour

   // validate and set minute 
   public void setMinute(int m) 
   { 
      if (m >= 0 && m < 60)
         minute = m; 
      else
         throw new IllegalArgumentException("minute must be 0-59");
   } // end method setMinute

   // validate and set second 
   public void setSecond(int s) 
   { 
      if (s >= 0 && s < 60)
         second = ((s >= 0 && s < 60) ? s : 0); 
      else
         throw new IllegalArgumentException("second must be 0-59");
   } // end method setSecond

   // Get Methods
   // get hour value
   public int getHour() 
   { 
      return hour; 
   } // end method getHour

   // get minute value
   public int getMinute() 
   { 
      return minute; 
   } // end method getMinute

   // get second value
   public int getSecond() 
   { 
      return second; 
   } // end method getSecond

   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString()
   {
      return String.format(
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   } // end method toUniversalString

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format("%d:%02d:%02d %s", 
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   } // end method toString
} // end class Time2

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
