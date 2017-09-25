import java.awt.event.*;

/**
 * The listener for the button in the counter UI.
 * 
 * Revised: March 18, 2015
 */
public class ButtonListener implements ActionListener
{
   private CounterPanel panel;
   private Counter counter;
   
   /**
    * The listener stores references to the counter and its user
    * interface panel,so that it can call methods on both objects.
    */
   public ButtonListener(CounterPanel panel, Counter counter)
   {
      this.panel = panel;
      this.counter = counter;
   }
   
   /**
    * The ActionListener interface declares one abstract method: actionPerformed. Because 
    * ButtonListener implements ActionListener, it must provide a concrete implementation of 
    * actionPerformed.
    * 
    * After the ButtonListener object is registered as a listener for the button, the 
    * actionPerformed method will be called by the button when it is clicked 
    * (see the comments in class CounterPanel). 
    */
   public void actionPerformed(ActionEvent event)
   {
       /* Increment the counter, then tell the panel to update the UI to reflect the new state 
        * of the counter.
        */
      counter.countUp();
      panel.refreshUI();
   }
}