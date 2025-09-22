//calculate the daily efficacy as a decimal to be multiplied by the profit for the day

public class Day_Efficacy{
	private double price;
	private double weather;
	
	public double calcWeather(){
		double[] weathers = {0.70, 0.75, 0.80, 0.85. 0.90, 0.95, 1.00};
		int randomNum = (int)(Math.random()* 7);
		return weathers[randomNum];
	}
	
	public double day_efficacy(double weather, double price, double recipe_efficacy){
		double ideal_price = 0.67;
		double per_diff = (Maths.abs(ideal_price-price)/(ideal_price));
		double price_for_calc = (1.0-per_diff);
		
		return ((weather+price_for_calc+recipe_efficacy)/3.0);
	}

}
