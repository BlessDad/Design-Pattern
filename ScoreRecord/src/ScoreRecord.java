import javax.security.auth.Subject;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<Integer>();
    private ObserverManager omg = new ObserverManager();

    public void attach(Observer o){
        omg.attach(o);
    }

    public void detach(Observer o){
        omg.detach(o);
    }

    public void addScore(int score){
        scores.add(score);
        omg.notifyObservers();
    }

    public List<Integer> getScoreRecord(){
        return scores;
    }
}
