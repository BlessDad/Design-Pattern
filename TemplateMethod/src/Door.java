public class Door {
    private DoorStatus doorStatus;
    public Door(){
        doorStatus = DoorStatus.CLOSED;
        // 초기에는 닫혀있는 상태
    }

    public void open(){
        doorStatus = DoorStatus.OPENED;
    }

    public void close(){
        doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus(){
        return doorStatus;
    }

}
