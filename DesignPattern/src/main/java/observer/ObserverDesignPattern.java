package observer;

public class ObserverDesignPattern {

    public static void main(String []args) throws InterruptedException {

        WeatherStation weatherStation = new WeatherStation();
        Observer mobileObserver = new MobileObserver(weatherStation);
        Observer laptopObserver = new LaptopObserver(weatherStation);
        weatherStation.addObserver(mobileObserver);
        weatherStation.addObserver(laptopObserver);

        int i=0;
        while(i++<10){

            Thread.sleep(1000);
            weatherStation.setData(i);
        }

    }

}
