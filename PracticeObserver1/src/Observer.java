import java.util.ArrayList;

public class Observer {
    private ArrayList<ObserverX> obs = new ArrayList<>();
    public void addOb(ObserverX ob){
        obs.add(ob);
    }
    public void update(){
        for (ObserverX o: obs){
            o.update();
        }
    }
}
