public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(300);
        Box box2 = new Box(500);
        Socks socks = new Socks(400); // 300g 의 양말
        Trousers trousers = new Trousers(500);
        box1.addItem(socks);
        box1.addItem(trousers);
        box2.addItem(box1);

        System.out.println(box1.price());
        System.out.println(box2.price());

        Box box3 = new Box(100);
        box3.addItem(box2);
        box3.addItem(new Gold(2000));
        System.out.println(box3.price());


    }
}