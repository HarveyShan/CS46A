import java.util.Scanner;

public class DJIA
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double value=0;
        System.out.print("Enter the change for the day or Q to quit: ");
        
        if(!(scan.hasNextDouble()))
        {
            System.out.println("No values entered");
        }
        int counter = 0;
        double highest = -100;
        int numberOfDaysTraded = 0;
        double sum = 0;
        while(scan.hasNextDouble())
        {
        	
            value = scan.nextDouble();
            if(value < 0)
            {
            	counter++;
            }
            if(value > highest)
            {
            	highest = value;
            }
            
            numberOfDaysTraded++;
            
            sum = sum + value;
            
            System.out.print("Enter net income or Q to quit: ");
        }
        
        if(numberOfDaysTraded > 0)
        {
            System.out.println(counter);
            System.out.println(highest);
            System.out.println(sum / numberOfDaysTraded);
        }
        
        
    }
}