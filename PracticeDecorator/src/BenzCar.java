public class BenzCar implements Car{

    public BenzCar(){
        System.out.println("3?");
    }

    @Override
    public int cost() {
        System.out.println("Benz_basic 500");
        return 500;
    }
}
