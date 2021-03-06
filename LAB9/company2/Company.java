import java.util.ArrayList;

/**
 * SYSC 2004 Winter 2015 Lab 9
 * 
 * Class Company maintains a collection of employees.
 */
public class Company
{   
    ArrayList<IEmployee> employee;
    private double sum;
    
    /**
     * Constructor for objects of class Company
     */
    public Company()
    {
        employee= new ArrayList<IEmployee>();
    }
    
    /**
     * Determine if the specified employee is in the list of employees.
     * 
     * @return true if e is in the company's list of employees;
     *         otherwise false.
     */
    public boolean lookupEmployee(IEmployee e)
    {
        for(IEmployee list : employee){
        if(list.equals(e)){
        return true;
        }
        }
        return false;
    }     
    
    /**
     * Add the specified employee to the this company's list of
     * employees, but only if the employee is not already in
     * the list.
     * 
     * @return true if the employee was added to the list, otherwise return false. 
     */
    public boolean addEmployee(IEmployee e)
    {
         if(lookupEmployee(e)==false){
        employee.add(e);
        return true;
    }
      return false;
    }
    
    /**
     * Calculate the total payroll for a two-week period.
     * 
     * @return the amount paid to all employees every twoo weeks. 
     */
    public double calculatePayroll()
    {
        sum=0;
        for(IEmployee list : employee){
        sum=sum+list.calculatePay();
        }
        
        return sum;
    }  
}
        
