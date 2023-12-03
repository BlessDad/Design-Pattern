import java.util.List;

public class DataSheetView extends Observer{
    private int viewCount;
    private ScoreRecord scoreRecord;
    public DataSheetView(ScoreRecord sr, int viewcount) {

        this.scoreRecord = sr;
        this.viewCount = viewcount;
    }
    @Override
    public void update(){
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScores(record, viewCount);

    }

    public void displayScores(List<Integer> record, int viewCount){
        System.out.println("List of " + viewCount + "entries");
        for (int i = 0; i< viewCount && i < record.size(); i++){
            System.out.println(record.get(i));

        }
    }
}
