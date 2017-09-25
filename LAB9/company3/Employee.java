/**
 * SYSC 2004 Winter 2015 Lab 9.
 * 
 * Class Employee is the superclass for classes that 
 * model all types of employees.
 */
public abstract class Employee implements IEmployee
{   
    private String name;
    private int id=0;
    
    /**
     * Calculate two week's pay for this employee.
     * 
     * @return the amount this employee is paid every two weeks.
     */
    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    
    }
    public abstract double calculatePay();
    
    /**
     * Determines if this employee and employee emp are the same employee, based on their ID.
     * @return true if employee emp has the same ID as this employee; otherwise false.
     */
    public  boolean equals(Object obj){
    if (obj == this) {
            return true;
        }
    if(obj==null){
    return false;
    }
    if(getClass()!=obj.getClass()){
    return false;
    }
    Employee other =(Employee) obj;
    return id==other.id ;
    
   }
    
    /**
     * Return a string representation of this employee.
     * 
     * @return a string of the form "name: id"; for example,
     *         "Cathy Coder: 123456"
     */
    public String toString(){
    return (name+": "+id);
    }    
}