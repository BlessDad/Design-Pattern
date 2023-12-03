import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private ArrayList<String> list;
    public MyStack(){
        this.list = new ArrayList<String>();
    }
    public void push (String item){
        list.add(item);
    }
    public String pop(){
        return list.remove(list.size() - 1);
    }


}
