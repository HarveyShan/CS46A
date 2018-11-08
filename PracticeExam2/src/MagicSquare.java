
/**
 * Write a description of class MagicSquare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicSquare
{
    private int magicSquare [][];
    
    public MagicSquare(int theMagicSquare [][])
    {
        magicSquare = theMagicSquare;
    }
    
    public int sum()
    {
        int sum = 0;
        
        for(int i = 0; i < magicSquare.length; i++)
        {
        	for(int j = 0; j < magicSquare[i].length;j++)
        	{
        		sum = sum + magicSquare[i][j];
        	}
        }
        
        return sum;
    }
    
    public int last()
    {
        int last = 0;
        last = magicSquare[magicSquare.length-1][magicSquare[magicSquare.length-1].length-1];
        return last;
    }
}
