public class CarSunroof extends CarDecorator{
    public CarSunroof(Car car) {
        super(car);
        System.out.println("썬루프 가격은 200만원입니다.");
    }

    @Override
    public int CalculateCost(){

        return (super.CalculateCost() + 2000000);

    }


}
