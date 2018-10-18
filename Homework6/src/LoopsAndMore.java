
public class LoopsAndMore {
	public int sumEveryThird(int limit)
    {
        int sum = 0;
        for (int x=0; x<limit; x+=3)
        {
            if (x%5 == 0)
            {
                x=x;
            }
            else 
            {
                sum = sum+x;
                
            }
        }
        return sum;
    }
	
	
	
	public String printJava(int count)
	{
		String javas = "";
		for(int i = 0; i < count; i++) {
			javas = javas + " Java ";
		}
		return javas;
	}
	
	
	public int largestPowerOf2(int target)
	{
		int p2 = -1;
        for (int x= 0; x <= target; x++)
        {
	        if(Math.pow(2, x) < target && Math.pow(2, x+1) >= target)
	        {
	        	p2 = (int)Math.pow(2, x);
	        }
	        
	        else if(2 > target)
	        {
	        	p2 = -1;
	        }
	        
        }
		
        return p2 ;
	}
	
//    public static void main(String[] args)
//    {
//        LoopsAndMore loops = new LoopsAndMore();
//        System.out.println(loops.sumEveryThird(36));
//        System.out.println("Expected: 153");
//        System.out.println(loops.sumEveryThird(21));
//        System.out.println("Expected: 48");
//        System.out.println(loops.sumEveryThird(3));
//        System.out.println("Expected: 0");
//        System.out.println(loops.sumEveryThird(-4));
//        System.out.println("Expected: 0");
//        
//        System.out.println(loops.printJava(5) );
//        System.out.println("Expected: Java Java Java Java Java");
//        System.out.println(loops.printJava(1) );
//        System.out.println("Expected: Java");
//        System.out.println("No output: " + loops.printJava(-2) );
//        System.out.println("Expected: ");
//        
//        System.out.println(loops.largestPowerOf2(5));
//        System.out.println("Expected: 4");
//        System.out.println(loops.largestPowerOf2(16));
//        System.out.println("Expected: 8");
//        System.out.println(loops.largestPowerOf2(2));
//        System.out.println("Expected: 1");
//        System.out.println(loops.largestPowerOf2(1));
//        System.out.println("Expected: -1");
//        System.out.println(loops.largestPowerOf2(-5));
//        System.out.println("Expected: -1");
//    }
}

