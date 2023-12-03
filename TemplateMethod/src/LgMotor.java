public class LgMotor extends Motor {

    public LgMotor(Door door){
        super(door);
    }

   public void moveMotor(Direction direction){
        moveLgMotor(direction);
   }

    private void moveLgMotor(Direction direction){
        System.out.println("LG Motor Initiated to " + direction);
        setMotorStatus(MotorStatus.MOVING);
    }




}
