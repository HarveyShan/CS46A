///**
// * Tests the RestaurantHelper class.
// *
// * @author Kathleen O'Brien
// */
//public class RestaurantHelperTester extends RestaurantHelper
//{
//    public static void main(String[] args)
//    {
//        RestaurantHelper helper = new RestaurantHelper(100.0, RestaurantHelper.EXCELLENT_SERVICE);
//        System.out.println("Cost: " + helper.costOfMeal());
//        System.out.println("Expected: 100.0");
//        System.out.println("Excellent: " + helper.qualityOfService());
//        System.out.println("Expected: 3");
//        
//        helper = new RestaurantHelper(20.0, RestaurantHelper.GOOD_SERVICE);
//        System.out.println("Good: " + helper.qualityOfService() + " " + helper.costOfMeal());
//        System.out.println("Expected: 2 20.0");
//        
//        helper = new RestaurantHelper(50.0, RestaurantHelper.FAIR_SERVICE);
//        System.out.println("Fair: " + helper.qualityOfService() + " " + helper.costOfMeal());
//        System.out.println("Expected: 1 50.0");
//        
//        helper = new RestaurantHelper(100.0, RestaurantHelper.POOR_SERVICE);
//        System.out.println("Poor: " + helper.qualityOfService() + " " + helper.costOfMeal());
//        System.out.println("Expected: 0 100.0");
//    }
//}s