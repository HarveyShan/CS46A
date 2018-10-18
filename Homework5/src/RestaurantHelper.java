
/**
 * @author Harvey
 *
 */

public class RestaurantHelper {

	public static final int EXCELLENT_SERVICE = 3;
	public static final int GOOD_SERVICE = 2;
	public static final int FAIR_SERVICE = 1;
	public static final int POOR_SERVICE = 0;
	
	public static final double EXCELLENT_TIP = .25;
	public static final double GOOD_TIP = .20;
	public static final double FAIR_TIP = .10;
	public static final double POOR_TIP = .05;
	
	private double mealCost;
	private int serviceQuality;
//	private double tip;
//	private double tax;
	
	
	/**
	 * @param theMealCost the meal cost 
	 * @param theServiceQuality the service quality
	 * 
	 *the constructor for rest-U
	 */
	public RestaurantHelper(double theMealCost, int theServiceQuality)
	{
		mealCost = theMealCost;
		serviceQuality = theServiceQuality;
		if(serviceQuality > 3 )
		{
			serviceQuality = EXCELLENT_SERVICE;
		}
		
		else if (serviceQuality < 0)
		{
			serviceQuality = POOR_SERVICE;
		}
		
	}
	
    /**
     *  Gets the quality of service
     *  @return the quality of the service
     */
    public int qualityOfService()
    {
        return serviceQuality;
    }
    
    /**
     * Gets the base cost of the meal (no tip or tax) 
     * @return the cost of the meal before tax and tip
     */
    public double costOfMeal()
    {
        return mealCost;
    }
    

	/**
	 * tip method 
	 * @return the tip 
	 */
    public double tip()
    {
    	double tip = 0;
    	if(serviceQuality == EXCELLENT_SERVICE)
    	{
    		tip = mealCost * EXCELLENT_TIP;
    	}
    	
    	else if(serviceQuality == GOOD_SERVICE)
    	{
    		tip = mealCost * GOOD_TIP;
    	}
    	
    	else if(serviceQuality == FAIR_SERVICE)
    	{
    		tip = mealCost * FAIR_TIP;
    	}
    	
    	else if(serviceQuality == POOR_SERVICE)
    	{
    		tip = mealCost * POOR_TIP;
    	}
    	
    	return tip;
    }
    
	/**
	 * tax method
	 * @return the tax
	 */
    public double tax()
    {
    	double tax;
    	tax = mealCost * 0.09;
    	return tax;
    }
    
	/**
	 * totalCost method 
	 *@return total cost 
	 */
    public 	double totalCost()
    {
    	double totalCost = mealCost + tip() + tax();
    	return totalCost;
    }
}
