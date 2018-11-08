import java.util.Arrays;


/**
 * Manages a collection of SimpleLine objects
 *
 * @author Harvey Shan
 */

public class SimpleLineArrayManager
{
   
    private SimpleLine[] lines;

    /**
     * Creates an instance variable for the object
     * @param lines the lines
     */
     
    public SimpleLineArrayManager(SimpleLine[] lines)
    {
        this.lines = lines;
    }

    /**
     * Returns the length of lines
     * @return getLength
     * @param lines the lines
     */
     
    public double getLength(SimpleLine lines)
    {
        double x1 = lines.getX1();
        double x2 = lines.getX2();
        double y1 = lines.getY1();
        double y2 = lines.getY2();
        double lineLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return lineLength;
    }

    /**
     * Gets the sum of length of all the lines in the array
     * @return sum the sum of the lines length
     */
     
    public double sum()
    {
       
        double sum = 0;
        
        for (SimpleLine currentLine: lines)
        {
         double lineLength = getLength(currentLine);
            sum = sum + lineLength;
        }
        
        return sum;
    }
    
    /**
     * Gets the swap indexes
     * @param index1 the first index
     * @param index2 the second index
     * @param swap
     */
     
    public void swap(int index1, int index2)
    {
        if(index1 >= 0 && index2 >= 0)
        {
            if(index1 < lines.length && index2 < lines.length)
            {
                SimpleLine line1 = lines[index1];
                SimpleLine line2 = lines[index2];
                lines[index1] = line2;
                lines[index2] = line1;
            }
        }
    }

    /**
     * Get the shortest line
     * @return the shortest line
     */
     
    public SimpleLine shortest()
    {
        SimpleLine shortestLine;
        if(!(lines.length == 0))
        {
            shortestLine = lines[0];
            for (int i = 1; i < lines.length; i++)
            {
                if(getLength(lines[i]) < getLength(shortestLine))
                {
                    shortestLine = lines[i];
                }
            }
        }
        
        else shortestLine = null;
        
        return shortestLine;
    }
    
    @Override
    public String toString()
    {
        return Arrays.toString(lines);
    }
}
    