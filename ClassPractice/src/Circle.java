public class Circle
{
    private double radius;
//    private double area;

    public Circle(double theRadius)
    {
        radius = theRadius;
//        area = radius * radius * Math.PI;
    }

    public double area()
    {
    	double area = radius * radius * Math.PI;
        return area;
    }
    
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }
}
    