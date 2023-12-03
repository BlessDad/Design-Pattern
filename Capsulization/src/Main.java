public class Main {
    public static void main(String[] args) {
        MyCapsule stack = new MyCapsule(10);
        // 사이즈가 10인 스택을 생성했다.
        stack.push(300);
        stack.push(30);
        stack.pop();

        System.out.println(stack.pop());
    }
}