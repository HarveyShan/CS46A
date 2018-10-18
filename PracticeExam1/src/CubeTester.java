/**
 * Test for the Cube class methods
 */
public class CubeTester
{
    public static void main(String[] args)
    {
        Cube block = new Cube(10.0);
        System.out.println("Surface Area: " + block.getSurfaceArea());
        System.out.println("Expected: 600.0");
        
        block.setSide(5.1);
        System.out.println("Surface Area: " + block.getSurfaceArea());
        System.out.println("Expected: 156.06");
        
        System.out.println("Side: " + block.getSide());
        System.out.println("Expected: 5.1");
        
        block = new Cube(2.0);
        System.out.println("Surface Area: " + block.getSurfaceArea());
        System.out.println("Expected: 24.0");
        
        System.out.println("Side: " + block.getSide());
        System.out.println("Expected: 2.0");
        
    }
}