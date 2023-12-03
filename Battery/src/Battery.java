import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Battery{
    private Subject subject;
    private int level = 100;
    public Battery(Subject s){
        this.subject = s;
    }

    public void consume(int amount){
        level -= amount;
        subject.notifyObservers();
    }
    public void attach(Observer ob){
        subject.attach(ob);
    }

    public int getLevel(){
        return level;
    }


}
