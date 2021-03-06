/**
 * Harvey Shan 
 *
 */
public class SantaCruzInnRoom
{
    private String season;
    private int guests;
    
    //Add your constructor
    /**
     * @param theSeason season 
     *@param numberOfGuests guests
     *
     *constructor 
     */
    public SantaCruzInnRoom(String theSeason, int numberOfGuests)
    {
    	season = theSeason;
    	guests = numberOfGuests;
    	if(!season.equals("high") && !season.equals("low"))
    	{
    		season = "high";
    	}
    	
    	if(guests <= 0)
    	{
    		guests = 4;
    	}

    }
    
    /**
     * Gets the season during which this room is rented
     * @return the season during which this room is rented
     */
    public String getSeason()
    {
    	
        return season;   
    }

    /**
     * Gets the number of people renting the room
     * @return the number of people in the room
     */
    public int getGuests() 
    {
        return guests;
    }
    
    
    /**
     * @param newNumberOfGuests new guests
     * 
     *
     */
    public void setGuests(int newNumberOfGuests)
    {
    	guests = newNumberOfGuests;
    	
    	if(guests <= 0)
    	{
    		guests = 4;
    	}
    }
    
    
    /**
     * 
     *@return the cost
     */
    public double getCost()
    {
    	double cost = 0;
    	
//    	if(season.equals("high") && guests <= 2)
//    	{
//    		cost = 250;
//    	}
//    	else if (season.equals("high") && guests > 2 && guests < 5)
//    	{
//    		cost = 375;
//    	}
//    	else if (season.equals("low") && guests <= 2)
//    	{
//    		cost = 200;
//    	}
//    	else if (season.equals("low") && guests > 2 && guests < 5)
//    	{
//    		cost = 300;
//    	}
//    	if(season.equals("high") || season.equals("low") && guests > 4)
//    	{
//    		int temp = guests - 4;
//    		double tempPrice = temp  * 50.50;
//    		cost = cost + tempPrice;
//    	}
//    	
    	
    	if(season.equals("high"))
    	{
    		if(guests <= 2)
    		{
    			cost = 250;
    		}
    		else if(guests > 2 && guests <= 4)
    		{
    			cost = 375;
    		}
    		
        	if(guests > 4)
        	{
        		int extraPeople = guests - 4;
        		double extraCost = 50.50 * extraPeople;
        		cost = 375 + extraCost;
        	}
    	}
    	
    	else if(season.equals("low"))
    	{
    		if(guests <= 2)
    		{
    			cost = 200;
    		}
    		else if(guests > 2 && guests <= 4)
    		{
    			cost = 300;
    		}
    		
        	if(guests > 4)
        	{
        		int extraPeople = guests - 4;
        		double extraCost = 50.50 * extraPeople;
        		cost = 300 + extraCost;
        	}
    		
    	}

//    	else if(guests > 4)
//    	{
//    		int extraPeople = guests - 4;
//    		double extraCost = 50.50 * extraPeople;
//    		cost = cost + extraCost;
//    	}
    	
//    	
//    	if(season.equals("high") || season.equals("low") && guests > 4)
//    	{
//    		int temp = guests - 4;
//    		double tempPrice = temp  * 50.50;
//    		cost = cost + tempPrice;
//    	}
//    	
    	
    	return cost;
    }
}