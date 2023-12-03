public class SlowPathFinder extends PathFinder {
    @Override
    public Path pathFinder(Coordinate start, Coordinate dest) {
        try {
            Thread.sleep(1000); //1초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new Path(start, dest);
    }
}
