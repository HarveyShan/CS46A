
/**
 * Write a description of class Liner2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Liner2
{
    private int x;
    private int y;
    private int n;
    
    public Liner2(int x, int y, int n)
    {
        this.x = x;
        this.y = y;
        this.n = n;
    }
    //5 shorter, 7 apart
    public void draw()
    {
        int y2 = n*10;
        for(int i = 0; i < n; i++)
        {
           Line firstLine = new Line(x,y,x,y2); 
           firstLine.draw();
           x = x + 7;
           y2 -= 5;
        }
    }
}
