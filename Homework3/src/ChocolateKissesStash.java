
/**
 * @author harvey
 *updated for hw 5 
 */

public class ChocolateKissesStash {

	private int maximumCapacity;
	private int currentAmount;
	
	/**
	 * @param theMaxiCapacity the maxi capacity
	 *
	 */
	public ChocolateKissesStash(int theMaxiCapacity)
	{
		maximumCapacity = theMaxiCapacity;
		
		if(maximumCapacity < 0)
		{
			maximumCapacity = 0;
		}
	}
	
	
	/**
	 * get the max capacity 
	 *@return the maxCapacity
	 */
	public int getMaxCapacity()
	{
		if(maximumCapacity < 0)
		{
			maximumCapacity = 0;
		}
		return maximumCapacity;
	}
	
	
	/**
	 * get the current Amount 
	 *@return the current Amount 
	 */
	public int getCurrentAmount()
	{
		return currentAmount;	
	}
	
	
	/**
	 * @param amountToEat the amount to eat 
	 * update the current amount 
	 */
	public void eat(int amountToEat)
	{
		if(amountToEat > 0)
		{
//			if(amountToEat > currentAmount)
//			{
//				currentAmount = 0;
//			}
			currentAmount = currentAmount - amountToEat;
		}
		
		if(amountToEat > currentAmount)
		{
			currentAmount = 0;
		}
	}
	
	
	/**
	 * @param amountToBuy the amount to buy  
	 * update the current amount 
	 */
	public void buyMore(int amountToBuy)
	{
		if(amountToBuy > 0)
		{
			if(currentAmount + amountToBuy > maximumCapacity)
			{
				currentAmount = maximumCapacity;
			}	
			else {
				currentAmount = currentAmount + amountToBuy;
			}
		}
		
//		if(currentAmount + amountToBuy > maximumCapacity)
//		{
//			currentAmount = maximumCapacity;
//		}	
	}
	
}
