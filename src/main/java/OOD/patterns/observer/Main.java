package OOD.patterns.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer display = new WindowsDisplay(weatherStation);
        Observer newDisplay = new WindowsDisplay(weatherStation);
        weatherStation.setTemperature(15);

    }
}
