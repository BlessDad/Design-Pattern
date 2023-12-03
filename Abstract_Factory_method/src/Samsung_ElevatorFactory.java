public class Samsung_ElevatorFactory extends ElevatorAbstractFactory{
    @Override
    public Motor createMotor() {
        return new Samsung_Motor();
    }

    @Override
    public Door createDoor() {
        return new Samsung_Door();
    }

    @Override
    public Lamp createLamp() {
        return new Samsung_Lamp();
    }

    @Override
    public Elevator createElevator() {
        return new Samsung_Elevator();
    }
}
