public class CarDecorator extends Car{
    private Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public int CalculateCost() {
        return (car.CalculateCost());
    }
}
