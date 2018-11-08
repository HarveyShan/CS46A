
/**
 * Write a description of class Gallery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gallery
{
    private Picture[] gallery;
    public Gallery(Picture[] theGallery)
    {
        gallery = theGallery;
    }
    
    public int sumHeight()
    {
        int sum = 0;
        
        for(int i = 0; i < gallery.length; i++)
        {
            sum = sum + gallery[i].getHeight();
        }
        return sum;
    }
}
