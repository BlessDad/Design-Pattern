public class Navi {
    public Path findPath(Coordinate dest) {
        Gps gps = new CheapGps();
        Screen screen = new SDScreen();
        PathFinder pathFinder = new SlowPathFinder();
        Map map = new SmallMap();
        screen.drawMap(map);
        Coordinate currentLocation = gps.findCurrentocation();
        Path path = pathFinder.pathFinder(currentLocation, dest);
        return path;
    }
}
