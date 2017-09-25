
/**
 * Write a description of class BankAccount here.
 * 
 * @author (Nishant Sareen) 
 * @version (26 feb 2015)
 */
public class BankAccount
{
    // instance variables - replace the example below with your own
    private double balance;
    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount(double initialBalance)
    {
        this.balance=initialBalance;
        
    }
    public void deposit(double amount){
    balance = balance+amount;
    }
    public void withdraw(double amount){
    balance= balance - amount;
    }
    
    public double getBalance(){
    return balance;
    }
    
    

    
}
