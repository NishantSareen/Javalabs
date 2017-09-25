/**
 * SYSC 2004 Winter 2015 Lab 9.
 * 
 * Class SalariedEmployee models employees who have an annual salary. 
 */
public class SalariedEmployee extends Employee 

{
    private double salary=0;
    public static final double weeks=52;
    public SalariedEmployee(String name,int id){
    
    super(name,id);
    }
    public void setAnnualSalary(double salary){
    this.salary=salary;
    }
    /**
     * Return a string representation of this employee.
     * 
     * @return a string of the form "name: id"; for example,
     *         "Cathy Coder: 123456"
     */
    public String toString(){
     return super.toString();
    }
    public double calculatePay(){
    return (this.salary/weeks)*2;
    }
    
   
    
}
