import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args){
        ArrayList<String> key = new ArrayList<String>();
        
        String[] correctAnswers = {"A", "C", "D", "E", "B", "C", "E", "B", "B", "C"};
        for (String c: correctAnswers){
            key.add(c);
        }
        
        
        ArrayList<String> answers1 = new ArrayList<String>();
        
        String[] studentAnswers1 = {"A", "B", "D", "E", "A", "C", "?", "B", "D", "C"};
        for (String s: studentAnswers1){
            answers1.add(s);
        }
        
        StudentAnswerSheet student1 = new StudentAnswerSheet("Karen", answers1);
        
        
        ArrayList<String> answers2 = new ArrayList<String>();
        
        String[] studentAnswers2 = {"B", "B", "?", "E", "A", "D", "A", "B", "?", "C"};
        for (String s: studentAnswers2){
            answers2.add(s);
        }
        
        StudentAnswerSheet student2 = new StudentAnswerSheet("Brian", answers2);
        
        
        ArrayList<String> answers3 = new ArrayList<String>();
        
        String[] studentAnswers3 = {"A", "C", "D", "E", "?", "C", "E", "B", "A", "C"};
        for (String s: studentAnswers3){
            answers3.add(s);
        }
        
        StudentAnswerSheet student3 = new StudentAnswerSheet("Jessica", answers3);
        
        System.out.println(student1.getScore(key)); //Should be 5.25
        System.out.println(student2.getScore(key)); //Should be 1.75
        System.out.println(student3.getScore(key)); //Should be 7.75
        
        ArrayList<StudentAnswerSheet> sheets = new ArrayList<StudentAnswerSheet>();
        sheets.add(student1);
        sheets.add(student2);
        sheets.add(student3);
        
        TestResults test1 = new TestResults(sheets);
        System.out.println(test1.highestScoringStudent(key)); //Should be Jessica
    }
}
