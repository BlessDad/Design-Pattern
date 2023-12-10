import java.awt.*;

public class Sunroof extends DecoratorCar{

    public Sunroof(Car car) {
        super(car);
        System.out.println("1?");

    }
    @Override
    public int cost(){
        System.out.println("Add Sunroof: 50");
        return super.cost() + 50;

    }
}
