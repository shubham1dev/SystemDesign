package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{

    List<Observer> observers;
    int temperature;

    public WeatherStation(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for(Observer observer: observers){
            observer.update();
        }

    }

    @Override
    public void setData(int temperature) {

        this.temperature =temperature;
        notifyObservers();
    }

    @Override
    public int getData() {
        return temperature;
    }
}
