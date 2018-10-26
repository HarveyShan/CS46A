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
            // Your work here

        }
        return 0;
    }

    public String getVowels(String word)
    {
        String allVowel = "";

        for(int i = 0; i<word.length();i++)
        {
            String character = word.substring(i,i+1);
            if(isVowel(character))
            {
                allVowel = allVowel + character;
            }

        }

        return allVowel;
    }
    
    
    public String getVowelsFirst(String word)
    {
        String allVowel = "";

        for(int i = 0; i<word.length();i++)
        {
            String character = word.substring(i,i+1);
            if(isVowel(character))
            {
                allVowel = allVowel + character;
                word = word.replaceAll(character, "");
                
            }
        }

        return allVowel + word ;
    }

    public String getLongestVowel()
    {
    	String longestVowels = "";
    	String currentVowels = "";
//    	int counter = 0;
    	int i = 0;
    	
    	while(i < text.length())
    	{
//    			counter++;
			while(isVowel(text.substring(i, i+1)) && isVowel(text.substring(i+1, i+2)))
			{
				currentVowels = currentVowels + text.charAt(i);
				if(currentVowels.length() > longestVowels.length())
				{
					longestVowels = currentVowels;
				}
				i++;
			}
    		i++;
    	}
    	return longestVowels;
    }
    
    public int countVowelGroups()
    {
        // Your work here
        return 0;
    }

    public String toString()
    {
        return text;
    }
}