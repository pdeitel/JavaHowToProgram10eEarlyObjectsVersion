// Fig. 22.9: LookAndFeelFrame.java
// Changing the look-and-feel.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class LookAndFeelFrame extends JFrame 
{
   private final UIManager.LookAndFeelInfo[] looks; 
   private final String[] lookNames; // look-and-feel names
   private final JRadioButton[] radio; // for selecting look-and-feel
   private final ButtonGroup group; // group for radio buttons
   private final JButton button; // displays look of button
   private final JLabel label; // displays look of label
   private final JComboBox<String> comboBox; // displays look of combo box

   // set up GUI
   public LookAndFeelFrame()
   {
      super("Look and Feel Demo");

      // get installed look-and-feel information
      looks = UIManager.getInstalledLookAndFeels();
      lookNames = new String[looks.length];

      // get names of installed look-and-feels
      for (int i = 0; i < looks.length; i++)
         lookNames[i] = looks[i].getName();

      JPanel northPanel = new JPanel(); 
      northPanel.setLayout(new GridLayout(3, 1, 0, 5));

      label = new JLabel("This is a " + lookNames[0] + " look-and-feel",
         SwingConstants.CENTER); 
      northPanel.add(label); 

      button = new JButton("JButton");
      northPanel.add(button);

      comboBox = new JComboBox<String>(lookNames); 
      northPanel.add(comboBox);
     
      // create array for radio buttons
      radio = new JRadioButton[looks.length];

      JPanel southPanel = new JPanel(); 

      // use a GridLayout with 3 buttons in each row
      int rows = (int) Math.ceil(radio.length / 3.0);
      southPanel.setLayout(new GridLayout(rows, 3));

      group = new ButtonGroup(); // button group for look-and-feels
      ItemHandler handler = new ItemHandler(); // look-and-feel handler

      for (int count = 0; count < radio.length; count++) 
      {
         radio[count] = new JRadioButton(lookNames[count]);
         radio[count].addItemListener(handler); // add handler
         group.add(radio[count]); // add radio button to group
         southPanel.add(radio[count]); // add radio button to panel
      } 

      add(northPanel, BorderLayout.NORTH); // add north panel
      add(southPanel, BorderLayout.SOUTH); // add south panel

      radio[0].setSelected(true); // set default selection
   } // end LookAndFeelFrame constructor

   // use UIManager to change look-and-feel of GUI
   private void changeTheLookAndFeel(int value)
   {
      try // change look-and-feel
      {
         // set look-and-feel for this application
         UIManager.setLookAndFeel(looks[value].getClassName());

         // update components in this application
         SwingUtilities.updateComponentTreeUI(this);
      } 
      catch (Exception exception) 
      {
         exception.printStackTrace();
      }
   }

   // private inner class to handle radio button events
   private class ItemHandler implements ItemListener 
   {
      // process user's look-and-feel selection
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         for (int count = 0; count < radio.length; count++)
         {
            if (radio[count].isSelected()) 
            {
               label.setText(String.format(
                   "This is a %s look-and-feel", lookNames[count]));
               comboBox.setSelectedIndex(count); // set combobox index
               changeTheLookAndFeel(count); // change look-and-feel
            }
         } 
      } 
   } // end private inner class ItemHandler
} // end class LookAndFeelFrame



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
