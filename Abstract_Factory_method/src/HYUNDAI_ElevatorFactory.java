public class HYUNDAI_ElevatorFactory extends ElevatorAbstractFactory{
    @Override
    public Motor createMotor() {
        return new HYUNDAI_Motor();
    }

    @Override
    public Door createDoor() {
        return new HYUNDAI_Door();
    }

    @Override
    public Lamp createLamp() {
        return new HYUNDAI_Lamp();
    }

    @Override
    public Elevator createElevator() {
        return new HYUNDAI_Elevator();
    }
}
