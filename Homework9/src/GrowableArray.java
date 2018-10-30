import java.util.Arrays;

/**
 * An array that can grow and shrink
 */
public class GrowableArray
{
   private String[] contents;
   private int size;  //the number of elements actually in the array
   public static final int CAPACITY = 8;

   
   
   /**
    * 	
    */
   public GrowableArray()
   {
	   String[]theContents = new String[CAPACITY];
	   contents = theContents;
	   size = 0;
	   
   }
   
   

	   /**
	 * @param toAdd add element at end
	 */
	public void add(String toAdd)
   {
		contents[size] = toAdd;
		size++;
		growIfNeeded();
   }
   
   
   
   
   /* Notice this is not Javadoc since the method is not part of the public interface
    * 
    * If the array is at capacity, doubles the size of the array by creating a new array that is twice 
    * as big,  copying the elements from the old array to the new array
    * and assigning the new array to the array reference (instance variable) 
    * 
    * (Note: the array is at capacity when the instance variable size equals the length of the array
    * 
    */
   private void growIfNeeded()
   {
       if( size == contents.length)
       {
           String[] bigger = Arrays.copyOf(contents, size * 2);
           contents = bigger;

       }
   }
   
   
    
   //Can not just use Arrays.toString because we only want the elements 
   //in the partially filled array - not all the elements.
   @Override
   public String toString()
   {
      String s = "[";
      for (int i = 0; i < size; i++)
      {
          if (i != 0)
          {
              s = s +", ";
          }
          s = s + contents[i];
      }

      s = s + "]";
      return s;
   }
   
}