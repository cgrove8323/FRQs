import java.util.ArrayList;
/**
 * Write a description of class TestResults here.
 *
 * @author (Casey Groves)
 * @version (February 6, 2019)
 */
public class TestResults
{
    private ArrayList<StudentAnswerSheet> sheets;

    public TestResults(ArrayList<StudentAnswerSheet> sheets)
    {
        this.sheets = sheets;
    }
    
    /**
     * Precondition: sheets.size() > 0; all answer sheets in sheets have the 
     *               same number of answers
     * @param key the list of correct answers represented as strings of length 
     * one
     *      Precondition: key.size() is equal to the number  of answers in each 
     *                    of the answer sheets in sheets
     * @return the name of the student with the highest score
     */
    public String highestScoringStudent(ArrayList<String> key)
    {
        double highScore = sheets.get(0).getScore(key);
        String highScoreName = "";
        for (StudentAnswerSheet s: sheets){
            double score = s.getScore(key);
            String name = s.getName();
            if (score > highScore){
                highScore = score;
                highScoreName = name;
            }
        }
        return highScoreName;
    }
}
