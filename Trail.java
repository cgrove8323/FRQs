
/**
 * Write a description of class Trail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trail
{
    private int[] markers;

    /**
     * Constructor for objects of class Trail
     * 
     * @param  markers  the array of elevations of markers on a trail.
     */
    public Trail(int[] markers)
    {
        this.markers = markers;
    }

    /**
     * Determines if a trail segment is level. A trail segment is defined by 
     * a starting marker, ending marker, and all the markers between those 
     * two markers. A trail segment is level if it has a difference between the 
     * max elevation and min elevation that is less than or equal to 10 meters.
     *
     * @param  start  the index of the starting marker
     * @param  end  the index of the ending marker
     * @return  true if the difference between the max and min elevation on 
     * the segment of the trail is less than or equal to 10 meters, otherwise 
     * false
     */
    public boolean isLevelTrailSegment(int start, int end)
    {
        int max = markers[start];
        int min = markers[start];
        for(int i = start+1; i < end; i++){
            max = Math.max(max, markers[i]);
            min = Math.min(min, markers[i]);
        }
        return (max - min) <= 10;
    }
    
    /**
     * Determines if the trail is difficult. A trail is rated by counting the 
     * number of changes in elevation that are at least 30 meters (up or down) 
     * between two consecutive markers. A trail with 3 or more such changes 
     * is rated difficult.
     * @ return true  if the trail is rated difficult; false otherwise.
     */
    public boolean isDifficult(){
        int count = 0;
        for (int i = 0; i < markers.length-1; i++){
            if (Math.abs(markers[i] - markers[i+1]) >= 30){
                count++;
            }
        }
        return count >= 3;
    }
}
