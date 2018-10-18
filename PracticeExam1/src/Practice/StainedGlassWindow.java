package Practice;





public class StainedGlassWindow {

	private double width;
	private double height;
	
	public StainedGlassWindow(double theWidth, double theHeight)
	{
		width = theWidth;
		height = theHeight;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double newWidth)
	{
		width = newWidth;
	}
	
	public double getArea()
	{
		double area = 0;
		double radius = 0.5 * width;
		double areaRec = width * height;
		double simiCircle = 0.5 * Math.PI * radius * radius;
		area = areaRec + simiCircle;
		
		
		return area;
	}
	
	
}

