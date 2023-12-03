import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MInMaxView extends Observer{
    private ScoreRecord scoreRecord;
    public MInMaxView(ScoreRecord scoreRecord){
        this.scoreRecord = scoreRecord;
    }


    public void update(){
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScores(record);
    }

    public void displayScores(List<Integer> record){
        int min = Collections.min(record);
        int max = Collections.max(record);

        System.out.println("Min: " + min + "Max: " + max);
    }

}
