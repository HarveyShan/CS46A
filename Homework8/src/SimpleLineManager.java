import java.util.ArrayList;
/**
 * Manages a collection of SimpleLine objects
 *
 * @author Harvey SHan
 */
public class SimpleLineManager 
{
    private ArrayList<SimpleLine>lines = new ArrayList<SimpleLine>();
    
    /**
     * constructor
     */
    public SimpleLineManager()
    {
        ArrayList<SimpleLine> theLines = new ArrayList<SimpleLine>();
        lines = theLines;
    }
    
    
    /**
     * @param line the line
     * add method 
     */
    public void add(SimpleLine line)
    {
        lines.add(line);
    }
    
    
    /**
     * @param index1 index 1
     * @param index2 index 2 
     * 
     * have a temp value to copy the first index, then replace the first index with the second index, second index gets replaced by the tmep
     */
    public void swap(int index1, int index2)
    {
    	if(index1 < lines.size() && index2 < lines.size() && index1 >= 0 && index2 >= 0 && index1 != index2)
    	{
    		SimpleLine temp = lines.get(index1);
    		lines.set(index1, lines.get(index2));
    		lines.set(index2, temp);
    	}
    }
    
    
    
    /**
     * @param theLine the line 
     * @return length the length
     */
    public double getLength(SimpleLine theLine)
    {
    	double length = 0;
    	length = Math.sqrt(Math.pow((theLine.getX2()- theLine.getX1()), 2) + Math.pow((theLine.getY2() - theLine.getY1()), 2));
    	return length;
    }
    
    
    
    
    /**
     * loop through the entire arraylist then find the shortest one
     * @return shortest Line 
     */
    public double shortest()
    {
    	double shortest = 0;
    	if(lines.size() == 0)
    	{
    		return shortest;
    	}
    	
    	shortest = getLength(lines.get(0));
    	
    	for(int i = 1; i < lines.size(); i++)
    	{
    		if(shortest > getLength(lines.get(i)))
    		{
    			shortest = getLength(lines.get(i));
    		}
    	}
    	
    	return shortest;
    }
    
    
    
    
    
//    public static void main(String[] args)
//    {
//        SimpleLineManager manager = new SimpleLineManager();
//        manager.add(new SimpleLine(0, 0, 30, 40));   
//        manager.add(new SimpleLine(20, 30, 90, 100)); 
//        manager.add(new SimpleLine(10, 20, 60, 70));  
//        manager.add(new SimpleLine(15, 20, 80, 100));  
//
//        System.out.println(manager);
//        
//        //test shortest
//        System.out.println("Shortest: " + manager.shortest());
//        System.out.println("Expected: 50.0");
//        
//        manager.add(new SimpleLine(0, 0, 3, 4));   
//        System.out.println("Shortest: " + manager.shortest());
//        System.out.println("Expected: 5.0");
//        
//        //test swap
//        manager.swap(0, 3);
//        System.out.println(manager);
//        System.out.println("Expected: [SimpleLine[x1=15,y1=20,x2=80,y2=100], SimpleLine[x1=20,y1=30,x2=90,y2=100], SimpleLine[x1=10,y1=20,x2=60,y2=70], SimpleLine[x1=0,y1=0,x2=30,y2=40], SimpleLine[x1=0,y1=0,x2=3,y2=4]]");
//        
//        //swap bad index. Should have no effect
//        manager.swap(-1, 1);
//        manager.swap(2, -1);
//        manager.swap(1, 5);
//        manager.swap(5, 2);
//        System.out.println(manager);
//        System.out.println("Expected: [SimpleLine[x1=15,y1=20,x2=80,y2=100], SimpleLine[x1=20,y1=30,x2=90,y2=100], SimpleLine[x1=10,y1=20,x2=60,y2=70], SimpleLine[x1=0,y1=0,x2=30,y2=40], SimpleLine[x1=0,y1=0,x2=3,y2=4]]");
//        
//        //test with empty object
//        manager = new SimpleLineManager();
//        manager.swap(1, 3);
//        System.out.println(manager);
//        System.out.println("Expected: []");
//        
//        System.out.println("Shortest: " + manager.shortest());
//        System.out.println("Expected: 0.0");      
//    }
    @Override
    public String toString()
    {
        return lines.toString();
    }
}