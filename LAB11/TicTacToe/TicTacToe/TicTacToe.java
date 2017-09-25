import javax.swing.JFrame;

/**
 * main method for the game of Tic Tac Toe.
 * 
 * @author dlb, SCE, Carleton University
 * @version April 4, 2012
 */
public class TicTacToe
{
   /**
    * Creates and displays the main program frame.
    */
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Tic Tac Toe");
      TicTacToePanel panel = new TicTacToePanel();
      
      frame.getContentPane().add(panel);      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}
