
/**
 * Write a description of class Snowman here.
 *
 * @author (Harvey Shan)
 * @version (a version number or a date)
 */
public class Snowman
{
    private int x;
    private int y; 
    
     /**
     * @param theX the x coord
     * @param theY the y coord
     * this method creates a new snowman
     */
    public Snowman(int theX, int theY)
    {
        x = theX;
        y = theY;
    }
    
    
    /**
     * 
     *  the method name is poor naming convention:<
     * this method draw the snowman
     * 
     */
    public void draw ()
    {
        Rectangle hatbox = new Rectangle(x, y, 20, 20);
        hatbox.draw();
        hatbox.fill();
        Line brim = new Line(x-10, y+20, x+30, y+20);
        brim.draw();
        Ellipse smallCircle = new Ellipse(x, y+20, 20, 20);
        smallCircle.draw();
        Ellipse middleCircle = new Ellipse(x-10, y+40, 40, 40);
        middleCircle.draw();
        Ellipse bottomCircle = new Ellipse(x-20, y+80, 60, 60);
        bottomCircle.draw();
    }
}
