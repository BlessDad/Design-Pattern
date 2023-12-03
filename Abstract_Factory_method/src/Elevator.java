public class Elevator {
    private Motor motor;
    private Door door;
    private Lamp lamp;

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public void setLamp(Lamp lamp){
        this.lamp = lamp;
    }
    public void move(Direction direction){
        motor.move(direction);
        lamp.doLight(direction);
    }
}
