package cs2901.utec.edu.pe;

public class CurrentCoditions implements Observer {
    private int temperature;
    private int humidity;
    private int pressure;
    private Subject subject;

    CurrentCoditions(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }


    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        System.out.println("Temperature: " +temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
