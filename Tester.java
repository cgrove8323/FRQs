
/**
 * Write a description of class Tester here.
 *
 * @author (Casey Groves)
 * @version (November 1, 2018)
 */
public class Tester
{

    public static void main(String[] args){
        SelfDivisor s1 = new SelfDivisor();
        System.out.println(s1.isSelfDivisor(128));
        System.out.println(s1.isSelfDivisor(26));
        int[] result = s1.firstNumSelfDivisors(10, 3);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
        int[] result2 = s1.firstNumSelfDivisors(21, 4);
        for (int i = 0; i < result2.length; i++){
            System.out.println(result2[i]);
        }
    }
}
