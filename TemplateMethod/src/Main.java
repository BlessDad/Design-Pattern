public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        Motor lgmotor = new LgMotor(door);
        lgmotor.move(Direction.UP);
        Motor samsung = new SamsungMotor(door);
        samsung.move(Direction.DOWN);
    }
}