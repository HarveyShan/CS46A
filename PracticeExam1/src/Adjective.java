/**
 * Describes an adjective in the English language
 */
public class Adjective
{
    private String adjective;

    /**
     * Constructs an Adjective object with the given wor
     * @param word the adjective
     */
    public Adjective(String word)
    {
        adjective = word;
    }

    /**
     * Set a new word for this Adjective
     * @param newWord the new adjective to set
     */
    public void setAdjective(String newWord)
    {
        adjective = newWord;
    }
    
    /**
     * Gets the word for this Adjective
     * @return the adjective
     */
    public String getAdjective()
    {
        return adjective;
    }
    /**
     * Gets the superlative form of this Adjective
     * @return the superlative form of this Adjective
     */
    public String superlative()
    {
    	String superForm = adjective;
    	
    	if(adjective.equals("good"))
    	{
    		superForm = "better";
    	}
    	
    	else if (adjective.equals("far"))
    	{
    		superForm = "farther";
    	}
    	
    	else if (adjective.substring(adjective.length()-1, adjective.length()).equals("y"))
    	{
    		//simple solution
    		superForm = adjective.replace("y", "ier");
    	}
    	
    	else if (adjective.length() <= 5)
    	{
    		superForm = adjective + "er";
    	}
    	
    	else if (adjective.length() > 5)
    	{
    		superForm = "more " + adjective;
    	}
    	
    	return superForm;
    } 
}