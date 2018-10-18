public class CircleTester
{
    public static void main(String[] args)
    {
        Circle c = new Circle(1);
        System.out.println(c.area());
        System.out.println("Expected: 3.141592653589793");
        
        c.setRadius(10);
        System.out.println(c.area());
        System.out.println("Expected: 314.1592653589793");
    }
}