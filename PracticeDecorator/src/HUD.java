public class HUD extends DecoratorCar{
    public HUD(Car car) {
        super(car);
    }
    @Override
    public int cost(){
        System.out.println("Add HUD: 20");
        return super.cost() + 20;
    }
}
