public class ADAS extends DecoratorCar{
    public ADAS(Car car) {
        super(car);
    }
    @Override
    public int cost(){
        System.out.println("Add ADAS: 5");
        return super.car.cost() + 5;
    }
}
