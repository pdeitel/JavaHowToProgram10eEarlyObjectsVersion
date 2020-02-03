// Fig. 22.11: DesktopFrame.java
// Demonstrating JDesktopPane.
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.security.SecureRandom;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class DesktopFrame extends JFrame 
{
   private final JDesktopPane theDesktop;

   // set up GUI
   public DesktopFrame()
   {
      super("Using a JDesktopPane");

      JMenuBar bar = new JMenuBar(); 
      JMenu addMenu = new JMenu("Add"); 
      JMenuItem newFrame = new JMenuItem("Internal Frame");

      addMenu.add(newFrame); // add new frame item to Add menu
      bar.add(addMenu); // add Add menu to menu bar
      setJMenuBar(bar); // set menu bar for this application

      theDesktop = new JDesktopPane(); 
      add(theDesktop); // add desktop pane to frame
    
      // set up listener for newFrame menu item
      newFrame.addActionListener(
         new ActionListener() // anonymous inner class
         {  
            // display new internal window
            @Override
            public void actionPerformed(ActionEvent event) 
            {
               // create internal frame
               JInternalFrame frame = new JInternalFrame(
                  "Internal Frame", true, true, true, true);

               MyJPanel panel = new MyJPanel();
               frame.add(panel, BorderLayout.CENTER);
               frame.pack(); // set internal frame to size of contents

               theDesktop.add(frame); // attach internal frame
               frame.setVisible(true); // show internal frame
            } 
         } 
      ); 
   } // end constructor DesktopFrame
} // end class DesktopFrame

// class to display an ImageIcon on a panel
class MyJPanel extends JPanel 
{
   private static final SecureRandom generator = new SecureRandom();
   private final ImageIcon picture; // image to be displayed
   private static final String[] images = {"yellowflowers.png", 
      "purpleflowers.png", "redflowers.png", "redflowers2.png", 
      "lavenderflowers.png"};

   // load image
   public MyJPanel()
   {
      int randomNumber = generator.nextInt(images.length);
      picture = new ImageIcon(images[randomNumber]); // set icon
   }

   // display imageIcon on panel
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      picture.paintIcon(this, g, 0, 0); // display icon
   }

   // return image dimensions
   public Dimension getPreferredSize()
   {
      return new Dimension(picture.getIconWidth(), 
         picture.getIconHeight());  
   }
} // end class MyJPanel

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
