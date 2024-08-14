package ObserverPattern;

public class TemparatureDisplay implements Observer{
    private float temparature;
    @Override
    public void update(float temparature, float humidity) {
        this.temparature=temparature;
        display();
    }
    public void display(){
        System.out.println("Current Temp : " +temparature+" celsius");
    }
}
