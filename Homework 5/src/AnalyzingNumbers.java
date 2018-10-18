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
//		double inputNumber1 = userInput.nextDouble();
//		double inputNumber2 = userInput.nextDouble();
		
		System.out.println("All Done");
		}
}
