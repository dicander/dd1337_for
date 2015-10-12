import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club {
    // Define any necessary fields here ...
    ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club() {
        members = new ArrayList<Membership>();
        
    }
    
    /**
     * Creates a club with Array capacity megalomania
     */
    public Club(int megalomania) {
        members = new ArrayList<Membership>(megalomania);
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member) {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers() {
        return members.size();
    }
    
    
    public void printMembers() {
        for(Membership current: members) {
            System.out.println(current);
        }
    }
    
    /**
     * @return An ArrayList with the members just removed from members. 
     * The people to remove are those who joined in a month a particular year.
     * @param month - The bad month if you want to stay in the club
     * @param year - The doomed year.
     */
    public ArrayList<Membership> purge(int month, int year) {
        ArrayList<Membership> removed = new ArrayList<Membership>();
        if(!(1 <= month && month <= 12)) {
            System.err.println("purge called with incorrect month: "+month);
            return removed;
        }
        Iterator<Membership> it = members.iterator(); //What? no new???
        while(it.hasNext()) {
            Membership current=it.next();
            if(current.getYear() == year && current.getMonth() == month) {
                it.remove();
                removed.add(current);
            }
        }
        return removed;
    }
    
    /**
     * @return An ArrayList with the members just removed from members.
     */
    public ArrayList<Membership> purgeFail(int month, int year) {
        ArrayList<Membership> removed = new ArrayList<Membership>();
        if(!(1 <= month && month <= 12)) {
            System.err.println("purge called with incorrect month: "+month);
            return removed;
        }
        for(Membership current:members) {
            if(current.getYear() == year && current.getMonth() == month) {
                members.remove(current);
                removed.add(current);
            }
        }
        return removed;
    }
    
    /**
     * @return An ArrayList with the members just removed from members.
     */
    public ArrayList<Membership> purgeSuccess(int month, int year) {
        ArrayList<Membership> removed = new ArrayList<Membership>();
        if(!(1 <= month && month <= 12)) {
            System.err.println("purge called with incorrect month: "+month);
            return removed;
        }
        for(Membership current:members) {
            if(current.getYear() == year && current.getMonth() == month) {
                removed.add(current);
            }
        }
        members.removeAll(removed);
        return removed;
    }
    
     /**
     * @return An ArrayList with the members just removed from members.
     */
    public ArrayList<Membership> purgeOtherFail(int month, int year) {
        ArrayList<Membership> removed = new ArrayList<Membership>();
        if(!(1 <= month && month <= 12)) {
            System.err.println("purge called with incorrect month: "+month);
            return removed;
        }
        for(int i=0; i<members.size(); ++i) {
            Membership current = members.get(i);
            while(current.getYear() == year && current.getMonth() == month) {
                members.remove(i);
                removed.add(current);
                if(i<members.size()) {
                    current = members.get(i);
                }
            }
        }
        return removed;
    }
    
    /**
     * @return An ArrayList with the members just removed from members.
     */
    public ArrayList<Membership> purgeSlownessFail(int month, int year) {
        ArrayList<Membership> removed = new ArrayList<Membership>();
        if(!(1 <= month && month <= 12)) {
            System.err.println("purge called with incorrect month: "+month);
            return removed;
        }
        for(int i=0; i<members.size(); ++i) {
            Membership current = members.get(i);
            if(current.getYear() == year && current.getMonth() == month) {
                members.remove(i);
                removed.add(current);
                i=-1;
            }
        }
        return removed;
    }
    
    /**
     * @return An ArrayList with the members just removed from members.
     */
    public ArrayList<Membership> purgeCompensation(int month, int year) {
        ArrayList<Membership> removed = new ArrayList<Membership>();
        if(!(1 <= month && month <= 12)) {
            System.err.println("purge called with incorrect month: "+month);
            return removed;
        }
        for(int i=0; i<members.size(); ++i) {
            Membership current = members.get(i);
            if(current.getYear() == year && current.getMonth() == month) {
                members.remove(i);
                removed.add(current);
                i--;
            }
        }
        return removed;
    }
    
}
