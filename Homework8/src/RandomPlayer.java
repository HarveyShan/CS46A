import java.util.*;
/**
 * @author harvey 
 *
 */



public class RandomPlayer {
	
	private int upperBound;
	private Random generator;
	private int numberOfIterations;
	
	
	/**
	 * constructor 
	 * @param theGenerator generator	
	 * @param theUpperBound upper bound 
	 * @param theNumberOfIterations iterations
	 */
	public RandomPlayer(Random theGenerator, int theUpperBound, int theNumberOfIterations)
	{
		generator = theGenerator;
		upperBound = theUpperBound;
		numberOfIterations = theNumberOfIterations;
	}
	
	
	
	/**
	 * generates the specified number of random ints and gets the average of the values generarated.
	 * @return average the average 
	 * use a loop, get all the generated values, store in sum , (under iteration) then divided the sum by the iterations.
 	 */
	public double average()
	{
		double average = 0.0;
		double sum = 0;
//		ArrayList<Integer> randomGenerates = new ArrayList<Integer>();
		
		if(numberOfIterations == 0)
		{
			return 0;
		}
		
		for(int i = 0; i < numberOfIterations; i++)
		{
			sum = sum + generator.nextInt(upperBound);
		}
		
		
		average = sum / numberOfIterations;
		return average;
	}
	
	
	
	
	/**
	 * generates the specified number of random ints and counts how many are greater than the upperBound / 2. 
	 * You would expect it to be about half the time, but is it? Do not calculate the average in this method call average()
	 * generate according to iterations, every something is greater than bar(upperBound / 2), counter ++
	 * 
	 * @return counter the counter
	 */
	public int countGreaterThanMidValue()
	{
		int counter = 0;
		double bar = upperBound / 2;
		
		for(int i = 0; i < numberOfIterations; i++)
		{
			if(generator.nextInt(upperBound) > bar)
			{
				counter++;
			}
		}
		
		return counter;
	}
	
	
	
	/**
	 * make an arrayList, store all randoms into the array list, loop through it again, 
	 * @param value the value 
	 * @return count the count 
	 */
	public int count(int value)
	{
		int counter = 0;
		
		ArrayList<Integer>randoms = new ArrayList<Integer>();
		
		for(int i = 0; i < numberOfIterations; i++)
		{
			randoms.add(generator.nextInt(upperBound));
		}
		
		Collections.sort(randoms);;	
		
		for(int i = 0; i < randoms.size(); i++)
		{
			if(randoms.get(i) == value)
			{
				counter++;
			}
		}
		return counter;
	}
	
	
	/**
	 * @param newNumberOfIterations the number of iteration 
	 */
	public void setIterations( int newNumberOfIterations)
	{
		numberOfIterations = newNumberOfIterations;
	}
	
//	public static void main(String[] args)
//    {
//        RandomPlayer random = new RandomPlayer(new Random(12345678), 10, 100);
//        System.out.println("average: " + random.average()); 
//        System.out.println("Expected: 4.95");
//        System.out.println("above average: " + random.countGreaterThanMidValue()); 
//        System.out.println("Expected: 34");
//        System.out.println("count: " + random.count(5)); 
//        System.out.println("Expected: 10");
//        System.out.println("count: " + random.count(9)); 
//        System.out.println("Expected: 8");
//        
//        random.setIterations(10);
//        System.out.println("average: " + random.average());
//        System.out.println("Expected: 4.8");
//        System.out.println("above average: " + random.countGreaterThanMidValue()); 
//        System.out.println("Expected: 3");
//        
//        random = new RandomPlayer(new Random(87654321), 100, 1000);
//        System.out.println("average: " + random.average());
//        System.out.println("Expected: 48.927");
//        System.out.println("above average: " + random.countGreaterThanMidValue()); 
//        System.out.println("Expected: 507");
//        System.out.println("count: " + random.count(90)); 
//        System.out.println("Expected: 11");
//        
//        random.setIterations(0);
//        System.out.println("No iterations: " + random.average()); 
//        System.out.println("Expected: 0.0");
//    }
	
	
	
}
