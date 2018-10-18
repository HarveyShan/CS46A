import java.util.Scanner;
public class FictionalCharacter {
//	An application has a main method: public static void main(String[] args)
//
//	Use this exact prompt:
//
//	System.out.print("Who is favorite fictional character? ");
//
//	Then do the following
//
//	Print the length of the string
//	Print the first two letters of the name. You can assume the name is at least 2 characters long
//	In the original string, replace lowercase "a" with uppercase "A" and replace "s" with "$". Do not change the original word
//	Print the changed string
//	Print the original string
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Who is favorite fictional character? ");
		String userInput = input.nextLine();

		
		int lengthOfString = userInput.length();
		System.out.println(lengthOfString);
		
		//String userInput = input.nextLine();
		String firstTwoLetters = userInput.substring(0, 2);
		System.out.println(firstTwoLetters);
		
		String firstChange = userInput.replace('a', 'A');
		String secondChange = userInput.replace('s', '$');
		System.out.println(secondChange);
		
		System.out.println(userInput);
	}
}
