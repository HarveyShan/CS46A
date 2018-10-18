
public class Cube {
 
	private double side;
	
	public Cube(double theSide)
	{
		side = theSide;
		
	}
	
	public double getSide()
	{
		return side;
	}
	
	public void setSide(double newSide)
	{
		side = newSide;
	}
	
	public double getSurfaceArea()
	{
		double surfaceArea = 6 * side * side;
		
		return surfaceArea;
	}
}





