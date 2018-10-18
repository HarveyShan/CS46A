
/**
 * @author probl
 *
 */

public class Product {

	private double price;
	private String name;
	
	public Product(String theName, double thePrice)
	{
	     price = thePrice;
	     name = theName;
	}
	
	
	/**
	 * @author probl
	 *
	 */
	public String getName()
	{
		return name;
	}
	
	
	/**
	 * @author probl
	 *
	 */
	public double getPrice()
	{
		return price;
	}
	
	
	/**
	 * @author probl
	 *
	 */
	public void reducePrice(double amountToReduce)
	{
		double reducedPrice = price * amountToReduce /100; 
		price =- reducedPrice;
	}
	
	
	/**
	 * @author probl
	 *
	 */
	public void increasePrice(double amountToIncrease)
	{
		double increasedPrice = price * amountToIncrease/100;
		price =- increasedPrice;
	}
	
	public static void main(String[] args) {
		Product thing = new Product("ipad", 100.0);
				
	}
	
}
