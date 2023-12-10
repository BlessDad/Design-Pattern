public class ACC extends DecoratorCar{
    public ACC(Car car) {
        super(car);
        System.out.println("2?");
    }
    @Override
    public int cost(){
        System.out.println("Add ACC: 30");
        return super.cost()+30;
    }
}
