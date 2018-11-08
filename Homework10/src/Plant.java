
/**
 * @author harvey
 *
 */
public class Plant {

	private String name;
	private double price;
	
	
	/**
	 * @param theName the name 
	 * @param thePrice the price
	 */
	public Plant(String theName, double thePrice)
	{
		name = theName;
		price = thePrice;
	}
	
	
	/**
	 * @return name return name 
	 */
	public String getName()
	{
		return name;
	}
	
	
	/**
	 * @return price the price
	 */
	public double getPrice()
	{
		return price;
	}
	
	
	/**
	 * @param newName the new name 
	 */
	public void setName(String newName)
	{
		name = newName;
	}
	
	
	/**
	 * @param newPrice nww price
	 */
	public void setPrice(double newPrice)
	{
		price = newPrice;
	}
	
}
