
/**
 * Write a description of class NoSignViewer here.
 *
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NoSignViewer
{
    public static void main(String[] args)
    {

        Ellipse bigCircle = new Ellipse(20,10, 80, 80);
        bigCircle.setColor(Color.RED);
        bigCircle.fill();
        //bigCircle.draw();

        
        Ellipse smallCircle = new Ellipse(30, 20, 60, 60);
        smallCircle.setColor(Color.WHITE);
        smallCircle.fill();
        //bigCircle.draw();
        
        Line diagonal = new Line(20, 10, 100, 90);
        diagonal.draw();
        
        Rectangle frame = new Rectangle(20, 10, 80, 80);
        frame.draw();
        
    }
}
