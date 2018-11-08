import java.util.Arrays;


/**
 * An array that can grow and shrink
 * @author Harvey
 */
 
public class GrowableArray
{
   private String[] contents;
   private int size;  //the number of elements actually in the array
   public static final int CAPACITY = 8;
   
   /**
    * Constructs a string array of the specified capacity
    */
    
   public GrowableArray()
   { 
       contents = new String[CAPACITY];
   }
   
   /**
    * Constructs a method to add words to the string array
    * @param add words to be added to the string array
    */
    
   public void add(String add)
   {
     if(size < contents.length)
     {
         size++;
         contents[size -1] = add;
     }
    
     if( size == contents.length)
     {
           String[] bigger = Arrays.copyOf(contents, size * 2);
           contents = bigger;
     }
   }
   
   /**
    * constructs a method to add words to the string array at the given index
    * @param add the word to be added to the string array
    * @param index adds word at the given index number
    */
    
   public void add(String add, int index)
   {
     if( size == contents.length)
       {
           String[] bigger = Arrays.copyOf(contents, size * 2);
           contents = bigger;
       }
    
       if(size < contents.length)
       {
         size++;
         for(int i = contents.length; i > index; i--)
         {
            contents[i-1] = contents[i-2];
         }
      
           contents[index] = add;
       }
   }

   /**
    * Removes element at the given index
    * @param index the index number of which element is to be removed
    */
    
   public void remove(int index)
   {
       System.out.println("Index is:"+ index);
       System.out.println("intial size is:"+ size);
       if(index < size)
       {
          for(int i = index +1; i< contents.length; i++)
          {
             contents[i-1] = contents[i]; 
          }
              size--;
       }
       
       System.out.println("final size is:"+ size);
   }
   
   /**
    * Double the size of the array if length of array equals to the size
    */
    
   private void growIfNeeded()
   {
       if( size == contents.length)
       {
           String[] bigger = Arrays.copyOf(contents, size * 2);
           contents = bigger;

       }   
   }
      
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