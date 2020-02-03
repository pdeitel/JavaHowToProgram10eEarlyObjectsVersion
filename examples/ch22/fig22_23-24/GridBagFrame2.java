// Fig. 22.23: GridBagFrame2.java
// Demonstrating GridBagLayout constants.
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;

public class GridBagFrame2 extends JFrame 
{ 
   private final GridBagLayout layout; // layout of this frame
   private final GridBagConstraints constraints; // layout's constraints
    
   // set up GUI
   public GridBagFrame2()
   {
      super("GridBagLayout");
      layout = new GridBagLayout();
      setLayout(layout);
      constraints = new GridBagConstraints(); // instantiate constraints

      // create GUI components
      String[] metals = {"Copper", "Aluminum", "Silver"};
      JComboBox<String> comboBox = new JComboBox<String>(metals);

      JTextField textField = new JTextField("TextField");

      String[] fonts = {"Serif", "Monospaced"};
      JList list = new JList(fonts);

      String[] names = {"zero", "one", "two", "three", "four"};
      JButton[] buttons = new JButton[names.length];

      for (int count = 0; count < buttons.length; count++)
         buttons[count] = new JButton(names[count]);

      // define GUI component constraints for textField
      constraints.weightx = 1;
      constraints.weighty = 1;  
      constraints.fill = GridBagConstraints.BOTH;
      constraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent(textField);

      // buttons[0] -- weightx and weighty are 1: fill is BOTH
      constraints.gridwidth = 1;
      addComponent(buttons[0]);

      // buttons[1] -- weightx and weighty are 1: fill is BOTH
      constraints.gridwidth = GridBagConstraints.RELATIVE;
      addComponent(buttons[1]);

      // buttons[2] -- weightx and weighty are 1: fill is BOTH
      constraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent(buttons[2]);

      // comboBox -- weightx is 1: fill is BOTH
      constraints.weighty = 0;
      constraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent(comboBox);
      
      // buttons[3] -- weightx is 1: fill is BOTH
      constraints.weighty = 1;
      constraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent(buttons[3]); 

      // buttons[4] -- weightx and weighty are 1: fill is BOTH
      constraints.gridwidth = GridBagConstraints.RELATIVE;
      addComponent(buttons[4]);

      // list -- weightx and weighty are 1: fill is BOTH
      constraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent(list);
   } // end GridBagFrame2 constructor

   // add a component to the container
   private void addComponent(Component component) 
   {
      layout.setConstraints(component, constraints);
      add(component); // add component
   } 
} // end class GridBagFrame2

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
