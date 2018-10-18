/**
 * A tester for the SnowGlobe class
 * @author Kathleen O'Brien
 */
public class SnowGlobeTester extends SnowGlobe
{
    public static void main(String[] args)
    {
        SnowGlobe globe = new SnowGlobe();
        System.out.println(globe.getVolume());
        System.out.println("Expected: 4188.790204786391");
        System.out.println(globe.getSnowVolume());
        System.out.println("Expected: 837.7580409572782");
        System.out.println(globe.getSnowCost());
        System.out.println("Expected: 1047.1975511965977");
        
        globe.setRadius(0.0);
        System.out.println(globe.getVolume());
        System.out.println("Expected: 4188.790204786391");
        
        globe.setRadius(-5.0);
        System.out.println(globe.getVolume());
        System.out.println("Expected: 4188.790204786391");
        
        globe = new SnowGlobe(-16.0);
        System.out.println(globe.getVolume());
        System.out.println("Expected: 4188.790204786391");
        
        globe.setRadius(100);
        System.out.println(globe.getVolume());
        System.out.println("Expected: 523598.7755982988");
        
        
    }
}