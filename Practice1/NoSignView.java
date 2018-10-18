
/**
 * Write a description of class NoSignView here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NoSignView
{
    public static void main(String[] args)
    {
        Ellipse bigCircle = new Ellipse(20,10, 80, 80);
        bigCircle.setColor(Color.RED);
        bigCircle.fill();
        
        Ellipse smallCircle = new Ellipse(30, 20, 60, 60);
        smallCircle.setColor(Color.WHITE);
        smallCircle.fill();
        
        Rectangle box = new Rectangle(20,10,80,80);
        box.draw();
        
        Line diag = new Line(20, 10 , 100, 90);
        diag.draw();
    }
}
