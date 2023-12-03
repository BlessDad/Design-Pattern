import java.util.ArrayList;

public class MyCapsule {
    private int top;
    // 정보 은닉은 하지 않음
    // 캡슐화는 되어 있으나 정보 은닉은 되어있지 않음
    private ArrayList<Integer> itemArray;
    private int size;
    public MyCapsule(int size){
        this.size = size;
        itemArray = new ArrayList<Integer>(size);
    }
    private boolean isEmpty(){
        return itemArray.isEmpty();
    }
    public void push(int item){
        if (isFull()) System.out.println("FULL");
        else itemArray.add(item);
    }

    public boolean isFull(){
        return itemArray.size() >= this.size;
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("EMPTY");
            return -1; // 정상적이지 않다는 게지.
        }
        else return itemArray.remove(itemArray.size() - 1);
    }
}

