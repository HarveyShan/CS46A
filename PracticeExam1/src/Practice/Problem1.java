package Practice;

import java.util.Scanner;

/**
 * Finish this Problem1 class. You will need a main method. 
 * Prompt the user for two numbers entered on the same line 
 * with this prompt:
 *    System.out.print("Enter two numbers separated by a space: ");
 * Get the input and print the largerof the numbers
 * 
 * Prompt the user to enter the name of a U.S. state. 
 * (Remember it could be two words)
 * 
 * Print the state that was entered.
 * 
 * If the name of the state starts with C, print
 * "My favorite is California" 
 * Otherwise print "Try again later"
 */
public class Problem1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num1 =0;
        int num2 = 0;

        System.out.print("Enter two numbers separated by a space: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num1 < num2)
        {
            System.out.println(num1);
        }
        else
        {
            System.out.println(num2);
        }
        
        System.out.print("Enter a US state: ");
        in.nextLine(); //get rid of the new line
        String state = in.nextLine();
        
        if (state.substring(0,1).equals("M"))
        {
            System.out.println("My favorite is Montana");
        }
        else
        {
            System.out.println("Try again later");
        }
            
    }  
}
