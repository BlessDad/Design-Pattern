public class TPMS extends DecoratorCar{
    public TPMS(Car car) {
        super(car);
    }
    @Override
    public int cost(){
        System.out.println("Add TPMS: 100");
        return super.car.cost() + 100;
    }
}
