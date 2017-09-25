/**
 * A LineSegment object models a line in the two-dimensional Cartesian plane.
 * 
 * @author (your name) 
 * @version Version 1.00 January 18, 2012
 */
public class LineSegment
{
    // Declare fields here.
    private Point topoint;
    private Point frompoint;
    
    /**
     * Initializes this LineSegment with starting point (x1, y1) and
     * ending point (x2, y2).
     */
    public LineSegment(double x1, double y1, double x2, double y2)
    {
        frompoint= new Point(x1,y1);
        topoint = new Point(x2,y2);
        
        
    }
    
    /**
     * Returns the starting point of this LineSegment.
     */
    public Point getStartingPoint()
    {
        return frompoint;
    }
    /**
     * Returns the ending point of this LineSegment.
     */
    public Point getEndingPoint()
    {
        return topoint;
    }  
    
    /**
     * Returns the length of this LineSegment.
     */
    public double length()
    {
        // Replace this return statement with your method.  
        double x2= topoint.getX();
        double y2= topoint.getY();
        double x1= frompoint.getX();
        double y1 = frompoint.getY();
        double distance= Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
        
        
        
        return distance;  // Return "Not a Nunber" to keep the compiler happy.
    }
    
    /**
     * Moves this LineSegment the specified distance horizontally.
     */
    public void moveHorizontal(double distance)
    {
      
        frompoint.shift(distance,0);
        topoint.shift(distance,0);
    }

    /**
     * Moves this LineSegment the specified distance vertically.
     */
    public void moveVertical(double distance)
    {
        frompoint.shift(0,distance);
        topoint.shift(0,distance);
    }
    
    /**
     * Returns true if this LineSegment is a vertical line;
     * otherwise returns false.
     */
    public boolean isVertical()
    {
        if (frompoint.getX()==topoint.getX()){
        return true;
        }
        else
        return false;
    }
    
     /**
     * Returns true if this LineSegment is a horizontal line;
     * otherwise returns false.
     */
    public boolean isHorizontal()
    {
        if (frompoint.getY()==topoint.getY()){
        return true;
        }
        else
        return false;
    }   
    
    /**
     * Returns the slope of this LineSegment. 
     */
    public double slope()
    {
        // Replace this return statement with your method.
        if (this.isVertical()==true){
        return Double.POSITIVE_INFINITY;
        }
        double slope=((topoint.getY()-frompoint.getY())/ (topoint.getX()-frompoint.getX()));
        return slope;  // Return "Not a Nunber" to keep the compiler happy.        
    }
}
