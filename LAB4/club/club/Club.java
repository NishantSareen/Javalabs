 import java.util.ArrayList;
 import java.util.Random;
/**
 * Store details of club memberships.
 * 
 * @author (Nishant Sareen, 100940624) 
 * @version (feb 4 2014)
 */
public class Club
{
    ArrayList<Membership> clubmember;
    Random rnd;
    
    // Define any necessary fields here ...
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        clubmember= new ArrayList<Membership>();
        rnd= new Random();
        
        
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return clubmember.size();
        
    }
    
    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        
        clubmember.add(member);
    } 
    /**
    * Determine if a specific person is a member of the club.
   * @param name The person's name.
   * @return true if that person is a member;
   * otherwise return false.
    */
    public boolean hasMember(String name){
    for(Membership member : clubmember){
    if(member.getName().equals(name)==true){
    return true;
    }
    }
    return false;
    
    }
    /**
    * Determine the number of members who joined in the
    * given month.
    * @param month The month we are interested in.
    * @return The number of members.
    */
   public int joinedInMonth(int month){
    if(month < 1 || month > 12) {
            System.out.println("Month has to be vaild!");
            return 0;
        }
    int count=0;
    for(Membership member : clubmember){
    if(member.getMonth()==month){
    count++;
    }
    
    }
    return count;
    
    
    }
    /**
* Select a random member of the club.
* @return The randomly selected member.
*/
public Membership pickAMember(){
int random=rnd.nextInt(clubmember.size());
return clubmember.get(random);
}


/**
* Remove from the club's collection all members who
* joined in the given month, and return them stored
* in a separate collection object.
* @param month The month of the Membership.
* @return The members who joined in the given month.
*/
public ArrayList<Membership> purge(int month){
    // removed members is an arraylist of type Membership that stores purged members
     ArrayList<Membership> removedmembers= new ArrayList<Membership>();
    if(month < 1 || month > 12) {
            System.out.println("Month has to be vaild!");
            return clubmember;
        }
    
    for(int i=clubmember.size()-1;i>=0;i--){
    if (clubmember.get(i).getMonth()== month){
        removedmembers.add(clubmember.get(i));
        clubmember.remove(i);
    }
    
    }
    return removedmembers;
    
    }
    
}

