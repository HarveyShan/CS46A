import java.util.Scanner;

public class Balloon
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Diameter: ");
      double diameter = in.nextDouble();

      double volume1 = Math.PI * diameter * diameter * diameter / 6;
      
      diameter++;
      
      double volume2 = Math.PI * diameter * diameter * diameter / 6;
      
      double growth = volume2 - volume1;
      
      diameter++;
      
      System.out.printf("Increase: %.0f", growth);
      System.out.println();
      
      double volume3 = Math.PI * diameter * diameter * diameter / 6;
      
      double growth2 = volume3 - volume2;
      
      System.out.printf("Increase: %.0f", growth2);
      System.out.println();
   }
}