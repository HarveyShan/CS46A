import java.util.*;
/**
 * @author Harvey Shan
 *
 */
public class StaticPractice {
	
	/**
	 * @param numbers the number 
	 * @return max the max 
	 */
	public static double max(int[] numbers)
	{
		int max;
		
		if(numbers.length <= 0)
		{
			return Integer.MIN_VALUE;
		}
		
		
		else
		{
			max = numbers[0];
			for(int row: numbers)
			{
				if(row > max)
				{
					max = row;
				}	
			}	
			return max;
		}
	}
	
	/**
	 * @param numbers arraylist
	 * @return max the max
	 */
	public static double max(ArrayList<Integer> numbers)
	{
		double max = 0.0;
		
		if(numbers.size() <= 0)
		{
			return Integer.MIN_VALUE;
		}
		
		else
		{
			max = numbers.get(0);
			for(int temp: numbers)
			{
				if(temp > max)
				{
					max = temp;
				}
			}
		}
		return max;
	}

	
	/**
	 * @param list array
	 * @param target target
	 * @return moreThanOnce more than once 
	 */
	public static boolean containsMultiple(String[] list, String target)
	{
		boolean moreThanOnce = false;
		int counter = 0;
		
		for(int i = 0; i < list.length; i++)
		{
			if(list[i].equals(target))
			{
				counter++;
			}
		}
		if(counter >= 2)
		{
			moreThanOnce = true;
		}
		return moreThanOnce;
	}
	
	
	/**
	 * @param list list
	 * @param target the target
	 * @return contains contain
	 */
	public static boolean containsMultiple(ArrayList<String> list, String target)
	{
		boolean contains = false;
		int counter = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).equals(target))
			{
				counter++;
			}
			
		}
		if(counter >= 2)
		{
			contains = true;
		}
		return contains;
	}
	
//    public static void main(String[] args)
//    {
//        //array max
//        int[] numbers = {5, 6, 9, 8, 6,  7, 6};
//        int[] numbers2 = {-5, -9, -8, -2, -7, -10, -5, -11};
//        int[] numbers3 = {};
//        
//        System.out.println("max array: "+ StaticPractice.max(numbers));
//        System.out.println("Expected: 9.0");        
//        System.out.println("max array: "+ StaticPractice.max(numbers2));
//        System.out.println("Expected: -2.0");        
//        System.out.println("max array: "+ StaticPractice.max(numbers3));
//        System.out.println("Expected: -2.147483648E9");
//               
//        //arraylist max
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(6);
//        list.add(9);
//        list.add(8);
//        list.add(6);
//        list.add(7);
//        list.add(6);
//        
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(-5);
//        list2.add(-9);
//        list2.add(-8);
//        list2.add(-2);
//        list2.add(-7);
//        list2.add(-10);
//        list2.add(-5);
//        list2.add(-11);
//        
//        ArrayList<Integer> list3 = new ArrayList<>();
//        
//        System.out.println("max ArrayList: "
//           + StaticPractice.max(list));
//        System.out.println("Expected: 9.0");
//       
//        System.out.println("max ArrayList: "
//           + StaticPractice.max(list2));
//        System.out.println("Expected: -2.0");
//        
//        System.out.println("max ArrayList: "
//           + StaticPractice.max(list3));
//        System.out.println("Expected: -2.147483648E9");  
//        
//       //array containsMultiple    
//       String[] strings = {"cat", "dog", "horse", "snake", "cat", "parrot",
//           "cat", "pig", "cow", "horse"};
//       System.out.println("multiples array: "
//           + StaticPractice.containsMultiple(strings,"cat"));
//       System.out.println("Expected: true");   
//       System.out.println("multiples array: "
//           + StaticPractice.containsMultiple(strings,"dog"));
//       System.out.println("Expected: false");
//       System.out.println("multiples array: "
//           + StaticPractice.containsMultiple(strings,"hamster"));
//       System.out.println("Expected: false"); 
//       System.out.println("multiples array: "
//           + StaticPractice.containsMultiple(strings,"horse"));
//       System.out.println("Expected: true"); 
//       
//       //array list containsMultiple 
//       ArrayList<String> words = new ArrayList<>();
//       words.add("cat");
//       words.add("dog");        
//       words.add("snake"); 
//       words.add("cat");
//       words.add("parrot");
//       words.add("cat"); 
//       words.add("cow");
//       words.add("pig");
//       words.add("horse");
//       words.add("horse");
//       
//       System.out.println("multiples arraylist: "+ StaticPractice.containsMultiple(words,"cat"));
//       System.out.println("Expected: true");   
//       System.out.println("multiples arraylist: " + StaticPractice.containsMultiple(words,"dog"));
//       System.out.println("Expected: false");
//       System.out.println("multiples arraylist: "
//           + StaticPractice.containsMultiple(words,"hamster"));
//       System.out.println("Expected: false"); 
//       System.out.println("multiples arraylist: "
//           + StaticPractice.containsMultiple(words,"horse"));
//       System.out.println("Expected: true"); 
//    }
//	
}
