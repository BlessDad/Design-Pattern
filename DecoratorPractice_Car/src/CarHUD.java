public class CarHUD extends CarDecorator{
    public CarHUD(Car car) {

        super(car);
        System.out.println("HUD 가격은 300만원입니다.");
    }

    @Override
    public int CalculateCost(){

        return (super.CalculateCost() + 3000000);

    }


}
