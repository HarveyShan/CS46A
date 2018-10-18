public class WorkingWithStrings
{
    public static void main(String[] args)
    {
        String word =  "sweethearT"; 
        //do not change the line above here
        //add your code between here

        //and here
        System.out.println(word.toLowerCase());
        System.out.println(word.length());
        
        String stepOne = word.replace("s","$");
        System.out.println(stepOne);
        
        String step2 = stepOne.replace("e", "3");
        System.out.println(step2);
        
        String step3 = step2.replace("a", "4");
        System.out.println(step3);
        
        System.out.println("original word: " + word); // do not change this line
        
    }
}