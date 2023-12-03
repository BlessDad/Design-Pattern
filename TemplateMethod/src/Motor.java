public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;

    protected void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    protected MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public Motor(Door door) {
        this.door = door;
    }


    public void move(Direction direction) {
        if (getMotorStatus() == MotorStatus.MOVING) return;
        if (this.door.getDoorStatus() == DoorStatus.OPENED) door.close();
        moveMotor(direction);
    }

    protected abstract void moveMotor(Direction direction);
}
