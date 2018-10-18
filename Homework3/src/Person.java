
public class Person {

	private int age;
	private String name;
	
    /**
     * Constructs a new person with the given name and age
     * updated for hw 5
     * @param theName the name of this Person object
     * @param theAge the age of this Person object
     */
    public Person (String theName, int theAge) 
    {
    	name = theName;
    	age = theAge;
    	
    	//name
    	if(name.equals("John Jacob Jingleheimer Schmidt"))
    	{
    		name = "John Smith";
    	}
    	
    	//age
    	if(age < 0)
    	{
    		age = 0;
    	}
    	else if(age > 99)
    	{
    		age = 99;
    	}
    }

    /**
     * Gets the name of this Person
     * @return the name of this person
     */
    public String getName() 
    {
    	if(name.equals("John Jacob Jingleheimer Schmidt"))
    	{
    		name = "John Smith";
    	}
    	return name;
    }

    /**
     * Gets the age of this Person
     * @return this presons age
     */
    public int getAge()
    {
    	//age
    	if(age < 0)
    	{
    		age = 0;
    	}
    	else if(age > 99)
    	{
    		age = 99;
    	}
        return age;
    }

    /**
     * Sets the new name for this Person
     * @param newName the new name for this Person
     */
    public void setName(String newName) 
    {
    	name = newName;
    }

    /**
     * Adds one to this Person's age
     */
    public void haveBirthday()
    {
    	age = age + 1;
    	
    	if(age > 99)
    	{
    		age = 99;
    	}
    }
}
