package OOD.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
    List<Observer> storage = new ArrayList<>();
    int temperature;

    @Override
    public void add(Observer observer) {
        storage.add(observer);
    }

    @Override
    public Observer remove(Observer observer) {
        storage.remove(observer);
        return observer;
    }

    @Override
    public void notifyAboutChange() {
        storage.forEach(Observer::update);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAboutChange();
    }
}
