import java.util.Scanner;
//Complete this program that reads integers and computes their sum. Use 0 as a sentinel value.
public class SumOfInputs
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int sum = 0;
      int input;
      System.out.print("Enter values, 0 to quit: ");
      do {
    	  input = in.nextInt();
    	  if(input != 0 )
    	  {
    		  sum = sum + input;
    	  }
      }while(input != 0);
      System.out.println("Sum: " + sum);
   }
}