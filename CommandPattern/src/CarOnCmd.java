public class CarOnCmd implements Command{
    private Car car = new Car();
    @Override
    public void execute(){
        car.turnOn();
    }
}
