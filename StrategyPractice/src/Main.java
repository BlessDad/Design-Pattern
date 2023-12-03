public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Robot tv = new TaekwonV("태권브이");
        tv.setMove(new Flying());
        tv.move();
    }
}