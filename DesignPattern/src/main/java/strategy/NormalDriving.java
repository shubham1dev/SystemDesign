package strategy;

public class NormalDriving implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("This is Normal Driving Mode");
    }
}
