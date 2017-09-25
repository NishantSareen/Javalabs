
/**
 * Write a description of class SavingsAccount here.
 * 
 * @author (Nishant Sareen) 
 * @version (a version number or a date)
 */
public class SavingsAccount extends BankAccount
{
    // instance variables - replace the example below with your own
    private double minBalance;
    private double interestRate;

    /**
     * Constructor for objects of class SavingsAccount
     */
    public SavingsAccount(double initialBalance)
    {
        super(initialBalance);
        this.interestRate=0;
        this.minBalance=getBalance();
        
    }
    public void setInterestRate(double rate){
    this.interestRate=rate;
    }
    
    public void withdraw(double amount){
    super.withdraw(amount);
    if(getBalance()<minBalance){
    this.minBalance=getBalance();
    }
    }
    
    public void monthEnd(){
    double interest = (minBalance*(interestRate/100));
    deposit(interest);
    minBalance=getBalance();
    }
    
    

   
    
    
    
}
