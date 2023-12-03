public class BasicHyundai extends Car{
    // 기본적인 현대 차.

    public BasicHyundai(){
        System.out.println("현대차 입니다!");
        System.out.println("기본 가격은 5000만원 입니다.");
    }
    @Override
    public int CalculateCost() {

        return (50000000);

    }
}
