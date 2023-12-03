import java.util.ArrayList;
import java.util.List;

public class ObserverManager {
    private List<Observer> obs = new ArrayList<Observer>();
    public void attach (Observer o){
        // 추가해주는 메서드.
        obs.add(o);
    }

    public void detach(Observer o){
        obs.remove(o);
    }

    public void notifyObservers(){
        for (Observer o : obs){
            o.update();
        }
    }
}
