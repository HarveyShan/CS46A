import java.util.ArrayList;

public class ArrayListUtil
{
   /**
      Finds the positions of all strings equal to a given string 
      in an array list of strings.
      @param words an array list of strings
      @param searchedWord the word to search for
      @return an array list of all matching positions
   */
   public static ArrayList<String> findAll(ArrayList<String> words, String searchedWord)
   {
      ArrayList position = new ArrayList<Integer>();
      
      int count = 0;
      for(int i = 0; i <= words.size() - 1; i++)
      {
          
          if(words.get(i).equals(searchedWord))
          {
              position.add(i);
              
              count++;
              i++;
            }
            
            
      }
      return position;
   }
}



//import java.util.ArrayList;
//
//public class ArrayListUtil
//{
//   /**
//      Removes adjacent duplicates from an array list of strings.
//      @param word an array list of strings
//   */
//   public static void removeAdjacentDuplicates(ArrayList<String> words)
//   {
//	   for(int i = 0; i < words.size(); i++)
//	   {
//		   if(words.get(i).equals(words.get(i+1)))
//		   {
//			   words.remove(i);
//			   i--;
//		   }
//	   }
//   }
//}