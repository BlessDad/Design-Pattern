public class CarACC extends CarDecorator{
    public CarACC(Car car) {
        super(car);
        System.out.println("ACC 기능 추가, 가격은 100만원입니다.");
    }

    @Override
    public int CalculateCost(){

        return (super.CalculateCost() + 1000000);

    }

}
