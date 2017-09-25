/**
 * SYSC 2004 Winter 2015 Lab 9.
 * 
 * Class HourlyEmployee models employees who work a number of bours
 * per week for an hourly wage. 
 */
public class HourlyEmployee extends Employee
{
    private double wage=0;
    private double hours=0;
    
    
    public HourlyEmployee(String name,int id){
    super(name,id);
    }
    public void setHourlyWage(double wage){
        this.wage=wage;
    
    }
    public void setHoursWorked(double hours){
    this.hours=hours;
    }
    public String toString(){
     return super.toString();
    }
    
    public double calculatePay(){
    return (wage*hours*2);
    }
    public  boolean equals(Object obj){
    
    if(!super.equals(obj)){
        return false;
    
    }
    HourlyEmployee other = (HourlyEmployee) obj;
    return Math.abs(other.wage-wage)<0.001  &&  Math.abs(other.hours-hours)<0.001;
   }
    
}
