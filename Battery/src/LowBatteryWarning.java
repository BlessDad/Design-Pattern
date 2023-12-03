public class LowBatteryWarning implements Observer {
    private Battery battery;
    private final int LOW_BATTERY = 30;
    public LowBatteryWarning(Battery battery){
        this.battery = battery;
    }
    public void update(){
        int level = battery.getLevel();
        if (level < LOW_BATTERY) {
            System.out.println("Warning: " + level);
        }
    };
}
