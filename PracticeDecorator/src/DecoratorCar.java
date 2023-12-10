public class DecoratorCar implements Car{
    protected Car car;
    public DecoratorCar(Car car){
        this.car = car;
    }
    @Override
    public int cost() {
        return car.cost();
    }
}
