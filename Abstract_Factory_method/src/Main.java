public class Main {
    public static void main(String[] args) {
        ElevatorAbstractFactory factory = new Samsung_ElevatorFactory();
        Elevator elevator = ElevatorCreator.assembleElevator(factory);
        elevator.move(Direction.UP);

    }
}