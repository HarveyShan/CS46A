public class ChangeGiver
{
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
           int quartersToGive = changeToGive - QUARTER_VALUE; //line 1
           System.out.println(quartersToGive);
           
           
           int remainder = changeToGive % quartersToGive;     //line 2
           System.out.println("remq" + remainder);
           
           
           int dimesToGive = changeToGive / DIME_VALUE;       //line 3
           System.out.println("Dim" + dimesToGive);
           
           
           remainder = remainder - dimesToGive + 1;           //line 4
           System.out.println("remi" +remainder);
           
           
           int nickelsToGive = changeToGive / NICKEL_VALUE;   //line 5
           System.out.println("nickel" + nickelsToGive);
           
           
           int penniesToGive = nickelsToGive % NICKEL_VALUE - 1;   //line 6
           System.out.println("penn" + penniesToGive);

           // code to actually print would go here
       }
       
       public static void main(String[] args) {
    	   ChangeGiver change = new ChangeGiver();
    	   change.printChange(42);
	}
}