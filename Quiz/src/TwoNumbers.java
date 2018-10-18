import java.util.Scanner;


//Complete this program, prompting the user to to enter two positive numbers a and b so that a is less than b.

public class TwoNumbers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      int a = 0;
      int b = 0;
      // Keep prompting the user until the input is correct
      do {
      System.out.println("Enter two positive integers, the first smaller than the second.");
      System.out.print("First: ");
      a = in.nextInt();
      System.out.print("Second: ");
      b = in.nextInt();
      } while((a <= 0) || (a > b));
      System.out.println("You entered " + a + "and " + b);
   }
}