import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * A panel containing a digital clock display ("hh : mm") and a 
 * button to increment the time by one minute each time it is pushed.
 */
public class ClockPanel extends JPanel
{
   private RollOverCounter minutes;
   private RollOverCounter hours;
   
   private JLabel hoursDisplay;
   private JLabel minutesDisplay;
   private JLabel colon;
   private JButton tickButton;
   private JButton resetButton;

   /**
    * Initializes the user interface.
    */
   public ClockPanel()
   {
      tickButton = new JButton("Tick"); 
      resetButton=new JButton("RESET");
      hoursDisplay = new JLabel("  ");
      minutesDisplay = new JLabel("  ");
      colon = new JLabel(":");
      hours = new RollOverCounter(0, 2, null);
      minutes = new RollOverCounter(0, 5, hours); 
      TickButtonListener listener=new TickButtonListener(this,minutes);
      ResetButtonListener resetlistener=new ResetButtonListener(this,minutes);
   
      /* Place the button and the labels in the panel. */
      add(tickButton);
      add(resetButton);
      add(hoursDisplay);
      add(colon);
      add(minutesDisplay);
      tickButton.addActionListener(listener);
      resetButton.addActionListener(resetlistener);

      // setBackground (Color.cyan);
      setBackground(Color.cyan);
      
      setPreferredSize (new Dimension(350, 60));
      
      /* Create the model (a counter that keeps track of minutes, which is chained
       * to a counter that keeps track of hours).
       */      

      
      /* Display the current time. */    
      hoursDisplay.setText("" + hours.toString());
      minutesDisplay.setText("" + minutes.toString());        
   }
   
   /**
    * Updates the user interface to show the current time.
    */
   public void refreshUI()
   {
       
      hoursDisplay.setText("" + hours.toString());
      minutesDisplay.setText("" + minutes.toString()); 
       
       
   }      
}
