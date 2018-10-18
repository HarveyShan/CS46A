import java.util.Scanner;

public class AnalyzingNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Enter two doubles (like this: 41.7 -22.5): ");
		double firstInput = userInput.nextDouble();
		double secondInput = userInput.nextDouble();
		
		if(secondInput > 100)
		{
			System.out.println("The second number is greater than 100");
		}
		
		if(firstInput == (int)firstInput)
		{
			System.out.println("The first number is an integer");
		}
		
		else if (firstInput != (int)firstInput)
		{
			System.out.println("The first number is an not an integer");
		}
		
		if(firstInput == secondInput)
		{
			System.out.println("The numbers are equal");
		}
		
		if(firstInput > secondInput)
		{
			System.out.println("The first number is larger");
		}
		
		if(firstInput < secondInput)
		{
			System.out.println("The second number is larger");
		}
		
		if(firstInput > 0 && secondInput > 0 || firstInput < 0 && secondInput < 0)
		{
			System.out.println( "The numbers have the same sign");
		}
		
		if(firstInput > 0 && secondInput < 0 || firstInput < 0 && secondInput > 0)
		{
			System.out.println("The numbers have different signs");
		}
		
//		double inputNumber1 = userInput.nextDouble();
//		double inputNumber2 = userInput.nextDouble();
//		
//		System.out.println("All Done");
		}
}
