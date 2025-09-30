public class Weather{
	
	public String[] weatherUpdate{
	double weatherVals = {0.60,0.75,0.80,0.85,0.90, 0.95,1.00};
	String weatherDescp = {"60 degrees, rain", "60 degrees, cloudy", "70 degrees, cloudy", "70 degrees, partly sunny", "70 degrees, sunny","80 degrees, sunny", "90 degrees, sunny"};
	int rand = (int)(Math.random() * 7);
	return {weatherDescp[rand],weatherVals[rand]};
	
	}

}
