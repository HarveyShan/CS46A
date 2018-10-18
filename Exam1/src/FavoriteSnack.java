import java.util.Scanner;

public class FavoriteSnack {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your favorite snack? ");
		
		String favSnack = input.nextLine();
		int length = favSnack.length();
		System.out.println(length);
		
		String lastTwo = favSnack.substring(favSnack.length()-2, favSnack.length());
		System.out.println(lastTwo);
		
		String replaceOne = favSnack.replace("c", "[");
		String secondOne = favSnack.replace("o", "0");
		
		System.out.println(favSnack);
		System.out.println(secondOne);
	}
}
