import javax.swing.JFrame;

/**
 * SYSC 2004 Winter 2015 Lab 11
 * A mockup of the GUI for a telephone.
 * Nishant Sareen # 100940624
 * @version (april 2nd 2015)
 */
public class PhoneGUI
{
   /**
    * Creates and displays the main program frame.
    */
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Telephone");
      PhonePanel panel = new PhonePanel();
      
      frame.getContentPane().add(panel);      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}
