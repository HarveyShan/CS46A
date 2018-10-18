
/**
 * Write a description of class MoveTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoveTester
{
    public static void main(String args[])
    {
        Robot test = new Robot();
        test.moveHorizontally(5);
        test.moveHorizontally(-3);
        //test.getX();
        System.out.println(test.getX());
        System.out.println("Expected: 2");
        
        test.moveVertically(6);
        test.moveVertically(-4);
        System.out.println(test.getY());
        System.out.println("Expected: 2");
        
        test.moveRight();
        System.out.println(test.getX());
    }
}
