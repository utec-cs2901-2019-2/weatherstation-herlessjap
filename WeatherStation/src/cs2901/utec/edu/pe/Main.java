package cs2901.utec.edu.pe;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCoditions currentCoditions = new CurrentCoditions(weatherData);
        weatherData.setData(10,10,10);
        currentCoditions.update(20,20,20);
    }
}
