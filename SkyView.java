
/**
 * Write a description of class SkyView here.
 *
 * @author (Casey Groves)
 * @version (March 18, 2019  River's Birthday yo! :D)
 */
public class SkyView
{
    private double[][] view;

    
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        double[][] view = new double[numRows][numCols];
        for (int row = 0; row < view.length; row++){
            for (int col = 0; col < view[0].length; col++){
                if (
            }
        }
    }

    
    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        return 0.0;
    }
    
    public String toString(){
        String result = "Skyview:\n";
        
        for (int r = 0; r < view.length; r++) {
            result += " ";
            for (int c = 0; c < view[r].length; c++) {
                result += view[r][c] + "\t";
            }
            result += "\n";
        }
        return result.trim();
    }
}
