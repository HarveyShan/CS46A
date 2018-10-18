
public class DayPrinter {
	
	public static void main(String[] args) {
		
		Day today = new Day();
		
		today.getDayOfMonth();
		System.out.println(today);
		
//		today.addDays(10);
//		System.out.println(today);
		
		Day finalDate = new Day(2018, 12, 13);
		int time = today.daysFrom(finalDate);
		
		
		System.out.println(time);
	}
}
