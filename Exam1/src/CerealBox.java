
/**
 * @author Harvey 
 *
 */
public class CerealBox {

	private double width;
	private double height;
	private double depth;
	
	/**
	 *  Constructor 
	 *  @param theWidth width
	 *  @param theHeight height
	 *  @param theDepth dep
	 */
	
	public CerealBox(double theWidth, double theHeight, double theDepth)
	{
		width = theWidth;
		height = theHeight;
		depth = theDepth;
	}
	
	/**
	 *  
	 *get width 
	 *@return width
	 */
	public double getWidth()
	{
		return width;
	}
	
	/**
	 *  @param newWidth
	 *set width
	 */
	public void setWidth(double newWidth)
	{
		width = newWidth;
	}
	
	/**
	 *  get volume 
	 * @return volume 
	 */
	public double getVolume()
	{
		double volume = 0;
		
		volume = width * height * depth;
		
		return volume;
	}
	
}
