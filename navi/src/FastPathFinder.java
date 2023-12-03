public class FastPathFinder extends PathFinder {
    @Override
    public Path pathFinder(Coordinate start, Coordinate dest) {
        return new Path(start, dest);
    }
}
