
public class LifeInsurance {
//  The basic cost for one year of life insurance for a man is $1000. For a woman it is $750. 
//	Certain factors can raise or lower the cost. 
//	If the person is less than 30, the cost is decreased by 10%. 
//	If the person smokes, the cost is increased by 50%. 
//	If the person lives in New York City or Los Angeles, the cost increases by $100.
//	Execute the increase or decreases in the order given. Sex, age, smokes, lives

	public char gender;
	public int age;
	public String smoke;
	public String location;
	
	public LifeInsurance(char theGender, int theAge, String theSmoke, String theLocation)
	{
		gender = theGender;
		age = theAge;
		smoke = theSmoke;
		location = theLocation;
	}
	
	public double getInsurance()
	{
		double insurance = 0;
		//get basic insurance
		if(gender == 'M')
		{
			insurance = 1000;
		}
		else if(gender == 'F')
		{
			insurance = 750;
		}
		else 
		{
			System.out.println("You did not enter a valid gender");
		}
		
		//get age influence
		if(age < 30)
		{
			insurance = insurance - insurance * 0.1;
		}
		
		//if the person smokes
		
		if(smoke.equals("Yes"))
		{
			insurance = insurance + insurance * 0.5;
		}

		//location 
		if(location.equals("New York") || location.equalsIgnoreCase("Los Angeles"))
		{
			insurance = insurance + 100;
		}
		return insurance;
	}

	
	public static void main(String[] args) {
		LifeInsurance test = new LifeInsurance('F', 25, "No", "New York" );
//		test.getInsurance();
		System.out.println(test.getInsurance());
		
	}
}
