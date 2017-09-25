import java.awt.event.*;
import javax.swing.*;

/**
 * The listener for the buttons in the TicTacToe GUI.
 * 
 * @author dlb, SCE, Carleton University
 * @version April 4, 2012
 */
public class ButtonListener implements ActionListener
{ 
    private TicTacToeModel model;
    
    /**
     * The listener stores a reference to the game's model.
     */
    public ButtonListener(TicTacToeModel model)
    {
        this.model = model;
    }
   
    /**
     * Called when a player clicks a button to mark a square with
     * an "X" or an "O". Updates the model and the GUI.
     */
    public void actionPerformed(ActionEvent event)
    {
        /* Get a reference to the button that was clicked. */ 
        JButton button = (JButton) event.getSource();
        
        /* Get the button's (row, column) location in the grid,
         * which is stored in the button's command string.
         */    
        String command = event.getActionCommand();
        /* We could also get the command string by calling
         * getActionCommand on the JButton; e.g.,
         * String command = button.getActionCommand();
         */
        
        int row = Integer.parseInt(command.substring(0, 1));
        int col = Integer.parseInt(command.substring(1, 2));        
        model.markSquare(row, col);
        
        /* Update the GUI with the player's mark, "X" or "O". */
        button.setText("" + model.getPlayer());
        
        /* Disable the button so it can't be clicked again. */
        button.setEnabled(false);
        
        /* Tell the model that it's the next player's turn. */
        model.nextPlayer();
    }
}
