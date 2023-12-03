public abstract class NaviFm {
    public Path findPath(Coordinate dest) {
        Gps gps = getGps();
        Screen screen = getScreen();
        PathFinder pathFinder = getPathFinder();
        Map map = getMap();
        screen.drawMap(map);
        Coordinate currentLocation = gps.findCurrentocation();
        Path path = pathFinder.pathFinder(currentLocation, dest);
        return path;
    }

    protected abstract Map getMap();
    protected abstract PathFinder getPathFinder();
    protected abstract Screen getScreen();
    protected abstract Gps getGps();
}
