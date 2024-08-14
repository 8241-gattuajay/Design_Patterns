package ObserverPattern;
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        TemparatureDisplay temparatureDisplay = new TemparatureDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();
        weatherData.registerObserver(temparatureDisplay);
        weatherData.registerObserver(humidityDisplay);
        weatherData.setMeasurements(25.5f,65.0f);
        weatherData.setMeasurements(27.0f,70.0f);
    }
}