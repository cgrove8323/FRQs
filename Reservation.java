
/**
 * Write a description of class Reservation here.
 *
 * @author (Casey Groves)
 * @version (January 25, 2019)
 */
public class Reservation
{
    private String guestName;
    private int roomNumber;

    /**
     * Constructor for objects of class Reservation
     */
    public Reservation(String guestName, int roomNumber)
    {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getRoomNumber()
    {
        return roomNumber;
    }
}
