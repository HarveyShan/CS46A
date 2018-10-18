import java.util.Scanner;

//Prompt the user to enter their favorite color. Then prompt again for the color of their shirt. Use these prompts:
//
//System.out.print("Enter your favorite color: ");
//System.out.print("Enter the color of your shirt: ");
//
//If the two colors are the same, print "Good choice"
//
//Otherwise, print "You like variety"
//
//Note: The colors may be more than one word.
//
//Next ask the user for two doubles. Use the following prompts:
//
//System.out.print("Enter a double: ");
//System.out.print("Enter a second double: ");
//
//If the second number is not 0, divide the first number by the second number and print the answer.
//
//If the second number is 0, print an error message: "Can not divide by 0"
//
//Only use one scanner
public class InputPlay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your favorite color: ");
		String favColor = input.nextLine();
		
		System.out.print("Enter the color of your shirt: ");
		String colorOfShirt = input.nextLine();
		
		if(favColor.equals(colorOfShirt))
		{
			System.out.println("Good choice");
		}
		else {
			System.out.println("You like variety");
		}
		
		//double
		System.out.print("Enter a double: ");
		double firstD = input.nextDouble();
		System.out.print("Enter a second double: ");
		double secondD = input.nextDouble();
		
		if(secondD != 0)
		{
			double result = firstD / secondD;
			System.out.println(result);
		}
		
		else if (secondD == 0)
		{
			System.out.println("Can not divide by 0");
		}
		
	}
	
}
