import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        Observer d1 = (Observer) new DataSheetView(scoreRecord, 3);
        DataSheetView d2 = new DataSheetView(scoreRecord, 5);
        DataSheetView d3 = new DataSheetView(scoreRecord, 1);
        DataSheetView d4 = new DataSheetView(scoreRecord, 2);
        DataSheetView d5 = new DataSheetView(scoreRecord, 0);
        MInMaxView m = new MInMaxView(scoreRecord);
        scoreRecord.attach(m);
        scoreRecord.attach(d1);
        scoreRecord.attach(d2);
        scoreRecord.attach(d3);
        scoreRecord.attach(d4);
        scoreRecord.attach(d5);



        scoreRecord.addScore(30);
        scoreRecord.addScore(40);
        scoreRecord.addScore(50);
        scoreRecord.addScore(60);
        scoreRecord.addScore(90);
    }
}