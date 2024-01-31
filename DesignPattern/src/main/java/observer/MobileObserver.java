package observer;

public class MobileObserver implements Observer{

    Observable observable;

    public MobileObserver(Observable observable){
        this.observable=observable;
    }
    @Override
    public void update() {

        System.out.println("Mobile is recording Current temperature as "+observable.getData());

    }
}
