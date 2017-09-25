import java.awt.event.*;
/**
 * Write a description of class ClearButtonListener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClearButtonListener implements ActionListener
{
    // instance variables - replace the example below with your own
    private PhonePanel panel;

    /**
     * Constructor for objects of class ClearButtonListener
     */
    public ClearButtonListener(PhonePanel panel)
    {
        // initialise instance variables
        this.panel=panel;
    }
    public void actionPerformed(ActionEvent event){
        panel.clear();
    
    }
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}
