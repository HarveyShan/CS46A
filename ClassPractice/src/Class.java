
public class Class {
	
	private String name;
	private double totalScore;
	
	public Class(String theName)
	{
		name = theName;
		totalScore = 0;
	}
	
	public void addScore(double addScore)
	{
		totalScore = totalScore + addScore;
	}
	
	public double getTotalScore()
	{
		return totalScore;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}

}