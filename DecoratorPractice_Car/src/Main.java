public class Main {
    public static void main(String[] args) {
        Car HyundaiCar = new BasicHyundai();
        CarDecorator addACC = new CarACC(HyundaiCar);
        CarDecorator addACCHUD = new CarHUD(addACC);
        System.out.println("총 가격은 " + addACCHUD.CalculateCost() +"원 입니다.");
    }
}