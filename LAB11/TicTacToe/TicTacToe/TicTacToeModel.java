/**
 * TicTacToeModel stores the state of a game of tic-tac-toe.
 * 
 * @author dlb, SCE, Carleton University
 * @version April 4, 2012
 */
public class TicTacToeModel
{
    /** The player whose turn it is, 'X' or 'O'. */
    private char player;
    
    private char[][] squares;    
    private static char EMPTY = ' ';

    /**
     * Initializes a new game of Tic-Tac-Toe.
     * The first person to make move will be player X.
     */
    public TicTacToeModel()
    {
        player = 'X';
        squares = new char[3][3];
        for (int i = 0; i < squares.length; i += 1) {
            for (int j = 0; j < squares[i].length; j += 1) {
                squares[i][j] = EMPTY;
            }
        }
    }
    
    /**
     * Returns a character indicating which player's turn it is,
     * 'X' or 'O'.
     */
    public char getPlayer()
    {
        return player;
    }    

    /**
     * Changes the player whose turn it is from player X to player O 
     * or from player O to player X.
     */
    public void nextPlayer()
    {
        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
    }
    
    /**
     * Determines the current state of game.
     * 
     * @return 'X' if the game is over and was won by player X,
     *         'O' if the game is over and was won by player O,
     *         'D' if the game is over and ended in a draw,
     *         'I' if the game is in progress (not yet over).
     */
    public char getGameState()
    {
        return 'I';
    }
    
    /**
     * Marks the specified square with an X or an O,
     * depending on which player's turn it is.
     */
    public void markSquare(int row, int col)
    {
        squares[row][col] = player;
        
        /* A couple of printlns so that we can verify that the
         * state of the squares matches what is displayed on the GUI.
         */ 
        System.out.println("Marking (" + row + ", " + col + 
                           ") with an " + player);        
        System.out.println(this);                   
     }
     
     /**
      * Returns a string representation of the game's squares. 
      */
     public String toString()
     {
         String s = "";
         
         for (int i = 0; i < squares.length; i += 1)
         {
             for (int j = 0; j < squares[i].length; j += 1)
             {
                s = s + squares[i][j] + " ";
             }
             s += '\n';
         }
         return s;
     }          
}
