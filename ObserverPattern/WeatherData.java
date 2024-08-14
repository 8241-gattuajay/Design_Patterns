package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temparature;
    private float humidity;

    public WeatherData() {
        observers= new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(temparature,humidity);
        }
    }

    public void setMeasurements(float temparature, float humidity){
        this.temparature=temparature;
        this.humidity=humidity;
        notifyObservers();
    }
}
