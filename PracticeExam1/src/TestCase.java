
public class TestCase {

	final int QUARTER_VALUE = 25;
    final int DIME_VALUE = 10;
    final int NICKEL_VALUE = 5;


    /**
     * Prints the smallest number of quarters, dimes and nickels 
     * needed to give the specified amount of change
     * @param changeToGive the amount of change to give
     */
    public void printChange(int changeToGive)
    {
        int quartersToGive = changeToGive / QUARTER_VALUE; //line 1
        int remainder = changeToGive % quartersToGive;     //line 2
        int dimesToGive = changeToGive / DIME_VALUE;       //line 3
        remainder = changeToGive - dimesToGive;            //line 4
        int nickelsToGive = changeToGive / NICKEL_VALUE;   //line 5
        int penniesToGive = nickelsToGive % NICKEL_VALUE - 1;   //line 6

        // other code would go here
    }
	
    
    
	public static void main(String[] args) {

		
		int result = 74 / 25;
		System.out.println(result);
	}
}
