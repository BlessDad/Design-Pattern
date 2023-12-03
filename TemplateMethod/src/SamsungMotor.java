public class SamsungMotor extends Motor{

    public SamsungMotor(Door door) {
        super(door);
    }


    @Override
    protected void moveMotor(Direction direction) {
        moveSamsungMotor(direction);
    }

    private void moveSamsungMotor(Direction direction){
        System.out.println("SamsungMotor Initiated to " + direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
