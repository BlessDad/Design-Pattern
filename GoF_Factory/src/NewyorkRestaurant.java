public class NewyorkRestaurant extends Restaurant{

    // 사실상 얘가 팩토리 기능을 수행하는 클래스라고 볼 수 있다.

    @Override
    public Apple getApple(String kind) {
        return new Busa();
    }
}
