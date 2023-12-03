import java.util.Random;

public class ExpensiveGps extends Gps {
    @Override
    public Coordinate findCurrentocation() {
        Random random = new Random(); // 랜덤 객체 생성
        random.setSeed(System.currentTimeMillis());
        return new Coordinate(random.nextDouble()*90, random.nextDouble()*180);
    }
}
