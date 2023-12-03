public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Battery battery = new Battery(subject);
        BatteryLevelDisplay display = new BatteryLevelDisplay(battery);
        LowBatteryWarning warning = new LowBatteryWarning(battery);

        battery.attach(display);
        battery.attach(warning);

        battery.consume(20);
        battery.consume(50);
        battery.consume(20);

    }
}