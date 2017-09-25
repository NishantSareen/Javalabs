import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * A panel containing the 3-by-3 grid of squares for the game of 
 * Tic Tac Toe. Each square contains a button, which is clicked by
 * a player when they want to mark that square with an "X" or an "O".
 * 
 * @author dlb, SCE, Carleton University
 * @version April 4, 2012
 */
public class TicTacToePanel extends JPanel
{
    /**
     * Initializes the user interface and creates the game's model.
     */
    public TicTacToePanel()
    {
        /* The listener for the square's buttons will
         * collaborate with the model.
         */
        TicTacToeModel model = new TicTacToeModel();
        ButtonListener listener = new ButtonListener(model);        
        
        /* Change the panel's layout manager to a 3-by-3 grid. */
        setLayout(new GridLayout(3, 3));
          
        /* Populate the panel with nine buttons. */
        for (int i = 0; i < 3; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                JButton b = new JButton(" ");
                
                /* All of the buttons will share the same listener. */
                b.addActionListener(listener);
                
                /* Each button has a command string, which stores the
                 * button's location in the grid as a two-digit string.
                 */
                b.setActionCommand("" + i + j);
                
                /* Place the button in the panel. */
                add(b);
            }
        }
        setPreferredSize(new Dimension(200, 200));
    }
}
