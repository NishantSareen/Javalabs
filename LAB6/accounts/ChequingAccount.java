
/**
 * Write a description of class ChequingAccount here.
 * 
 * @author (Nishant Sareen) 
 * @version (a version number or a date)
 */
public class ChequingAccount extends BankAccount 
{
    // instance variables - replace the example below with your own
    private int withdrawls;
    public static final int WITHDRAWLLIMIT=3;
    public static final int FEE=1;

    /**
     * Constructor for objects of class ChequingAccount
     */
    public ChequingAccount(double initialBalance)
    {
        super(initialBalance);
        this.withdrawls=0;
        
    }

    
    public void withdraw(double amount)
    {
       if(withdrawls<WITHDRAWLLIMIT){
        super.withdraw(amount);
        this.withdrawls++;
       }
       else{
        super.withdraw(amount+FEE);
        }
   
    }
    public void monthEnd(){
    this.withdrawls=0;
    }
}
