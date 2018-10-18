
public class Pseudocode {
//
//	if the current lego is the smallest lego piece, put it on top, check  the next lego, if it is 
//	smaller than the previous lego switch the position between the current lego and the previous lego
//	, if not put it after the second piece
	public static void main(String[] args) {
		String river = "test";                                   // output:
		System.out.println(river.toUpperCase());  // TEST
		System.out.println(river);                          //  test  <----doesn't keep upper case string
		river = river.toUpperCase();                      // (replaces the string)
		System.out.println(river);                          // TEST
		System.out.println(river);
	}
	
}
