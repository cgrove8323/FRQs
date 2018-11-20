
/**
 * Write a description of class StudentRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRecord
{
    private int[] scores;
    
    public StudentRecord(int[] scores){
        this.scores = scores;
    }
    
    /**
     *
     * @param  first index of starting grade
     * @param last index of ending grade, inclusive
     * @return arithmetic mean of grades between first and last index
     */
    private double average(int first, int last)
    {
        double total = 0;
        for (int i = first; i <= last; i++){
            total += scores[i];
        }
        return total/(last - first + 1);
    }
    
    /**
     * 
     * @return true if every grade is greater than or equal to previous grade,
     *  and false otherwise
     */
    private boolean hasImproved(){
            for (int i = 0; i < scores.length-1; i++){
                if (scores[i] > scores[i+1]){
                    return false;
                }
            }
            return true;
    }
    
    
    /**
     * @return average of all scores if not improved, second half of scores
     * if improved
     */
    public double finalAverage(){
        boolean improved = hasImproved();
        if (improved){
            return average(scores.length/2, scores.length-1);
        }
        return average(0, scores.length-1);
    }
}
