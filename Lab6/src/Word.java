public class Word
{
   /**
      Tests whether a letter is a vowel
      @param letter a string of length 1
      @return true if letter is a vowel
    */
   public boolean isVowel(String letter)
   {
	   boolean ifVowel = false;
	   letter = letter.toLowerCase();
	   if(letter.contains("a") || letter.contains("e") || letter.contains("i") || letter.contains("o") || letter.contains("u") || letter.contains("y"))
	   {
		  ifVowel = true; 
	   }
	   
	   else {
		   ifVowel = false;
	   }
      return ifVowel;
   }
   
   public boolean fill(int row, int column)
   {
	   
	   
	   if(row == 4)
	   {
		   return true;
	   }
	   
	   if(row == 6)
	   {
		   return true;
	   }
	   
	   if(column == 2 && row == 3)
	   {
		   return true;
	   }
	   
	   if(column == 2 && row == 4)
	   {
		   return true;
	   }
	   
	   else
	   {
		   return false;
	   }
   }
   
   
   
}




