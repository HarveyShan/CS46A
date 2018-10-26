import java.util.*;

public class Word
{
   private String text;

   /**
      Constructs a word.
      @param text the characters in this word
   */
   public Word(String text)
   {
      this.text = text;
   }

   /**
      Tests whether a letter is a vowel
      @param letter a string of length 1
      @return true if letter is a vowel
    */
   public boolean isVowel(String letter)
   {
      return "aeiouy".contains(letter.toLowerCase());
   }

   public int countVowels()
   {
      int i = 0;
      int counter = 0;
      while (i < text.length())
      {
         String letter = text.substring(i, i + 1); // the ith letter
         if(isVowel(letter))
         {
        	 counter++;
         }
         i++;
      }
      return counter;
   }

   public boolean hasCons(String letter)
   {
	   if(letter.contains("bcdfghjklmnpqrstvwxz"))
	   {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   
   public int countVowelGroups()
   {
	  int vowelGroups = 0;
//	  ArrayList<String> list = new ArrayList<String>();
	  boolean first = false;
	  
	  for(int i = 0; i < text.length(); i++)
	  {
		  String letter = text.substring(i, i + 1);
		  if(isVowel(letter))
		  {	
			  if(first == false)
			  {
				  first = true;
				  vowelGroups++;
			  } 
		  }
		  
		  else {
			  first = false;
		  }
	  }
	  
//	  String split[] = text.split("bcdfghjklmnpqrstvwxz");
      return vowelGroups;
   }
   
   public String toString()
   {
      return text;
   }
   
   public static void main(String[] args)
   {
      Word w = new Word("beauty");
      System.out.println("Vowel groups in " + w + ": " + w.countVowelGroups());
      System.out.println("Expected: 2");
      w = new Word("mississippi");
      System.out.println("Vowel groups in " + w + ": " + w.countVowelGroups());
      System.out.println("Expected: 4");
      w = new Word("ant");
      System.out.println("Vowel groups in " + w + ": " + w.countVowelGroups());
      System.out.println("Expected: 1");
      w = new Word("treasure");
      System.out.println("Vowel groups in " + w + ": " + w.countVowelGroups());
      System.out.println("Expected: 3");    
   }
   
}