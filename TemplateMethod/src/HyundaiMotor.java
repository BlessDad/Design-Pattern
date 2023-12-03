public class HyundaiMotor extends Motor {


    public HyundaiMotor(Door door){
        super(door);
    }

    @Override
    public void moveMotor(Direction direction) {
        moveHyundaiMotor(direction);
    }

    private void moveHyundaiMotor(Direction direction){
        System.out.println("Hyundai Motor Initiated to " + direction);
        setMotorStatus(MotorStatus.MOVING);
    }




}
