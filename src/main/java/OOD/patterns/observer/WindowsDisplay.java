package OOD.patterns.observer;

public class WindowsDisplay implements Observer {

    WeatherStation weatherStation;

    public WindowsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.add(this);
    }

    @Override
    public void update() {
        display();
    }

    public void display() {
        System.out.println("New data on a window" +  weatherStation.getTemperature());
    }
}
