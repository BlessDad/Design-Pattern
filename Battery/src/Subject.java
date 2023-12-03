import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> obs = new ArrayList<Observer>();
    public void attach(Observer ob){
        obs.add(ob);
    }
    public void notifyObservers(){
        for (Observer ob: obs)
            ob.update();
    }
}
