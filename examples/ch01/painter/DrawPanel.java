// GCS Exercise 14.17 Solution: DrawPanel.java
// JPanel that allows the user to draw shapes with the mouse. 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   private MyShape[] shapes; // array containing all the shapes
   private int shapeCount; // total number of shapes

   private int shapeType; // the type of shape to draw
   private MyShape currentShape; // the current shape being drawn
   private Color currentColor; // the color of the shape
   private boolean filledShape; // whether this shape is filled
   
   private JLabel statusLabel; // label displaying mouse coordinates
   
   // constructor
   public DrawPanel(JLabel status)
   {
      shapes = new MyShape[100]; // create the array
      shapeCount = 0; // initially we have no shapes
      
      setShapeType(0); // initially draw lines
      setDrawingColor(Color.BLACK); // start drawing with black
      setFilledShape(false);// not filled by default
      currentShape = null; // not drawing anything initially
            
      setBackground(Color.WHITE); // set a white background
      
      // add the mouse listeners
      MouseHandler mouseHandler = new MouseHandler();
      addMouseListener(mouseHandler);
      addMouseMotionListener(mouseHandler);
      
      // set the status label for displaying mouse coordinates
      statusLabel = status;
   } // end DrawPanel constructor

   // draw shapes using polymorphism
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      for (int i = 0; i < shapeCount; i++)
         shapes[i].draw(g);
      
      if (currentShape != null)
         currentShape.draw(g);
   } // end method paintComponent

   // sets the type of shape to draw
   public void setShapeType(int shapeType)
   {
      if (shapeType < 0 || shapeType > 2)
         shapeType = 0;
      
      this.shapeType = shapeType;
   } // end method setShapeType
   
   // sets the drawing color
   public void setDrawingColor(Color c)
   {
      currentColor = c;
   } // end method setDrawingColor
   
   // clears the last shape drawn
   public void clearLastShape()
   {
      if (shapeCount > 0)
      {
         shapeCount--;
         repaint();
      } // end if
   } // end method clearLastShape
   
   // clears all drawings on this panel
   public void clearDrawing()
   {
      shapeCount = 0;
      repaint();
   } // end method clearDrawing

   // sets whether to draw a filled shape
   public void setFilledShape(boolean isFilled)
   {
      filledShape = isFilled;
   } // end method setFilledShape

   // handles mouse events for this JPanel
   private class MouseHandler extends MouseAdapter
      implements MouseMotionListener
   {
      // creates and sets the initial position for the new shape
      public void mousePressed(MouseEvent e)
      {
         if (currentShape != null)
            return;

         // create the appropriate shape based on shapeType
         switch (shapeType)
         {
            case 0:
               currentShape = new MyLine(e.getX(), e.getY(),
                  e.getX(), e.getY(), currentColor);      
               break;
            case 1:
               currentShape = new MyOval(e.getX(), e.getY(),
                  e.getX(), e.getY(), currentColor, filledShape);      
               break;
            case 2:
               currentShape = new MyRect(e.getX(), e.getY(),
                  e.getX(), e.getY(), currentColor, filledShape);      
               break;
         } // end switch
      } // end method mousePressed

      // fixes the current shape onto the panel
      public void mouseReleased(MouseEvent e)
      {
         if (currentShape == null)
            return;
         
         // set the second point on the shape
         currentShape.setX2(e.getX());
         currentShape.setY2(e.getY());
         
         // set the shape only if there is room in the array
         if (shapeCount < shapes.length)
         {
            shapes[shapeCount] = currentShape;
            shapeCount++;
         } // end if
         
         currentShape = null; // clear the temporary drawing shape     
         repaint();
      } // end method mouseReleased

      // update the shape to the current mouse position while dragging
      public void mouseDragged(MouseEvent e)
      {
         if (currentShape != null)
         {
            currentShape.setX2(e.getX());
            currentShape.setY2(e.getY());
            repaint();
         } // end if

         mouseMoved(e); // update status bar
      } // end method mouseDragged

      // updates the status bar to show the current mouse coordinates
      public void mouseMoved(MouseEvent e)
      {
         statusLabel.setText(
            String.format("(%d,%d)", e.getX(), e.getY()));
      } // end method mouseMoved
   } // end class MouseHandler
} // end class DrawPanel


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
 **************************************************************************/
