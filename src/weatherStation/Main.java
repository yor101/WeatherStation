package weatherStation;

public class Main {

    public static void main(String[] args) {
	WeatherData weatherData = new WeatherData();

	CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

	StatisticsDisplay display = new StatisticsDisplay(weatherData);
	ForecastDisplay forecast = new ForecastDisplay(weatherData);



	weatherData.setMeasurements(80,65,30.4f);
	weatherData.setMeasurements(82,70,29.2f);
	weatherData.setMeasurements(78,90,29.2f);


    }
}
