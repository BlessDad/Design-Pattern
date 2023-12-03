public class BasicKIA extends Car{

    public BasicKIA(){
        System.out.println("이것은 기아차입니다!");
    }
    @Override
    public int CalculateCost() {
        System.out.println("기본 가격은 4000만원입니다.");
        return(40000000);
    }
}
