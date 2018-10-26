import java.util.Scanner;

public class FirstAndLast
{
   public static void main(String[] args)
   {
      final int LENGTH = 100;
      double[] prices = new double[LENGTH];

      int numberOfPrices = 0;
      Scanner in = new Scanner(System.in);
      while (in.hasNextDouble())
      {
         if (numberOfPrices < prices.length)
         {
            prices[numberOfPrices] = in.nextDouble();
            numberOfPrices++;
         }
      }

      double sum = prices[0] + prices[numberOfPrices-1];
      System.out.printf("Sum of first and last: %.2f\n", sum);
   }
}