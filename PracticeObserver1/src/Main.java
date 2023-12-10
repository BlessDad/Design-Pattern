public class Main {
    public static void main(String[] args) {
        Observer manager = new Observer();
        // 옵저버 관리 매니저 생성

        Vector vector = new Vector(manager);
        vector.attach(new displayX(vector));
        vector.attach(new SensorX(vector));

        vector.moveX();
        vector.moveX();
        vector.moveX();
        vector.moveX();
        vector.moveX();
        vector.moveX();
        vector.moveX();



    }
}