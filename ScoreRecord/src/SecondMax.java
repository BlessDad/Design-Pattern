import java.util.List;

public class SecondMax extends Observer{
    // 두번째로 큰걸 보여주자
    private ScoreRecord scoreRecord;

    public SecondMax(ScoreRecord scoreRecord){
        this.scoreRecord = scoreRecord;
    }
    @Override
    public void update(){
        List<Integer> record = scoreRecord.getScoreRecord();
        int max = 0, secondmax = 0;
        for (Integer r: record){
            if (r > max) max =r;
            if (secondmax < max){
                secondmax = r;
            }
        }
        System.out.println("Second max is .. " + secondmax);
    }

}
