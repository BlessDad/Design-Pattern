public class AppleFactory {
    private static AppleFactory instance = null;
    private AppleFactory(){};
    public static AppleFactory getInstance(){
        if (instance == null) instance = new AppleFactory();
        return instance;
    }
    public Apple getApple(String kind) {
        Apple apple = null;
        if (kind.equals("Busa")) apple = new Busa();
        else if (kind.equals("Hongro")) apple = new Hongro();
        else if (kind.equals("Hongok")) apple = new Hongok();
        return apple;
    }
}
