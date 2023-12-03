public abstract class NaviGoF {
    public Path findPath(Coordinate dest){
        Gps gps = getGps();
        Screen screen = getScreen();
        PathFinder pathFinder = getPathFinder();
        Map map = getMap();
        screen.drawMap(map);
        Coordinate currentLocation = gps.findCurrentocation();
        Path path = pathFinder.pathFinder(currentLocation, dest);
        return path;

    };

    protected abstract Gps getGps();
    protected abstract Screen getScreen();
    protected abstract PathFinder getPathFinder();
    protected abstract Map getMap();
    }
