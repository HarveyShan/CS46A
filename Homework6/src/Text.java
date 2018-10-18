
/**
 * @author harvey
 *
 */
public class Text
{
	String text;
	
	/**
	 * @param theText text
	 * the constructor 
	 */
	public Text(String theText)
	{
		text = theText;
	}
	
	/**
	 * @return text the text
	 *
	 */
	public String getText()
	{
		return text;
	}
	
	/**
	 * 
	 *@return counter the count 
	 */
	public int getACount()
	{
		String temp = text.toLowerCase();
		int counter = 0;
		for(int i = 0; i < temp.length(); i++)
		{
			if(temp.charAt(i) == 'a')
			{
				counter++;
			}
		}
		return counter;
	}
    /**
     * Determines if the string is a single digit
     * @param ch the String to test
     * @return true if the string contains a single digit else false
     */
    public boolean isDigit(String ch)
    {
        if (ch.length() != 1)
        {
            return false;
        }
        else 
        {
            return Character.isDigit(ch.charAt(0));
        }
    }
    
    /**
     * @return digits 
     *
     */
    
    public String getDigitsOnly()
    {
    	String digitsOnly = text.replaceAll("[^0-9]+","");
    	
    	return digitsOnly;
    }
    
    /**
     * @return firsts 
     *
     */
    public String firsts()
    {
    	if(text.length() == 0)
    	{
    		return text;
    	}
    	String firstOnly = text.substring(0, 1);
    	for(int i = 0; i < text.length(); i++)
    	{
    		if(text.charAt(i) == ' ')
    		{
    			firstOnly = firstOnly + text.substring(i+1, i+2);
    		}
    		
    		else if(text.length() < 2 )
    		{
    			firstOnly = text;
    		}
	
    	}
    	return firstOnly;
    }
    
    
    
    
    
    
    
    
//    public static void main(String[] args)
//    {
//        Text text = new Text("An Apple a day keeps the doctor away");
//        System.out.println("A's: " + text.getACount());
//        System.out.println("Expected: 6");
//        System.out.println("No digits: " + text.getDigitsOnly());
//        System.out.println("Expected: ");
//        System.out.println("firsts : " + text.firsts());
//        System.out.println("Expected: AAadktda");
//        
//        System.out.println(text.getText());
//        System.out.println("Expected: An Apple a day keeps the doctor away");
//        
//        text = new Text("1 2 3 going, going, gone 42");
//        System.out.println("digits: " + text.getDigitsOnly());
//        System.out.println("Expected: 12342");
//        System.out.println("firsts: " + text.firsts());
//        System.out.println("Expected: 123ggg4");
//        
//        text = new Text("");
//        System.out.println("No digits: " + text.getDigitsOnly());
//        System.out.println("Expected: ");
//        System.out.println("firsts: " + text.firsts());
//        System.out.println("Expected: ");
//        
//        text = new Text("x");
//        System.out.println("firsts: " + text.firsts());
//        System.out.println("Expected: x");
//        
//    }
}