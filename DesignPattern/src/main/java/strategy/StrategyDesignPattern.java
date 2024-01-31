package strategy;

public class StrategyDesignPattern {

    public static void main(String []args) {

        System.out.println("Strategy Design Pattern");
        DrivingStrategy sportsDriving = new SportDriving();
        DrivingStrategy normalDriving = new NormalDriving();

        Vehicle lambo = new SportVehicle(sportsDriving);
        Vehicle bus = new PassengerVehicle(normalDriving);
        Vehicle thar = new OffroadVehicle(sportsDriving);

        lambo.drive();
        bus.drive();
        thar.drive();

    }

}
