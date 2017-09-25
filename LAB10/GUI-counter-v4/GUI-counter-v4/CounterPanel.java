import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * A panel containing a button to increment a counter each time it is 
 * pushed, and a label that displays the current count.
 * 
 * Revised: March 18, 2015
 */
public class CounterPanel extends JPanel
{
   private Counter counter;
   private JLabel label;
   private JButton button;

   /**
    * Initializes the user interface.
    */
   public CounterPanel()
   {
      counter = new Counter();

      /* Classes JLabel and JButton are provided in Java's Swing GUI library. */
      /* Create a JLabel that displays "Count: " and the counter's current value. */
      label = new JLabel("Count: " + counter.getCount());
      
      /* Create a button containing the text, "Count Up". */
      button = new JButton("Count up");
      
      /* Place the button and the label in the panel. */
      add(button);
      add(label);

      /* Change the panel's background colour and set its preferred width and height. */
      setBackground (Color.cyan);
      setPreferredSize (new Dimension(350, 60));      

      /* When we click the button, we want the counter to increment. 
       * The JButton doesn't know about class Counter, so it can't call
       * the countUp method on the Counter object directly.
       * 
       * So, how do we sove the problem of "connecting" the JButton and 
       * Counter objects? The solution uses events and event listeners.
       * *
       * Every JButton object keeps a list of "listener objects" that
       * implement the ActionListener interface. When the button is clicked, 
       * the actionPerformed method is called on each of the listener objects. 
       * So, we have to define a class that implements the ActionListener 
       * interface; i.e., it defines an actionPerformed method that
       * collaborates with the Counter object. We also to have to register 
       * an instance of the listener class as the button's listener.
       * 
       * Behind the sceness, here's what happens. Class JButton inherits code 
       * that looks something like this:
       * 
       * private ArrayList<ActionListener> listeners = new ArrayList<ActionListener>();
       * 
       * public void addActionListener(ActionListener l)
       * {
       *     listeners.add(l);
       * }
       * 
       * To register an event listener with the JButton, we call addActionListener.
       * This method expects an argument of type ActionListener, so we pass it 
       * a reference to an object that implements the ActionListener interface.
       * 
       * The fireActionPerformed method is called by Java when the JButton is 
       * clicked. It calls the actionPerformed method on all of the button's listeners:
       * 
       * protected void void fireActionPerformed(ActionEvent event)
       * {
       *     for (ActionListener listener : listeners) {
       *         listener.actionPerformed(event);
       *     }
       * }
       */
      
      /* The listener for our button is an instance of class ButtonListener.
       * ButtonListener implements the ActionListener interface, which means that 
       * we can pass a reference to a ButtonListener object to addActionListener. 
       *
       * Now that the ButtonListener object is registered as a listener for the 
       * button, its actionPerformed method will be called when the button is clicked.
       */
      ButtonListener listener = new ButtonListener(this, counter);
      button.addActionListener(listener);
   }
   
   /**
    * Updates the user interface to show the current count.
    */
   public void refreshUI()
   {
      label.setText("Count: " + counter.getCount());
   }
}
