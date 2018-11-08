/**
 * Write a description of class TempratureTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TemperatureTable
{
    // instance variables - replace the example below with your own
    private String cityName;
    private int[][] temprature;

    /**
     * Constructor for objects of class TempratureTable.
     * @param name name of cityName for which temprature is to be calculated.
     * @param theTemprature temprature of the given cityName. 
     */
    public TemperatureTable(String name,int[][] theTemprature)
    {
      cityName = name;
      temprature = theTemprature;
    }

    /**
     * gets the element in the last column of last row.
     * @return Returns the temprature in last column of last row.
     */
    public int last()
    {
     int last = temprature[temprature.length-1][temprature[0].length-1];
     return last;
    }
    
    /**
     * Gets the name of the cityName.
     * @return cityName name of the cityName.
     */
    public String getName()
    {
       return cityName; 
    }
    
    /**
     * Gets the largest value in the array.
     * @return highestTemp gives the highest temprarure in the array.
     */
    public int getHighest()
    {
        int highestTemp = -462;
        for(int row =0; row < temprature.length; row++)
        {
            for(int column = 0; column < temprature[0].length; column++)
            {
                if(temprature[row][column] > highestTemp)
                {
                    highestTemp = temprature[row][column];
                }
            }
        }
        return highestTemp;
    }
    
    /**
     * Returns true if the target is in the array, otherwise false.
     * @param target value whose boolean condition is tested in the array.
     * @return targetPresent boolean condition for target.
     */
    public boolean contains(int target)
    {
      int count = 0; 
      boolean targetPresent = false;
      for(int row =0; row < temprature.length; row++)
        {
            for(int column = 0; column < temprature[0].length; column++)
            {
                if(temprature[row][column] == target)
                {
                    count++;
                }
            }
        }
        
      if(count > 0)
        {
            targetPresent = true;
        }
       return targetPresent; 
    }
}