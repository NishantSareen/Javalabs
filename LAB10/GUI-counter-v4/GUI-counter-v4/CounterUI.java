/*
 * SYSC 2004 - Introduction to Constructing Programs with Graphical User Interfaces.
 * 
 * The GUI for this program consists of a button and a label, which are placed in a panel. The panel
 * is placed in a frame (a window with a title bar and buttons to minimize and maximize the window and
 * close the program).
 * 
 * Revised: March 18, 2015
 */

import javax.swing.JFrame;

/**
 * Creates the user interface and makes it visible.
 */
public class CounterUI
{
   public static void main(String[] args)
   {
      /* First, we create instance of class JFrame. The title bar will display "Counter". */
      JFrame frame = new JFrame("Counter");

      /* Next, we create a CounterPanel object. The constructor will populate the panel with
       * the UI's button and label.
       */ 
      CounterPanel panel = new CounterPanel();

      /* Place the panel in the frame's content pane. */
      frame.getContentPane().add(panel);
      
      /* We have to specify that we want the program to terminate (exit) when we close the frame 
       * (e.g., click the Close button in the upper-right corner).
       */
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      /* Calculate the size of the frame, based on the preferred size and layout of the
       * GUI components.
       */
      frame.pack();
      
      /* Make the frame visible. */
      frame.setVisible(true);
      
      /* main will now exit, but the program doesn't terminate. Instead, the event dispatching
       * thread will repeatedly obtain an event (mouse movements and clicks, key presses) from the 
       * operating system and forward them to the component where the event occurred. For this 
       * program, the only events that will be handled are the mouse clicks on the button.
       */ 
   }
}
