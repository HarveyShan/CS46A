
/**
 * Write a description of class LogViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LogViewer
{
    public static void main(String[] args)
    {
        Ellipse redCircle = new Ellipse(50, 70, 100, 100);
        redCircle.setColor(Color.RED);
        redCircle.fill();
        
        Ellipse blueCircle = new Ellipse(150, 70, 100, 100);
        blueCircle.setColor(Color.BLUE);
        blueCircle.fill();
        
        Ellipse yellowCircle = new Ellipse(250, 70, 100, 100);
        yellowCircle.setColor(Color.YELLOW);
        yellowCircle.fill();
        
        Line center = new Line(100, 120, 300, 120);
        center.draw();
    }
}
