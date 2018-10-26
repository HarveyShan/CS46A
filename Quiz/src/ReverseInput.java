import java.util.ArrayList;
import java.util.Scanner;
public class ReverseInput
{
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<String>();
 
      Scanner in = new Scanner(System.in);     
      String input = " ";
      while (in.hasNext())
      {
        input = in.next();
        words.add(input);
      }
      
      // Reverse input
      for(int i = words.size()-1;i >= 0;i--)
      {
         System.out.print(words.get(i) + " ");
      }
   }
}