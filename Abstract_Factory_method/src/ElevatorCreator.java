public class ElevatorCreator {
    public static Elevator assembleElevator(ElevatorAbstractFactory factory){
        Elevator elevator = factory.createElevator();

        Motor motor = factory.createMotor();
        Door door = factory.createDoor();
        Lamp lamp = factory.createLamp();

        elevator.setMotor(motor);
        motor.setDoor(door);
        elevator.setLamp(lamp);


        return elevator;
    }
}
