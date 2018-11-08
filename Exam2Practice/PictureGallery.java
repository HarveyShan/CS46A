import java.util.ArrayList;
/**
 * Write a description of class PictureGallery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PictureGallery
{
    private ArrayList<Picture> gallery;
    
    public PictureGallery()
    {
        gallery = new ArrayList<Picture>();
    }
    
    public void add(Picture p)
    {
        gallery.add(p);
    }
    
    public Picture shortest()
    {
        Picture theShortest = gallery.get(0);
        for(int i = 0; i < gallery.size(); i++)
        {
            if(gallery.get(i).getHeight() < theShortest.getHeight())
            {
                theShortest = gallery.get(i);
            }
        }
        
        return theShortest;
    }
    
}
