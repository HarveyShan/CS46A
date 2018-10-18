import java.util.Scanner;

public class RemoveDuplicateWords
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String word = in.next();
      
      boolean done = false;
      while (!done)
      {
         String previous = word;
         word = in.next();
         if (word.endsWith("."))
         {
            word = word.substring(0, word.length()-1);
            done = true;
         }
         if (!(word.equals(previous)))
         {
            System.out.print(previous + " ");
            
         }
      }
      System.out.print(word + ".");
   }
}