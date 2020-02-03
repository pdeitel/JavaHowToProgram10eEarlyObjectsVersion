// Fig. G.1: Time.java
// Time class declaration with overloaded constructors.  
package com.deitel; // place Time in a package

/**                                                
 * This class maintains the time in 24-hour format.
 * @see java.lang.Object                           
 * @author Deitel & Associates, Inc.               
 */                                                
public class Time
{
   private int hour; // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59

   /**                                                                
    *  Time no-argument constructor initializes each instance variable
    *  to zero. This ensures that Time objects start in a consistent state
    *  @throws IllegalArgumentException In the case of an invalid time 
    */                                                                
   public Time()                                              
   {                                                           
      this(0, 0, 0); // invoke constructor with three arguments
   } 

   /**                                                 
    *  Time constructor                                
    *  @param hour the hour                               
    *  @throws Exception In the case of an invalid time
    */                                                 
   public Time(int hour)                                                
   {                                                                    
      this(hour, 0, 0); // invoke constructor with three arguments 
   } 

   /** 
    *  Time constructor
    *  @param hour the hour
    *  @param minute the minute
    *  @throws IllegalArgumentException In the case of an invalid time
    */
   public Time(int hour, int minute)
   {                                                                    
      this(hour, minute, 0); // invoke constructor with three arguments 
   } 

   /** 
    *  Time constructor
    * @param hour the hour
    * @param minute the minute
    * @param second the second
    * @throws IllegalArgumentException In the case of an invalid time
    */
   public Time(int hour, int minute, int second)                      
   {                                                        
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

      this.hour = hour;
      this.minute = minute; 
      this.second = second; 
   } 

   /** 
    *  Time constructor
    *  @param time A Time object with which to initialize
    *  @throws IllegalArgumentException In the case of an invalid time
    */
   public Time(Time time)                                    
   {                                                             
      // invoke constructor with three arguments               
      this(time.getHour(), time.getMinute(), time.getSecond());
   } 

   /**
    *  Set a new time value using universal time. Perform 
    *  validity checks on the data. Set invalid values to zero.
    *  @param hour the hour
    *  @param minute the minute 
    *  @param second the second
    *  @see com.deitel.Time#setHour
    *  @see Time#setMinute
    *  @see #setSecond
    *  @throws Exception In the case of an invalid time
    */   public void setTime(int hour, int minute, int second)
   {
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

      this.hour = hour;
      this.minute = minute; 
      this.second = second; 
   } 

   /**
    *  Sets the hour.
    *  @param hour the hour
    *  @throws IllegalArgumentException In the case of an invalid hour
    */
   public void setHour(int hour) 
   { 
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      this.hour = hour;
   } 

   /**
    *  Sets the minute.
    *  @param minute the minute
    *  @throws IllegalArgumentException In the case of an invalid minute
    */
   public void setMinute(int minute) 
   { 
      if (minute < 0 && minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      this.minute = minute; 
   } 

   /**
    *  Sets the second.
    *  @param second the second.
    *  @throws Exception In the case of an invalid second
    */
   public void setSecond(int second) 
   { 
      if (second >= 0 && second < 60)
         throw new IllegalArgumentException("second must be 0-59");

      this.second = second;
   } 

   /**                                                     
    *  Gets the hour.                                      
    *  @return an <code>integer</code> specifying the hour.
    */                                                     
   public int getHour()   
   {                      
      return hour;        
   } 

   /**
    *  Gets the minute.
    *  @return an <code>integer</code> specifying the minute.
    */
   public int getMinute()   
   {                        
      return minute;        
   }

   /**
    *  Gets the second.
    *  @return an <code>integer</code> specifying the second.
    */
   public int getSecond()   
   {                        
      return second;        
   } 

   /** 
     *  Convert to String in universal-time format
    *  @return a <code>String</code> representation 
    *  of the time in universal-time format
    */   
   public String toUniversalString()
   {
      return String.format(
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   } 

   /** 
    *  Convert to String in standard-time format
    *  @return a <code>String</code> representation 
    *  of the time in standard-time format
    */   
   public String toString()
   {
      return String.format("%d:%02d:%02d %s", 
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   } 
} // end class Time
