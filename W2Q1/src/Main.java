public class Main {

    public static void main(String[] args) throws InterruptedException {
        A a1 = new A();
        A a2 = new A();
        Thread thread1 = new Thread(() -> {
            a1.run("thread1");
        });

        Thread thread2 = new Thread(() -> {
            a1.print("thread2");
        });

        thread1.start();
        thread2.start();
    }
}
