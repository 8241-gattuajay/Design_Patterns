package ObserverPattern;

public class HumidityDisplay implements Observer{
    private float humidity;
    @Override
    public void update(float temparature, float humidity) {
        this.humidity=humidity;
        display();
    }
    public void display(){
        System.out.println("Current Humidity : " +humidity+" %");
    }
}
