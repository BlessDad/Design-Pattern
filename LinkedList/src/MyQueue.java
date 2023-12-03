import java.util.LinkedList;
import java.util.Stack;

public class MyQueue {
    private Stack<String> list;
    // 연관 관계로...
    public MyQueue(){
        list = new Stack<String>();
    }
    public void addQueue(String element){
        list.add(element);
    }

    public String removeQueue(){
        return list.pop();
    }

    public String peekQueue(){
        return list.peek();
    }
}
