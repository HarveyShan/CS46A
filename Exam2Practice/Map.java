
/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Map
{
    private int heights [][];
    public Map(int [][] array)
    {
        heights = array;
    }
    
    public int lowest()
    {
        int lowest = heights[0][0];
        for(int i = 0; i < heights.length; i++)
        {
            for(int j = 0; j < heights[i].length; j++)
            {
                if(heights[i][j] < lowest)
                {
                    lowest = heights[i][j];
                }
            }
        }
        
        return lowest;
    }
    
    public int lastEntry()
    {
        int last = 0;
        last = heights[heights.length-1][heights[heights.length-1].length-1];
        return last;
    }
}
