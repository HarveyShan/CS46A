import java.util.ArrayList;
public class RectangleManager
{
    private ArrayList<Rectangle> boxes;
    public RectangleManager()
    {
        boxes = new ArrayList<Rectangle>();
    }

    public void add(Rectangle r)
    {
        boxes.add(r);
    }
    
    public Rectangle widest()
    {
        
        if(boxes.size() == 0)
        {
            return null;
        }
        Rectangle widest = boxes.get(0);
        for(int i = 0; i < boxes.size(); i++)
        {
            if(boxes.get(i).getWidth() > widest.getWidth())
            {
                widest = boxes.get(i);
            }
        }
        
        return widest;
    }
    
    
    public String toString()
    {
        return boxes.toString();
    }
}