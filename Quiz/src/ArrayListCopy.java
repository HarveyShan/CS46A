import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCopy
{
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<String>();
      Scanner in = new Scanner(System.in);
      while (in.hasNext()) words.add(in.next());

      ArrayList<String> copyOfWords = new ArrayList<String>(); 

      for(int i = 0; i < words.size(); i++)
      {
    	  String temp = words.get(i);
    	  copyOfWords.add(temp);
      }
      System.out.println(words);
      System.out.println(copyOfWords);
   }
}