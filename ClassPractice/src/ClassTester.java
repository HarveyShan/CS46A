
public class ClassTester {
	
	    public static void main(String[] args)
	    {
	        Class student = new Class("Maria");       
	        System.out.println(student.getName());
	        System.out.println("Expected: Maria");
	        
	        student.addScore(95);
	        System.out.println(student.getTotalScore());
	        System.out.println("Expected: 95.0");
	        
	        student.addScore(100);
	        System.out.println(student.getTotalScore());
	        System.out.println("Expected: 195.0");
	        
	        student.setName("Jose");
	        System.out.println(student.getName());
	        System.out.println("Expected: Jose");
	    }
	    
}
