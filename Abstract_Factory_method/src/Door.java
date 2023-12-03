public abstract class Door {
    private DoorState doorState;
    public Door(){
        // 생성시 자동으로 열리게 설정됨
        doorState = DoorState.OPENED;
    }

    public DoorState getDoorState(){
        return this.doorState;
    }

    public void close(){
        if (getDoorState() == DoorState.CLOSED) return;
        doClose();
        doorState = DoorState.CLOSED;
    }

    protected abstract void doClose();

    public void open(){
        if (getDoorState() == DoorState.OPENED) return;
        doOpen();
        doorState = DoorState.OPENED;
    }

    protected abstract void doOpen();

    public DoorState getDoorStatus() {
        return this.doorState;
    }
}
