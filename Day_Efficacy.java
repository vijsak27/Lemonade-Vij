//calculate the daily efficacy as a decimal to be multiplied by the profit for the day

public class Day_Efficacy{
	private double price;
	private double weather;
	
	public double calcWeather(){
		double[] weathers = {0.70, 0.75, 0.80, 0.85, 0.90, 0.95, 1.00};
		String[] weather_names = {"Cloudy, 50 degrees", "Cloudy, 70 degrees", "Partly Cloudy, 60 degrees", "Partly Cloudy, 70 degrees", "Partly Cloudy, 80 degrees", "Sunny, 70 degrees", "Sunny, 80 degrees"};
		int randomNum = (int)(Math.random()* 7);
		String return_weather[] = {weathers[randomNum], weather_names[randomNum]}; //will need to Inter.int_parse() on return_weather[0]
		return return_weather[];
	}
	
	public double day_efficacy(double weather, double price, double recipe_efficacy){
		double ideal_price = 0.67;
		double per_diff = (Maths.abs(ideal_price-price)/(ideal_price));
		double price_for_calc = (1.0-per_diff);
		
		return ((weather+price_for_calc+recipe_efficacy)/3.0);
	}

}
