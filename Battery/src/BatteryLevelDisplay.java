public class BatteryLevelDisplay implements Observer {
    // 상태를 관찰하는 기능 -> Observer 라고 한다.
    private Battery battery;


    public BatteryLevelDisplay(Battery battery){
        this.battery = battery;
    }
    public void update(){
        int level = battery.getLevel();
        System.out.println("level: " + level);
    };
}
