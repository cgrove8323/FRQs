import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class StudentAnswerSheet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentAnswerSheet
{
    private ArrayList<String> answers;
    private String name;
    
    /**
     * Constructor for StudentAnswerSheet class
     * 
     * @param name the name of the student
     * @param answers the ArrayList of their answer choices
     */
    public StudentAnswerSheet(String name, ArrayList<String> answers)
    {
        this.name = name;
        this.answers = answers;
    }
    
    /**
     * @param key the list of corect answers, represented as strings of length 
     * one
     *      Precondition: key.size() is equal to the number of answers in this 
     *      answer sheet
     * @return this student's test score
     */
    public double getScore(ArrayList<String> key)
    {
        double score = 0.0;
        for (int i = 0; i < answers.size(); i++)
        {
            String answer = answers.get(i);
            String correct = key.get(i);
            if (answer.equals(correct)){
                score++;
            }
            else if (answer.equals("?")){
                score = score;
            }
            else{
                score -= 0.25;
            }
        }
        return score;
    }

    /**
     * @return the name of the student
     */
    public String getName()
    {
        return name;
    }
}
