import java.util.Scanner;
public class InputApplication {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		//int
		System.out.print("Enter an integer: ");
		int temp = userInput.nextInt();
		System.out.println(temp);
		
		//int
		System.out.print("Enter another integer: ");
		int temp2 = userInput.nextInt();
		System.out.println(temp2);
		
		//double
		System.out.print("Enter a double: ");
		double temp3 = userInput.nextDouble();
		System.out.println(temp3);
		
		// product of two integer 
		double product = temp2 * temp;
		System.out.println(product);
		
		//divide product by the double 
		double dividedProduct = product / temp3;
		System.out.println(dividedProduct);
		
		//int version of divided product 
		int intdivide = (int)product / (int)temp3;
		System.out.println((int) dividedProduct);
	}
}
