package observer;

public class LaptopObserver implements Observer{

    Observable observable;

    public LaptopObserver(Observable observable){
        this.observable=observable;
    }
    @Override
    public void update() {
        System.out.println("Laptop is recording the current temperature as "+observable.getData());
    }
}
