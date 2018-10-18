public class StringScrambler
{
   public String scramble(String word)
   {
       if(word.length() >= 2)
       {
           //String lastLetter = word.substring(word.length()-1, word.length());
           //String middle = word.substring(1, word.length()-1);
           String firstLetter = word.substring(0,1);
           
           //for Q7
           
           String secondLetter = word.substring(1,2);
           //String thirdLetter = word.substring(2,3);
           //String thirdToLast = word.substring(3, word.length());
           
           int random = randomInt(2, word.length());
           //generating a random number between 
               if(random != 2)
               {
                String theBetween = word.substring(2, random);
                }
           //between the random 
           
           String indexString = word.substring(random, random+1);
           
           String indexStringPlusOne = word.substring(random+1, random+2);
           
           String theRest = word.substring(random+2 , word.length());
           return firstLetter + secondLetter + indexStringPlusOne + indexString + theRest;
        }
        
        else
        {
            return "You did not enter a valid word";
        }
   }

   /**
      Returns a random integer between begin and pastEnd - 1
      @param begin the lower bound (inclusive)
      @param end the upper bound (exclusive)
   */
   public int randomInt(int begin, int pastEnd)
   {
      return begin + (int)((pastEnd - begin) * Math.random());
   }

   /**
      Scrambles all words of length > 3 in a given sentence, after stripping off 
      white space and punctuation marks (except for '). Do not look inside this
      method. If you do, be sure to avert your eyes from the split method call, or permanent eye damage may occur.
      @param sentence a string consisting of one or more words
      @return the string witht the words scrambled
   */
   public String scrambleSentence(String sentence)
   {
      String result = "";
      for (String w : sentence.split("[\\s\\p{Punct}&&[^']]+"))
      {
         String r;
         if (w.length() > 3) r = scramble(w);
         else r = w;
         result = result + r + " ";
      }

      return result;
   }

}