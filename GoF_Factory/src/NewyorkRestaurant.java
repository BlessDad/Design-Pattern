public class NewyorkRestaurant extends Restaurant{
    @Override
    public Apple getApple(String kind) {
        return new Busa();
    }
}
