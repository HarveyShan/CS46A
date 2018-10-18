import java.util.Scanner;

public class StringStuff {
	
	public static void main(String[] args) {
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter your full name: "); 
		String enteredName = userInput.nextLine();
		//print the entire name 
//		System.out.println(enteredName);
		
		//print the first letter 
		System.out.println(enteredName.substring(0, 1));
		
		//print the last letter
		System.out.println(enteredName.substring(enteredName.length()-1, enteredName.length()));
		
		//print first name
		int firstSpace = enteredName.indexOf(" ");
		System.out.println(enteredName.substring(0, firstSpace));
		
		//print the rest of the name 
		System.out.println(enteredName.substring(firstSpace + 1, enteredName.length()));
		
		//start from 2
		System.out.println(enteredName.substring(2, 4));
		
		}
}
