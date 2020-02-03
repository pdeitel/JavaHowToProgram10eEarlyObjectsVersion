// Fig. 22.3: SliderFrame.java
// Using JSliders to size an oval.
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SliderFrame extends JFrame 
{
   private final JSlider diameterJSlider; // slider to select diameter
   private final OvalPanel myPanel; // panel to draw circle

   // no-argument constructor
   public SliderFrame() 
   {
      super("Slider Demo");

      myPanel = new OvalPanel(); // create panel to draw circle
      myPanel.setBackground(Color.YELLOW); 

      // set up JSlider to control diameter value
      diameterJSlider = 
         new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
      diameterJSlider.setMajorTickSpacing(10); // create tick every 10
      diameterJSlider.setPaintTicks(true); // paint ticks on slider

      // register JSlider event listener
      diameterJSlider.addChangeListener(
         new ChangeListener() // anonymous inner class
         {  
            // handle change in slider value
            @Override
            public void stateChanged(ChangeEvent e)
            {
               myPanel.setDiameter(diameterJSlider.getValue());
            } 
         } 
      ); 

      add(diameterJSlider, BorderLayout.SOUTH); 
      add(myPanel, BorderLayout.CENTER); 
   } 
} // end class SliderFrame

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