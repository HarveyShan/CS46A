import java.util.Arrays;
/**
 * Manages a collection of SimpleLine objects
 *
 * @author KOBrien
 */

public class SimpleLineArrayManager
{
	SimpleLine[]lines;
 
	
    /**
     * 
     * @param theLines the input linem how much memory should this array space
     */
    public SimpleLineArrayManager(SimpleLine[] theLines)
    {
    	lines= theLines;
    }

    
    
    /**
     * @param theLine the line you need to calculate
     * @return length the length
     */
    public double getLength(SimpleLine theLine)
    {
    	double length = 0;
    	length = Math.sqrt(Math.pow((theLine.getX2()- theLine.getX1()), 2) + Math.pow((theLine.getY2() - theLine.getY1()), 2) );
    	return length;
    }
    
	/**
	 * loop through the array,
	 *  get the length of every simple line, by calling each simple line's length
	 * then add them all together
	 * 
	 * @return sum the sum
	 */
	public double sum()
	{
		double sum = 0;
		
		for(int i = 0; i < lines.length; i++)
		{
			sum = sum + getLength(lines[i]); 
		}
		
		return sum;
	}
	
	
	
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return Arrays.toString(lines);
    }
}