public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyQueue queue = new MyQueue();
        queue.addQueue("hi my name..");
        queue.addQueue("is hyunjun");
        System.out.println(queue.removeQueue());
        System.out.println(queue.peekQueue());
        System.out.println(queue.removeQueue());
    }
}