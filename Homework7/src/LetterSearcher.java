
/**
 * Harvey Shan 
 *
 */
public class LetterSearcher {
	private char letter;
	

/**
 * constructor 
 *@param theLetter input 
 */
	public LetterSearcher(String theLetter)
	{
		char temp = theLetter.substring(0, 1).charAt(0);
		letter = temp;
	}

/**
 * @param phrase the input 
 *count letter 
 *@return count
 */
	
	public int letterCount(String phrase)
	{
		int count = 0;
		for(int i = 0; i < phrase.length(); i++)
		{
			if(phrase.charAt(i) == letter)
			{
				count++;
			}
		}
		return count;
	}
	
	

/**
 * @param phrase phrase 
 *@return the count 
 */
	public int doubleIndex(String phrase)
	{
		int doubleIndex = -1;
		int counter = 0;
		for(int i = 0; i < phrase.length()-1; i++)
		{
			char firstChar = phrase.charAt(i);
			char secondChar = phrase.charAt(i+1);
			
			if(letter == firstChar && letter == secondChar && counter == 0)
			{
				doubleIndex = i;
				counter++;
			}
		}
		return doubleIndex;
	}
	
	

/**
 * 
 *@return tempS the letter 
 */
	public String getLetter()
	{
		char tempC = letter;
		String tempS = String.valueOf(letter);
		return tempS;
	}
//	  public static void main(String[] args)
//	   {
//	       LetterSearcher search = new LetterSearcher("x");
//	       System.out.println(search.getLetter() + " " + search.letterCount("zero"));
//	       System.out.println("Expected: x 0");
//
//	       System.out.println(search.getLetter() + " " + search.letterCount("Xerox"));
//	       System.out.println("Expected: x 1");
//	       
//	       search = new LetterSearcher("s");
//	       System.out.println(search.getLetter() + " " + search.letterCount("Mississippi"));
//	       System.out.println("Expected: s 4");
//	       
//	       System.out.println("double at index: " + search.doubleIndex("Mississippi"));
//	       System.out.println("Expected: 2");
//	       
//	       search = new LetterSearcher("e");
//	       System.out.println("double at index: " + search.doubleIndex("tee-shirt"));
//	       System.out.println("Expected: 1");
//
//	       search = new LetterSearcher("a");
//	       System.out.println("double at index: " + search.doubleIndex("apple"));
//	       System.out.println("Expected: -1");
//	       
//	       System.out.println("double at index: " + search.doubleIndex("The appearance of the apple is red"));
//	       System.out.println("Expected: -1");
//	       
//	       search = new LetterSearcher("p");
//	       System.out.println("double at index: " + search.doubleIndex("The appearance of the apple is red"));
//	       System.out.println("Expected: 5");
//	   }
	
}
