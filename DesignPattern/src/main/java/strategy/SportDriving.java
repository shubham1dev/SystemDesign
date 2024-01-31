package strategy;

public class SportDriving implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("This is Sports Mode");
    }
}
