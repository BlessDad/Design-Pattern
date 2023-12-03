public class LG_ElevatorFactory extends ElevatorAbstractFactory{
    @Override
    public Motor createMotor() {
        return new LG_Motor();
    }

    @Override
    public Door createDoor() {
        return new LG_Door();
    }

    @Override
    public Lamp createLamp() {
        return new LG_Lamp();
    }

    @Override
    public Elevator createElevator() {
        return new LG_Elevator();
    }
}
