public abstract class Motor {
    private Door door;
    private MotorState motorState;
    public void setDoor(Door door){
        this.door = door;
        this.motorState = motorState.STOPPED;
    }

    public MotorState getMotorStatus(){
        return motorState;
    }

    public void move(Direction direction){
        if (getMotorStatus() == motorState.MOVING) return;
        if (door.getDoorState() == DoorState.OPENED) door.close();
        moveMotor(direction);
        motorState = motorState.MOVING;

    }

    protected abstract void moveMotor (Direction direction);

}
