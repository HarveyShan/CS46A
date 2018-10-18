package Practice;
import java.util.Scanner;

public class FictionalCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Who is favorite fictional character? ");
		String favChar = input.nextLine();
//		System.out.println(favChar);
		
		//length
		int lengthFav = favChar.length();
		System.out.println(lengthFav);
		
		//first two 
		String firstTwo = favChar.substring(0, 2);
		System.out.println(firstTwo);
		
		//replace A 
		String replaceA = favChar.replace("a", "A");
		String replaceSandA = replaceA.replace("s", "$");
		
		//changed 
		System.out.println(replaceSandA);
		System.out.println(favChar);
	}
}
