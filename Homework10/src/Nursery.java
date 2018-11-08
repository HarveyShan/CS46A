import java.util.*;

/**
 * @author Harvey
 *
 */
public class Nursery {
	private ArrayList<Plant> list;
	
	/**
	 * cons
	 */
	public Nursery()
	{
		ArrayList<Plant> theList = new ArrayList<Plant>();
		list = theList;
	}
	
	/**
	 * @param newPlant the new plant
	 */
	public void add(Plant newPlant)
	{
		list.add(newPlant);
	}
	
	/**
	 * @return average the average
	 */
	public double average()
	{
		double average = 0.0; 
		double sum = 0.0;
		if(list.size() == 0)
		{
			return average;
		}
		
		else 
		{
			for(int i = 0; i < list.size(); i++)
			{
				sum = sum + list.get(i).getPrice();
			}
		}
		average = sum / list.size();
		return average;
	}
	
	
	/**
	 * @param otherNursery other nursery
	 * @return match boolean 
	 */
	public boolean sameContents(Nursery otherNursery)
	{
		if(list == null && otherNursery.list == null)
		{
			return true;
		}
		
		if(list.size() != otherNursery.list.size())
		{
			return false;
		}
		
//		if(list.equals(otherNursery.list))
//		{
//			same = true;
//		}
		
//		int counter = 0;
		
//        for ( Plant everyPlant: list)
//        {
//            boolean otherContains = false;
//            for (Plant everyPlant1: otherNursery.list)
//            {
//                if (everyPlant.getName() == everyPlant1.getName())
//                {
//                    otherContains = true;
//                }
//            }
//            if (otherContains == false)
//            {
//                same = false;
//            }
//        }   
        
		boolean match = true;
		
        for(int i = 0; i < list.size(); i++)
        {	
        	boolean otherContains = false;
        	for(int j = 0; j < otherNursery.list.size(); j++)
        	{
        		if(list.get(i).getName() == otherNursery.list.get(j).getName())
        		{
        			otherContains = true;
        		}
        	}
        	if(otherContains = false)
        	{
        		match = false;
        	}
        }
		
		return match;
		
	}
	
	/**
	 * @return nameOfPlants the name of plants
	 */
	public ArrayList<String> plantList()
	{
		ArrayList<String> nameOfPlants = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++)
		{
			nameOfPlants.add(list.get(i).getName());
		}
		
		
		return nameOfPlants;
	}
}
