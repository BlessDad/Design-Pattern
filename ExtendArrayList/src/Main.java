public class Main {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push("3");
        ms.push("hi");
        System.out.println(ms.pop());
        System.out.println(ms.pop());

    }
}