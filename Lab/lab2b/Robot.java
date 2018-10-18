public class Robot
{
    private int x;
    private int y;
    private Picture pic;
    
    
    public Robot()
    {
        //x = theX;
        //y = theY;
        moveHorizontally(0);
        moveVertically(0);
        pic = new Picture("myrobot.jpeg");
        pic.draw();
    }
    
    
    public void moveRight()
    {
        moveHorizontally(1);
    }         
    
    public void moveDown()
    {
        moveVertically(1);
    }
    
    /*
     * this method takes in howmany times you move horizonally, and move it 
     * @param howManyTime how many width 
     * 
     */
    public void moveHorizontally(int howManyTimes)
    {
        pic.translate(howManyTimes * pic.getWidth(), 0);
        x = x + howManyTimes;
    }
    
        /*
     * this method takes in howmany times you move vertically, and move it 
     * @param howManyTime how many height
     * 
     */
    public void moveVertically(int howManyTimes)
    {
        pic.translate(0, howManyTimes * pic.getHeight());
        y = y + howManyTimes;
    }
    
        /**
       Gets the horizontal grid location of this robot.
       @return the horizontal grid location
    */        
    public int getX()
    {
       return pic.getX() / pic.getWidth();  
    }
    
    public int getY()
    {
       return pic.getY() / pic.getHeight();  
    }
}
