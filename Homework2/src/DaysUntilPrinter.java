public class DaysUntilPrinter extends Day
{
    public static void main(String[] args)
    {
        //today
    	Day today = new Day();
    	System.out.println("Today is " + today.toString());
    	
    	//print day gap between now and thanksGiving 
    	Day thanksGivingDay = new Day(2018, 11 , 22);
    	int dayGapForThanksGiving = thanksGivingDay.daysFrom(today);
    	System.out.println(dayGapForThanksGiving);
    	
    	//print 30 days from now 
    	Day thisDay = new Day();
    	thisDay.addDays(30);
//    	System.out.println(thisDay);
    
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
    }
}