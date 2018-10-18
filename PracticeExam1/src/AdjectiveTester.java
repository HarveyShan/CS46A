public class AdjectiveTester
{
   public static void main(String[] args)
   {
       Adjective word = new Adjective("anxious");
       System.out.println(word.superlative());
       System.out.println("Expected: most anxious");
       
       word.setAdjective("beautiful");
       System.out.println(word.superlative());
       System.out.println("Expected: most beautiful");
       
       word.setAdjective("good");
       System.out.println(word.superlative());
       System.out.println("Expected: best");
       
       word.setAdjective("happy");
       System.out.println(word.superlative());
       System.out.println("Expected: happiest");
       
       word.setAdjective("easy");
       System.out.println(word.superlative());
       System.out.println("Expected: easiest");
       
       word.setAdjective("bad");
       System.out.println(word.superlative());
       System.out.println("Expected: worst");
       
       word.setAdjective("tall");
       System.out.println(word.superlative());
       System.out.println("Expected: tallest");
       
       word.setAdjective("small");
       System.out.println(word.superlative());
       System.out.println("Expected: smallest");
       
       word.setAdjective("mean");
       System.out.println(word.superlative());
       System.out.println("Expected: meanest");
   }
}