public class HYUNDAI_Lamp extends Lamp{
    @Override
    protected void doLight(Direction lampStatus) {
        System.out.println("HYUNDAI LAMP IS ON: " + lampStatus);
    }
}
