
/**
 * Write a description of class LineViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LineViewer
{
    public static void main(String[] args)
    {
        int x = 20;
        int y = 25;
        for(int i = 0; i < 6; i++)
        {
            Line line = new Line(x, y , x + 100, y);
            line.setColor(Color.BLUE);
            line.draw();
            y = y + 10;
        }
    }
}
