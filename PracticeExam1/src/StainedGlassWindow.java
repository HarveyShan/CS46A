
public class StainedGlassWindow {
	private double width;
	private double height;
	private double area;
	
	public StainedGlassWindow(double theWidth, double theHeight)
	{
		height = theHeight;
		width = theWidth;
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
		double radius = 0.5 * width;
		double windowArea = height * width;
		double circleArea = radius * radius* Math.PI * 0.5;
		area = windowArea + circleArea;
		return area;
	}
}