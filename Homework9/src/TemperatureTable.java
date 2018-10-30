
public class TemperatureTable {
	
	private int [] [] temperatures;
	
	public TemperatureTable(String nameOfCity, int[][] monthTemp)
	{
		temperatures = monthTemp;
	}
	
	public int last()
	{
		return temperatures[temperatures.length-1]   [temperatures[temperatures.length-1].length-1];
	}
}
