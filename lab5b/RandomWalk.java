import java.util.Random;
/**
 * Write a description of class RandomWalk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomWalk
{
    public static void main(String[] args)
    {
        Picture vacuum = new Picture();
        Picture roomba = new Picture("large_roomba.png");
        roomba.translate(200,200);
        roomba.draw();
        for(int i = 1; i <= 20; i++)
        {
            double randomAngle = Math.toRadians(Math.random()*100);
            
            //System.out.println(Math.random());
            
            double distance = 50;
            double dx = distance * Math.cos(randomAngle);
            double dy = distance * Math.sin(randomAngle);
            roomba.translate(dx, dy);
            
            
            Ellipse circle = new Ellipse(vacuum.getX(), vacuum.getY(), 10, 10);
            circle.draw();

            
        }    
           
    }
}
