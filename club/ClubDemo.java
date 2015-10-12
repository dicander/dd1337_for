
/**
 * Provide a demonstration of the Club and Membership
 * classes.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClubDemo {
    // instance variables - replace the example below with your own
    private Club club;

    /**
     * Constructor for objects of class ClubDemo
     */
    public ClubDemo() {
        club = new Club();
    }

    /**
     * Add some members to the club, and then
     * show how many there are.
     * Further example calls could be added if more functionality
     * is added to the Club class.
     */
    public void demo() {
        club.join(new Membership("David", 2, 2004));
        club.join(new Membership("Michael", 1, 2004));
        club.join(new Membership("Luke", 12, 1977)); //Star Wars IV opened December 16th 1977.
        club.join(new Membership("Leia", 12, 1977));
        club.join(new Membership("Anakin", 2, 1962));
        club.join(new Membership("Santa", 12, 1904));
        
        System.out.println("The club has " +
                           club.numberOfMembers() +
                           " members.");
        club.printMembers();
    }
}
