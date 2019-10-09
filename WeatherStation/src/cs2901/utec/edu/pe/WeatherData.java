package cs2901.utec.edu.pe;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    int temperature;
    int humidity;
    int pressure;
    private List<Observer> observers;

    WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i=0; i<observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public int getTemperature(){
        return temperature;
    }

    public int getHumidity(){
        return humidity;
    }

    public int getPressure(){
        return pressure;
    }

    public void setData(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void measurementsChanged(){
        notifyObserver();
    }
}
