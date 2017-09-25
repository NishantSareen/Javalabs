import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class PhonePanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhonePanel extends JPanel
{
    KeypadPanel keypanel;
    JLabel label;
    private JButton clear;

    /**
     * Constructor for objects of class PhonePanel
     */
    public PhonePanel()
    {
        // initialise instance variables
        keypanel= new KeypadPanel(this);
        setLayout(new BorderLayout());
        clear = new JButton("CLEAR");
        label= new JLabel(" ");
        add(label,BorderLayout.NORTH);
        add(keypanel,BorderLayout.CENTER);
        add(clear,BorderLayout.SOUTH);
        ClearButtonListener listener = new ClearButtonListener(this);
        clear.addActionListener(listener);
        
        
    }
    
    public void refreshUI(String text){
        String x=label.getText();
        label.setText(x+text);
        //label.updateUI();
    }
    
    public void clear(){
    label.setText(" ");
    }

    
}
