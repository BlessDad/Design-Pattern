public class Restaurant {
    public void ServingApple(){

        AppleFactory factory = AppleFactory.getInstance();
        Apple apple = factory.getApple("Busa");
        apple.wash();
        apple.peel();
        apple.slice();



    }
}
