/**
 * SYSC 2004 B/C Winter 2015 Lab 2
 */

/** A Heater models a simple space-heater. The operations provided by a Heater
 * object are:
 * 1. Increase and decrease the temperature setting by a set amount. (Exercise 1)
 *    The heaters temperature cannot be raised above a specified maximum
 *    value or lowered below a specified minimum value. (Exercise 2)
 * 2. Return the current temperature setting. (Exercise 1)
 * 3. Change the set amount by which the temperature is increased 
 *    and lowered to a specified non-negative value. (Exercise 2)
 * 
 * @author Nishant Sareen #100940624, Carleton University
 * @version 1.01 January 13, 2007
 * @version 1.02 March 23, 2011
 * @version 1.03 January 11, 2012
 */
public class Heater
{
    /** The temperature setting that the heater should maintain. */
    public int temperature;
    public int min;
    public int max;
    public int increment;
    
    // Declare the field named temperature here.
           
    /**
     * Constructs a new Heater with an initial temperature setting of 15
     * degrees, and which increments and decrements the temperature
     * setting in increments of 5 degrees (see methods warmer and cooler). 
     */
    public Heater(int minTemp,int maxTemp)
    {
        this.temperature=15;
        this.increment=5;
        this.max=maxTemp;
        this.min=minTemp;
    }

    /**
     * Returns this heater's current temperature setting.
     */    
    public int getTemperature()
    {
        return temperature;
    }
    
    /**
     * Increases the heater's temperature setting by 5.
     */
    public void warmer()
    {
        if(temperature+increment<=max){
        temperature= temperature + increment;
    }
    }

    /**
     * Lowers the heater's temperature setting by 5.
     */   
    public void cooler()
    { 
        if(temperature-increment>=min){
        temperature= temperature - increment;
    }
    }
    
    // setIncrement is implemented in Exercise 2.
    
    /**
     * Sets the temperature increment used by warmer() and cooler() 
     * to the specified value. Has no effect if newIncrement is not
     * positive.
     */        
    public void setIncrement(int newIncrement)
    {
        if(newIncrement>0){
        increment=newIncrement;
    }
    }     
}

