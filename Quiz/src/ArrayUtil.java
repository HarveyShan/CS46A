public class ArrayUtil
{
   /**
      Computes the sum of a given row in a two-dimensional array. 
      @param values the array
      @param the row whose sum to compute
      @return the sum of the given row
   */
   public static int rowSum(int[][] values, int row) 
   {
	   int rowSum = 0;
	   int rowLength = values[row].length;
	   
	   for(int i = 0; i < rowLength; i++)
	   {
		   rowSum = rowSum + values[row][i];
	   }
	   
	   
	   return rowSum;
   }
}