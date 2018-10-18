
/**
 * @author harveyShan
 * updated for hw 5b
 * 
 */
public class SnowGlobe {

	private double radius;
	private double volume;
	private double snowVolume;
	public static double DEFAULT_RADIUS = 10;
	public static double MAX_RADIUS = 50;

	/**
	 * no param constructor 
	 *
	 */
	public SnowGlobe()
	{
//		radius = 10;
		if (radius <= 10)
		{
			radius = DEFAULT_RADIUS;
		}
		
		else if (radius >= 50)
		{
			radius = MAX_RADIUS;
		}
		
	}
	
	
	/**
	 * one param constructor 
	 * @param theRadius input radius
	 */
	public SnowGlobe(double theRadius)
	{
		radius = theRadius;
		if (theRadius <= 10)
		{
			theRadius = DEFAULT_RADIUS;
		}
		
		else if (theRadius >= 50)
		{
			theRadius = MAX_RADIUS;
		}
		radius = theRadius;
	}
	
	/**
	 * set the radius 
	 * @param newRadius input new radius 
	 */
	public void setRadius(double newRadius)
	{
		if (newRadius <= 10)
		{
			newRadius = DEFAULT_RADIUS;
		}
		
		else if (newRadius >= 50)
		{
			newRadius = MAX_RADIUS;
		}
		radius = newRadius;
		
	}
	
	
	/**
	 * get the radius 
	 * @return return the radius 
	 */
	public double getRadius()
	{
		return radius;
	}
	
	
	/**
	 * get volume 
	 * @return the volume
	 */
	public double getVolume()
	{
		volume = (double) 4/3 * Math.PI * radius * radius * radius;
		return volume;
	}
	
	/**
	 * get the snow volume  
	 * @return return the snow volume 
	 */
	public double getSnowVolume()
	{
		snowVolume = volume * 0.2;
		return snowVolume;
	}
	
	
	/**
	 * get the snow cost
	 * @return return the snow cost
	 */
	public double getSnowCost()
	{
		double snowCost = snowVolume * 1.25;
		return snowCost;
	}
}
