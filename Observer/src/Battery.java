public class Battery {
    private int charge = 100;
    // 배터리 100
    public void displayBattery(){
        System.out.println("Battery: " + this.charge);
    }

    public void displayWarning(){
        System.out.println("Warning! Under " + this.charge);

    }
}
