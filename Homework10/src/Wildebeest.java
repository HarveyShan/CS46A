
/**
 * @author probl
 *
 */
public class Wildebeest {
	public static final int NOT_HUNGRY = 5;
	public static final int SOMEWHAT_HUNGRY = 2;
	public static final int HUNGRY = 1;
	public static final int VERY_HUNGRY = 4;
	
	private int state;
	
	/**
	 * cons
	 */
	public Wildebeest()
	{
		state = VERY_HUNGRY;
	}
	
	/**
	 * @return state the state 
	 */
	public int getState()
	{
		return state;
	}
	
	/**
	 * 
	 */
	public void travel()
	{
		if(state == VERY_HUNGRY)
		{
			state = VERY_HUNGRY;
		}
		
		else if(state == NOT_HUNGRY)
		{
			state = SOMEWHAT_HUNGRY;
		}
		
		else if(state == SOMEWHAT_HUNGRY)
		{
			state = HUNGRY;
		}
		
		else if(state == HUNGRY)
		{
			state = VERY_HUNGRY;
		}
	}
	
	
	/**
	 * @return null
	 */
	public String getHungerLevel()
	{
		String hungryLevel = "Not hungry";
		
		if(state == 1)
		{
			hungryLevel = "Hungry";
		}
		
		else if (state == 2)
		{
			hungryLevel = "Somewhat hungry";
		}
		
		else if(state == 4)
		{
			hungryLevel ="Very hungry";
		}
		
		else if(state == 5)
		{
			hungryLevel ="Not hungry";
		}
		
		return hungryLevel;
	}
	
	
	/**
	 * 
	 */
	public void seeFood()
	{
		if(state == HUNGRY)
		{
			state = SOMEWHAT_HUNGRY;
		}
		
		else if(state == VERY_HUNGRY)
		{
			state = HUNGRY;
		}
		
		else if(state == SOMEWHAT_HUNGRY)
		{
			state = NOT_HUNGRY;
		}
	}
}
