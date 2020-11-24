package weatherStation;

import SharedInterfaces.Subject;


import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class WeatherData implements Subject {

    private final List<SharedInterfaces.Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<SharedInterfaces.Observer>();
    }

    @Override
    public void registerObserver(SharedInterfaces.Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(SharedInterfaces.Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (SharedInterfaces.Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChange(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }
}
