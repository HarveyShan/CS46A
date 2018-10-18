/**
 * Tester for the StainedGlassWindow class
 */

public class StainedGlassWindowTester 
{
   public static void main(String[] args)
   {
       double width = 1.4; 
       double height = 4.2; 
       StainedGlassWindow window1 = new StainedGlassWindow(width, height);
       System.out.printf("%.2f\n",window1.getArea());
       System.out.println("Expected: 6.65");
       
       width = 3;
       height = 10;
       StainedGlassWindow window2 = new StainedGlassWindow(width, height);
       System.out.printf("%.2f\n",window2.getArea());
       System.out.println("Expected: 33.53");
       
       window1.setWidth(10.0);
       System.out.printf("%.2f\n",window1.getArea());
       System.out.println("Expected: 81.27");
       
       System.out.printf("%.2f\n",window1.getWidth());
       System.out.println("Expected: 10.00");
   }
}